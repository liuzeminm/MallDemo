package cn.sptservice.impl;

import cn.dao.IShoppingtrolleyDao;
import cn.pojo.Shoppingtrolley;
import cn.shopping.Shoppingfinal;
import cn.sptservice.ShoppingTrolleyService;
import com.alibaba.fastjson.JSON;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;

public class ShoppingTrolleyServiceImpl implements ShoppingTrolleyService {
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isd;

    @Resource(name = "jedisPool")
    private JedisPool jedispool;

    private Jedis jedis;

    public Jedis getJedis() {
        return jedis = jedispool.getResource();
    }



    public JedisPool getJedispool() {
        return jedispool;
    }

    public void setJedispool(JedisPool jedispool) {
        this.jedispool = jedispool;
    }

    public IShoppingtrolleyDao getIsd() {
        return isd;
    }

    public void setIsd(IShoppingtrolleyDao isd) {
        this.isd = isd;
    }

    @Override
    public String addCommodity(Shoppingtrolley st,int flage) {
        String flge = "0";
        if (flage == 1) {
            flge = "" + isd.insertSelective(st);
        } else if (flage == 2) {
            flge = "" + isd.deleteByPrimaryKeyone(st.getStuserid(), st.getStname());
        } else {
            flge = "" + isd.deleteByPrimaryKey(st.getStuserid());

        }


        return flge;
    }
}
