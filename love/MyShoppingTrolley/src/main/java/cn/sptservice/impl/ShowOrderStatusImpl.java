package cn.sptservice.impl;

import cn.dao.ICommodityDao;
import cn.dao.IOrderformDao;
import cn.dao.IUseriDao;
import cn.pojo.Commodity;
import cn.pojo.Orderform;
import cn.pojo.Useri;
import cn.sptservice.ShowOrderStatus;
import cn.sptservice.sptpojo.OfAndUserAndCd;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sos")
public class ShowOrderStatusImpl implements ShowOrderStatus {
    private static Logger logger = Logger.getLogger(ShowOrderStatus.class);
    @Resource(name = "IOrderformDao")
    private IOrderformDao iof;
    @Resource(name = "IUseriDao")
    private IUseriDao iud;
    @Resource(name = "ICommodityDao")
    private ICommodityDao icd ;

    public IOrderformDao getIof() {
        return iof;
    }

    public void setIof(IOrderformDao iof) {
        this.iof = iof;
    }

    public IUseriDao getIud() {
        return iud;
    }

    public void setIud(IUseriDao iud) {
        this.iud = iud;
    }

    public ICommodityDao getIcd() {
        return icd;
    }

    public void setIcd(ICommodityDao icd) {
        this.icd = icd;
    }



    @Override
    public String showOne(Integer ofshippinginformation, Integer ofstate) {
        logger.info("getOrderForm方法的用户id" + ofshippinginformation);
        String information = "";
        List<Orderform> orderforms = iof.selectByExample(ofshippinginformation,ofstate);
        logger.info("是否有此订单" + orderforms);
        if (orderforms != null){
            information = JSON.toJSONString(orderforms);
        }
        return information;
    }

    @Override
    public String showAll(Integer ofshippinginformation) {
        logger.info("getOrderForm方法的用户id" + ofshippinginformation);
        String information = "";
        List<Orderform> orderforms = iof.selectByExampleone(ofshippinginformation);
        logger.info("是否有此订单" + orderforms);
        if (orderforms != null){
            information = JSON.toJSONString(orderforms);
        }
        return information;
    }

    @Override
    public String showDetails(int ofid) {
        OfAndUserAndCd oauac = new OfAndUserAndCd();
        logger.info("getOrderForm方法的用户id" + ofid);
        String information = "";
        Orderform orderforms = iof.selectByExampleDetails(ofid);
        logger.info("是否有此订单" + orderforms);
        if (orderforms != null){
            Useri of1 = iud.getOf(orderforms.getOfshippinginformation());
            if (of1.getUserreceivingaddress() != null){
                Commodity of = icd.getOf(orderforms.getOfcdid());
                oauac.setUserreceivingaddress(of1.getUserreceivingaddress());
                oauac.setComcommodityprices(of.getComcommodityprices());
                oauac.setComname(of.getComname());
                oauac.setCompicture(of.getCompicture());
                oauac.setOforder(orderforms.getOforder());
                oauac.setOfordernumber(orderforms.getOfordernumber());
                oauac.setOforderprice(orderforms.getOforderprice());
                oauac.setOfordertime(orderforms.getOfordertime());
                information = JSON.toJSONString(oauac);
            }else {
                return "110";
            }

        }
        return information;
    }
}
