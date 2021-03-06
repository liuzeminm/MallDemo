package cn.sptservice.impl;
import cn.dao.ICommodityDao;
import cn.dao.IOrderformDao;
import cn.dao.IShoppingtrolleyDao;
import cn.pojo.Commodity;
import cn.pojo.Orderform;
import cn.shopping.Shoppingfinal;
import cn.sptservice.OrderStatusService;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
@Service("ossi")
public class OrderStatusServiceImpl implements OrderStatusService {
    private static Logger logger = Logger.getLogger(OrderStatusServiceImpl.class);
    @Resource(name = "IOrderformDao")
    private IOrderformDao iof;
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isd;

    @Resource(name = "ICommodityDao")
    private ICommodityDao icd ;
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



    public IOrderformDao getIof() {
        return iof;
    }

    public void setIof(IOrderformDao iof) {
        this.iof = iof;
    }

    public ICommodityDao getIcd() {
        return icd;
    }

    public void setIcd(ICommodityDao icd) {
        this.icd = icd;
    }

    public IShoppingtrolleyDao getIsd() {
        return isd;
    }

    public void setIsd(IShoppingtrolleyDao isd) {
        this.isd = isd;
    }



    @Override
    public String cancellationOfOrder(Integer ofshippinginformation, String serialNumber , String  ofstate) {
        String falg = "0";
        logger.info("cancellationOfOrder方法的订单状态" + ofstate);
        switch (ofstate){
            case "0" :
                int i = iof.deleteByPrimaryKey(ofshippinginformation, serialNumber , 3);
                logger.info("case0" + i);
                falg = i + "";
                return falg;
            case "1" :
                i = iof.deleteByPrimaryKey(ofshippinginformation, serialNumber , 1);
                logger.info("case1" + i);
                falg = i + "";
                return falg;
            case "3" :
                i = iof.deleteByPrimaryKey(ofshippinginformation, serialNumber , 4);
                logger.info("case3" + i);
                falg = i + "";
                return falg;
            default:
                logger.info("falg" + "-------------------"+  falg);
                return falg;
        }
    }



    /**
     *  Commodity commodity = icd.selectByPrimaryKey(1);有问题
     * @return
     */
    @Override
    public String dispose(int ofstate,Double orderprice , int userid , String ordernumber) {
        String flag = "4";
        switch (ofstate + ""){
            case "0" :
                int i = 0;
                if (orderprice < 1){
                    i = iof.deleteByPrimaryKey(userid,ordernumber, 1);
                    flag = i +"";
                }else {
                    flag = "3";
                }
                return flag;
            case "1" :

                i = iof.deleteByPrimaryKey(userid,ordernumber, 2);
                flag = i +"";
                return flag;
            default:
                return flag;
        }
    }

    /**
     * Commodity commodity = icd.selectByPrimaryKey(1);
     * icd.updateByPrimaryKey(commodity.getTentative1() + 1);
     * 需要改
     *
     * @return
     */
    @Override
    public String addOrderForm(int userid,int commodityid,String Ofordernumber) {
        Set<String> keys = null;
        String flge = "0";
        String hget = null;
            long l = System.currentTimeMillis();
            try {
                keys = getJedis().keys("*" + userid);

            }catch (Exception e){

            }finally {
                getJedis().close();
            }
            for (String key : keys) {
                int i = Integer.parseInt(key);
                int i1 = Integer.parseInt(l + "" + userid);
                try {
                    hget = getJedis().hget(Shoppingfinal.ADD_ORDERSTATUS_WAY, Ofordernumber);

                }catch (Exception e){
                    System.err.print(e);
                    return JSON.toJSONString("105");
                }finally {
                    getJedis().close();
                }
                Orderform orderform = JSON.parseObject(hget, Orderform.class);
                if(orderform.getOfordernumber().equals(Ofordernumber) && i < i1){
                    try {
                        getJedis().hdel(Shoppingfinal.ADD_ORDERSTATUS_WAY,key);
                    }catch (Exception e){
                        System.err.print(e);
                        return JSON.toJSONString("105");
                    }finally {
                        getJedis().close();
                    }
                    Commodity commodity = icd.selectByPrimaryKey(commodityid);
                    icd.updateByPrimaryKey(commodity.getTentative1() + 1,commodityid);
                    flge = "" + iof.deleteByPrimaryKey(userid,Ofordernumber, 3);
                    return flge;
                }

            }
        return flge;
    }
    public String addOrder(Orderform of , int number){
        long l = System.currentTimeMillis();
        String l1 = l + "";
        String substring = "4450" + l1.substring(3) + "2542";
        of.setOfordernumber(substring);
        String flge = "0";
        if(number == 1){
            if(of != null){
                logger.info( "用户id "+ "---------------" + of.getOfshippinginformation());
                flge = "" + isd.deleteByPrimaryKey(of.getOfshippinginformation());
                if (!flge.equals("0")){
                    l = System.currentTimeMillis() + 60 * 30 * 1000;
                    try {
                        getJedis().hset(Shoppingfinal.ADD_ORDERSTATUS_WAY,l + "" + of.getOfshippinginformation(),JSON.toJSONString(of));

                    }catch (Exception e){
                        System.err.print(e);
                        return JSON.toJSONString("105");
                    }finally {
                        getJedis().close();
                    }
                    Commodity commodity = icd.selectByPrimaryKey(of.getOfcdid());
                    flge = "" + icd.updateByPrimaryKey(commodity.getTentative1() - 1,1);

                    if (!flge.equals("0")){
                        flge = "" + iof.insert(of);
                    }else {
                        flge = "0";
                    }
                }
            }

        }else {
            if (of != null) {
                logger.info("用户id " + "---------------" + of.getOfshippinginformation());
                l = System.currentTimeMillis() + 60 * 30 * 1000;
                try {
                    getJedis().hset(Shoppingfinal.ADD_ORDERSTATUS_WAY, l + "" + of.getOfshippinginformation(), JSON.toJSONString(of));

                } catch (Exception e) {
                    System.err.print(e);
                    return JSON.toJSONString("105");
                } finally {
                    getJedis().close();
                }
                Commodity commodity = icd.selectByPrimaryKey(of.getOfcdid());
                flge = "" + icd.updateByPrimaryKey(commodity.getTentative1() - 1, 1);

                if (!flge.equals("0")) {
                    flge = "" + iof.insert(of);
                } else {
                    flge = "0";
                }
            }
        }
        return flge;
    }

}
