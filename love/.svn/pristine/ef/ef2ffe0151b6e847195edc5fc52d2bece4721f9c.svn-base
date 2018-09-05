package cn.service.impl;

import cn.dao.IShoppingtrolleyDao;
import cn.service.ShopdelAllservice;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("sasi")
public class ShopdelAllserviceimpl implements ShopdelAllservice {
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isrd;

    public IShoppingtrolleyDao getIsrd() {
        return isrd;
    }

    public void setIsrd(IShoppingtrolleyDao isrd) {
        this.isrd = isrd;
    }

    @Override
    public String delshopAll(Integer userid) {
        String del = "";
        if (userid == null){
            del = "您没有商品可以删除";
        }else{
            int i = isrd.delshopAll(userid);
            if (i > 0){
                del = "您的购物车已清空";
            }else{
                del = "删除失败";
            }
        }
        return JSON.toJSONString(del);
    }
}
