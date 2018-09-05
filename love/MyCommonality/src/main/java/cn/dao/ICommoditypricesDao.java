package cn.dao;

import cn.pojo.Commodityprices;
import cn.pojo.CommoditypricesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICommoditypricesDao {
    int countByExample(CommoditypricesExample example);

    int deleteByExample(CommoditypricesExample example);

    int deleteByPrimaryKey(Integer cpid);

    int insert(Commodityprices record);

    int insertSelective(Commodityprices record);

    List<Commodityprices> selectByExample(CommoditypricesExample example);

    Commodityprices selectByPrimaryKey(Integer cpid);

    int updateByExampleSelective(@Param("record") Commodityprices record, @Param("example") CommoditypricesExample example);

    int updateByExample(@Param("record") Commodityprices record, @Param("example") CommoditypricesExample example);

    int updateByPrimaryKeySelective(Commodityprices record);

    int updateByPrimaryKey(Commodityprices record);
}