package cn.service.impl;

import cn.dao.IUseriDao;
import cn.pojo.Useri;
import cn.service.RegisterService;
import cn.util.Util;
import cn.util.httpApiDemo.IndustrySMS;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

@Service("Register")
public class RegisterServiceimpl implements RegisterService {
    @Resource(name = "IUseriDao")
    private IUseriDao ui;
    @Resource(name = "jedis")
    private JedisPool jedispool;
    private Jedis jedis;

    public IUseriDao getUi() {
        return ui;
    }

    public void setUi(IUseriDao ui) {
        this.ui = ui;
    }

    public JedisPool getJedispool() {
        return jedispool;
    }

    public void setJedispool(JedisPool jedispool) {
        this.jedispool = jedispool;
    }

    public Jedis getJedis() {
        return jedis = jedispool.getResource();
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }


    /**
     * 手机号注册流程
     *
     * @return
     */
    @Override
    public String Register(String phone) {
        String ret;
        if (phone != null && phone != "") {
            int in = ui .VerifyPhone(phone);
            if (in == 0) {
                try {
                    getJedis().set("pphone",phone);
                    getJedis().set("iphone", IndustrySMS.execute(phone));
                    getJedis().expire("iphone", 60 * 3);
                    System.out.println(phone);
                    return JSON.toJSONString("y");
                } catch (Exception e) {
                    ret = JSON.toJSONString("105");
                } finally {
                    getJedis().close();
                }
            } else {
                ret = JSON.toJSONString("手机号已存在，请重新输入");
            }
        } else {
            ret = JSON.toJSONString("手机号不能为空");
        }
        return ret;
    }

    /**
     * 获取前后台验证码并进行校验
     *
     * @param iptvernum
     * @return
     */
    @Override
    public String Verifynum(String iptvernum) {
        String ret = getJedis().get("iphone");
        System.out.println(ret);
        String verret;
        if (ret.equals(iptvernum)) {
            System.out.println("成功");
            verret = JSON.toJSONString("run");
        } else {
            verret = "验证码错误，请重新输入";
        }
        return verret;
    }

    /**
     * 添加更多个人信息
     * 完成注册
     * @param u
     * @return
     */
    @Override
    public String lnsertinf(Useri u) {
        String sex = u.getUsersex();
        String brith = u.getUserdatebirth();
        String uname = u.getUsername();
        String ret;
        Useri us = new Useri();
        if((sex!= null && sex!="")&& (brith!=null&&brith !="")&&(uname!=null&&uname!="")) {
            us.setUserphone(getJedis().get("pphone"));
            us.setUsersex(sex);
            us.setUserdatebirth(brith);
            us.setUsername(uname);
            int count = ui.ManyInf(us);
            if (count == 0) {
                ret = JSON.toJSONString("no");
            } else {
                String a = ui.SelPwd(getJedis().get("pphone"));
                ret = JSON.toJSONString(a);
            }
        }else{
            ret = "请把信息填写完整";
        }

        return ret;
    }
}

