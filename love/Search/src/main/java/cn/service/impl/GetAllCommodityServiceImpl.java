package cn.service.impl;

import cn.dao.SearchStoreInformation;
import cn.pojo.Commodity;
import cn.service.GetAllCommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("gacs")
public class GetAllCommodityServiceImpl implements GetAllCommodityService {
    @Resource(name = "SearchStoreInformation")
    private SearchStoreInformation ssi;

    public SearchStoreInformation getSsi() {
        return ssi;
    }

    public void setSsi(SearchStoreInformation ssi) {
        this.ssi = ssi;
    }

    @Override
    public List<Commodity> getAllCommditys(String name) {
        return ssi.getAllCommodity(name);
    }
}
