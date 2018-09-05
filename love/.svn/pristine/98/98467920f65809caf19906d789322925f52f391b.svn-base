package cn.dao;

import cn.pojo.*;
import org.jboss.logging.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("SearchStoreInformation")
public interface SearchStoreInformation {
    // 查询全部商品信息
    List<Commodity> getAllCommodity(@Param String keyword);
    List<Sourceofcommoditysales> getallSourceofcommoditysales(@Param Integer socsmerchant);
    // 查询商品类型
    List<Goodsclass> getAllGoodsclass(@Param String name);
    // 查询对应类型下品牌信息
    List<Goodsdetails> getAllClassDetails(@Param Integer gdstate);
    // 查询对应类下所有商品信息
    List<Commodity> getAllClassCommodity(@Param Integer comclassificationgoods);
    // 查询商品品牌
    List<Goodsdetails> getAllGoodsdetails(@Param String gdname);
    // 查询对应品牌下商品信息
    List<Commodity> getAlldetailsCommodity(@Param Integer combrand);
    List<Goodscomments> getAllGoodscomments(@Param Integer gccommodityid);
    List<Commodityprices> getAllCommodityprices(@Param Integer cpid);
    Classificationgoods getAllClassificationgoods(@Param Integer cgid);

}
