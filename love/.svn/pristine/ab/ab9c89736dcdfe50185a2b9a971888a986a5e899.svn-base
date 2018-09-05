package cn.service.impl;

import cn.dao.IGoodsdetailsDao;
import cn.pojo.Goodsdetails;
import cn.service.SelIgoodsdetailsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
//ajax查询下面的分支
@Service("sgs")
public class SelIgoodsdetailsServiceImpl implements SelIgoodsdetailsService {
    @Resource(name = "IGoodsdetailsDao")
    private IGoodsdetailsDao  igdd;

    public IGoodsdetailsDao getIgdd() {
        return igdd;
    }

    public void setIgdd(IGoodsdetailsDao igdd) {
        this.igdd = igdd;
    }

    public List<Goodsdetails> getgoodsdetails(int gs) {
        List<Goodsdetails> getgoodsdetails = igdd.getgoodsdetails(gs);
        return getgoodsdetails;
    }
}
