package cn.service.impl;

import cn.dao.SearchStoreInformation;
import cn.pojo.Commodity;
import cn.pojo.Goodsclass;
import cn.pojo.Goodsdetails;
import cn.service.GetAllCommodityService;
import cn.service.GetAllGoodclassService;
import cn.service.GetAllGooddetailsService;
import cn.service.SearchResult;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;

@Service("sr")
public class SearchResultImpl implements SearchResult {
    @Resource(name = "SearchStoreInformation")
    private SearchStoreInformation ssi;

    public SearchStoreInformation getSsi() {
        return ssi;
    }

    public void setSsi(SearchStoreInformation ssi) {
        this.ssi = ssi;
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

    @Override
    public int result(String name) {
        int num = 0;
        List list = gacs.getAllCommditys(name);
        if (list != null){
            num = 1;
        }else if (list == null){
            num = 0;
        }
        return num;
    }
}
