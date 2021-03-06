package cn.service.impl;

import cn.dao.IUseriDao;
import cn.pojo.Useri;

import cn.service.LoginService;
import cn.util.encryption.JavaWebToken;
import cn.util.httpApiDemo.IndustrySMS;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("login")
public class LoginServiceImpl implements LoginService {
    private Logger logger = Logger.getLogger(LoginServiceImpl.class);
    @Resource(name = "IUseriDao")
    private IUseriDao imd;
    @Resource(name = "jedis")
    private JedisPool jedispool;
    private Jedis jedis;


    public JedisPool getJedispool() {
        return jedispool;
    }

    public void setJedispool(JedisPool jedispool) {
        this.jedispool = jedispool;
    }

    public Jedis getJedis() {
        return jedis = jedispool.getResource();
    }


    Map<String,Object> encryption = new HashMap<String,Object>();
    Map<String,Object> usertoken = new HashMap<String,Object>();

    public IUseriDao getImd() {
        return imd;
    }

    public void setImd(IUseriDao imd) {
        this.imd = imd;
    }



    String phone = null;
    String s = null;

    //Jedis jedis = jedispool.getResource();
    @Override
    /**
     * 通过账号密码登陆
     */
    public String login(String phone, String password) {
        logger.info(jedispool);
        Useri useri1 = imd.selectByPrimaryKey(phone, password);
        if (useri1 != null) {
            String userid = useri1.getUserid() + "";
            encryption.put("userid", userid);
            encryption.put("time",System.currentTimeMillis() + "");
            encryption.put("pasttime",System.currentTimeMillis() + (1000*60*60*12*30) + "");
            logger.info(encryption.get(userid) + "------------------------------");
            String javaWebToken = JavaWebToken.createJavaWebToken(encryption);
            logger.info(javaWebToken + "-----------------------------------");
            getJedis().set(phone + "user",javaWebToken);
            usertoken.put("user",useri1);
            usertoken.put("usertoken",javaWebToken);
            String token = JSON.toJSONString(usertoken);
            return token;
        } else {
            return JSON.toJSONString("105");
        }
    }


    /**
     * 通过手机号登陆，验证手机号是否存在
     */
    public String loginbyPhone(String phone , String verification){
        if(phone != null){
            String regExp = "^((13[0-9])|(15[0-3, 5-9])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
            Pattern p = Pattern.compile(regExp);
            Matcher m = p.matcher(phone);
            if(m.matches()){
                try {
                    s = getJedis().get(phone);
                }catch (Exception e){
                    logger.info(e);
                    return JSON.toJSONString("105");
                }finally {
                    getJedis().close();
                }
                if(s != null){
                    if(s.equals(verification)) {
                        if (imd.selectByPrimaryKeyone(phone) != null) {
                            Useri useri = imd.selectByPrimaryKeyone(phone);
                            String userid = useri.getUserid() + "";
                            encryption.put("userid", userid);
                            encryption.put("time",System.currentTimeMillis() + "");
                            encryption.put("pasttime",System.currentTimeMillis() + (1000*60*60*12*30) + "");
                            logger.info(encryption.get(userid) + "------------------------------");
                            String javaWebToken = JavaWebToken.createJavaWebToken(encryption);
                            logger.info(javaWebToken + "-----------------------------------");
                            try{
                                getJedis().set(phone + "user",javaWebToken);
                                getJedis().expire(phone + "user",60*60*12*30);
                            }catch (Exception e){
                                logger.info(e);
                                return JSON.toJSONString("105");
                            }finally {
                                getJedis().close();
                            }

                            usertoken.put("user",useri);
                            usertoken.put("usertoken",javaWebToken);
                            String token = JSON.toJSONString(usertoken);
                            return token;
                        } else {

                            return JSON.toJSONString("101");
                        }
                    }else{
                        return JSON.toJSONString("102");
                    }
                }else {
                    return JSON.toJSONString("106");
                }

            }else {
                return  JSON.toJSONString("103");
            }

        }else{
            return  JSON.toJSONString("104");
        }
    }

    /**
     * 获取验证码
     * @param verification
     */
    public String RegVerify(String verification) {
        phone = verification;
        try {
            getJedis().set(verification,IndustrySMS.execute(verification));
            getJedis().expire(verification,60*2);

        }catch (Exception e){
            logger.info(e);
            return JSON.toJSONString("105");
        }finally {
            getJedis().close();
        }
        return JSON.toJSONString("100");
    }
    
    public String loginbyToken(String phone , String useridtoken){
        String s = null;
        if (useridtoken != null){
            try{
                 s = getJedis().get(phone  + "user");
                logger.info(s + "**********token*************");
            }catch (Exception e){
                logger.info(e);
                return JSON.toJSONString("105");
            }finally {
                getJedis().close();
            }
            Map<String, Object> stringObjectMap = JavaWebToken.parserJavaWebToken(useridtoken);
            Map<String, Object> stringObjectMap1 = JavaWebToken.parserJavaWebToken(s);
            logger.info(stringObjectMap1.get("pasttime") + "**********token1*************");
            String pasttime = (String) stringObjectMap1.get("pasttime");
            long l = Long.parseLong(pasttime);
            String  userid1 = (String) stringObjectMap.get("userid");
            String userid = (String) stringObjectMap1.get("userid");
            if (l > System.currentTimeMillis() && userid1.equals(userid) ){
                Useri useri = imd.selectByPrimaryKeyone(phone);
                usertoken.put("user",useri);
                usertoken.put("usertoken",useridtoken);
                String token = JSON.toJSONString(usertoken);
                return token;
            }else {
                return "101";
            }
        }else {
            return "102";
        }
    }
    public String updateuser(String newpwd2,int userid){
        return  "" + imd.updatepwd(newpwd2,userid );
    }
}
