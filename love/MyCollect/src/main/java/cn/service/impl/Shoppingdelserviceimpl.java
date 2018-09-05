package cn.service.impl;

import cn.dao.IShoppingtrolleyDao;
import cn.service.Shoppingdelservice;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sd")
public class Shoppingdelserviceimpl implements Shoppingdelservice {
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isd;

    public IShoppingtrolleyDao getIsd() {
        return isd;
    }

    public void setIsd(IShoppingtrolleyDao isd) {
        this.isd = isd;
    }

    @Override
    public String delshopping(Integer comid,Integer userid) {
        String del = "";
        if (comid == null){
            del = "您没有可删除的商品";
        }else{
            int delshopping = isd.delshopping(comid,userid);
            if (delshopping > 0){
                del = "删除成功";
            }else{
                del = "删除失败";
            }
        }
        return JSON.toJSONString(del);
    }
}
