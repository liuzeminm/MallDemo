package cn.service.impl;

import cn.dao.SearchStoreInformation;
import cn.pojo.Commodity;
import cn.pojo.Goodsclass;
import cn.pojo.Goodsdetails;
import cn.service.*;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("sss")
public class SearchServiceImpl implements SearchService{
    @Resource(name = "SearchStoreInformation")
    private SearchStoreInformation ss;

    public SearchStoreInformation getSs() {
        return ss;
    }

    public void setSs(SearchStoreInformation ss) {
        this.ss = ss;
    }
    @Resource(name = "sr")
    private SearchResult sr;

    public SearchResult getSr() {
        return sr;
    }
    @Resource(name = "gags")
    private GetAllGoodclassService gags;
    @Resource(name = "gad")
    private GetAllGooddetailsService gad;
    @Resource(name = "gacs")
    private GetAllCommodityService gacs;

    public GetAllGoodclassService getGags() {
        return gags;
    }

    public void setGags(GetAllGoodclassService gags) {
        this.gags = gags;
    }

    public GetAllGooddetailsService getGad() {
        return gad;
    }

    public void setGad(GetAllGooddetailsService gad) {
        this.gad = gad;
    }

    public GetAllCommodityService getGacs() {
        return gacs;
    }

    public void setGacs(GetAllCommodityService gacs) {
        this.gacs = gacs;
    }
    public void setSr(SearchResult sr) {
        this.sr = sr;
    }


    public List getAll(String name) {
        String answer = null;
        List listAll = new ArrayList();
        long start = System.currentTimeMillis();
        List<Commodity> commodities = gacs.getAllCommditys(name);
        long time = System.currentTimeMillis() - start;
        String times = "查询用时" + time + "ms";
        if (commodities.size() != 0) {
            listAll.add(0, times);
            listAll.add(1, commodities);
        }else {
            listAll.add(0,times);
            answer = "查询结果为空";
            listAll.add(1,answer);
        }
        return listAll;
    }
}
