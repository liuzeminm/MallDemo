package cn.service.impl;

import cn.dao.SearchStoreInformation;
import cn.pojo.Goodsdetails;
import cn.service.GetAllGooddetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("gad")
public class GetAllGooddetailsServiceImpl implements GetAllGooddetailsService {
    @Resource(name = "SearchStoreInformation")
    private SearchStoreInformation ssi;

    public SearchStoreInformation getSsi() {
        return ssi;
    }

    public void setSsi(SearchStoreInformation ssi) {
        this.ssi = ssi;
    }

    @Override
    public List<Goodsdetails> getAllGooddetails(String name) {
        return ssi.getAllGoodsdetails(name);
    }
}
