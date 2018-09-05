package cn.service.impl;

import cn.dao.IShoppingtrolleyDao;
import cn.pojo.Shoppingtrolley;
import cn.service.Shopupdateservice;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("susi")
public class Shopupdateserviceimpl implements Shopupdateservice {
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isd;
    public IShoppingtrolleyDao getIsr() {
        return isr;
    }
    public IShoppingtrolleyDao getIsd() {
        return isd;
    }
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isr;
    public void setIsd(IShoppingtrolleyDao isd) {
        this.isd = isd;
    }
    public void setIsr(IShoppingtrolleyDao isr) {
        this.isr = isr;
    }
    @Override
    public String inserttrolley(Shoppingtrolley sr) {
        String shop = "";
        if (sr == null){
            shop = "您的输入不能为空";
        }else{
            int insertt = isr.inserttrolley(sr);

            if (insertt > 0){
                shop = "加入购物车成功";
            }else{
                shop = "加入失败";
            }
        }
        return JSON.toJSONString(shop);
    }
    @Override
    public int equality(Integer id) {
        int equality = isd.equality(id);
        return equality;
    }

    @Override
    public int count(Integer id) {
        int count = isd.count(id);
        return count;
    }

    @Override
    public String quantity(Integer id) {
        String quan = "";
        if (equality(id) != 0){
            int quantity = isd.quantity(count(id),id);
            if (quantity > 0){
                quan = "添加购物车成功";
            }else{
                quan = "添加失败";
            }
        }
        return JSON.toJSONString(quan);
    }
}
