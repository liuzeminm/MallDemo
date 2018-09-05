package cn.service.impl;

import cn.dao.SearchStoreInformation;
import cn.pojo.Goodsclass;
import cn.service.GetAllGoodclassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("gags")
public class GetAllGoodclassServiceImpl implements GetAllGoodclassService {
    @Resource(name = "SearchStoreInformation")
    private SearchStoreInformation ssi;

    public SearchStoreInformation getSsi() {
        return ssi;
    }

    public void setSsi(SearchStoreInformation ssi) {
        this.ssi = ssi;
    }

    @Override
    public List<Goodsclass> getAllGoodClass(String name) {
        return ssi.getAllGoodsclass(name);
    }
}
