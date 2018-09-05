package cn.service.impl;

import cn.dao.ICommodityDao;
import cn.pojo.Commodity;
import cn.service.SelPinformationService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sps")
public class SelPinformationServiceImpl implements SelPinformationService {
    @Resource(name = "ICommodityDao")
    private ICommodityDao  icd;

    public ICommodityDao getIcd() {
        return icd;
    }

    public void setIcd(ICommodityDao icd) {
        this.icd = icd;
    }

    public String selPinformation(int informationid) {
        System.out.println(informationid+"****************");
        String s = "";
        if (informationid >0){
            Commodity commodity = icd.selPinformation(informationid);
                if (commodity == null){
                    s = "抱歉,您查询的商品不存在";
                }
                    s = JSON.toJSONString(commodity);
                    System.out.println(s+"*-*-*-*-*-*-*-*-*");
                        return s;
        }
         s = " 输入错误,请您从新输入";
      return s;
    }
}
