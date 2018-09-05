package cn.service.impl;

import cn.dao.IShoppingtrolleyDao;
import cn.pojo.Shoppingtrolley;
import cn.service.Showshowservice;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("sssi")
public class Showshowsericeimpl implements Showshowservice {
    @Resource(name = "IShoppingtrolleyDao")
    private IShoppingtrolleyDao isd;

    public IShoppingtrolleyDao getIsd() {
        return isd;
    }

    public void setIsd(IShoppingtrolleyDao isd) {
        this.isd = isd;
    }

    @Override
    public String shoppingshow(Integer uid) {
        String show = "";
        if (isd.shoppingshow(uid) == null) {
            show = "您的购物车空空如也";
        }else{
            List<Shoppingtrolley> shoppingshow = isd.shoppingshow(uid);
            show = JSON.toJSONString(shoppingshow);
        }
        return show;
    }
}
