package cn.dao;

import cn.pojo.Brandgoods;
import cn.pojo.BrandgoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBrandgoodsDao {
    int countByExample(BrandgoodsExample example);

    int deleteByExample(BrandgoodsExample example);

    int deleteByPrimaryKey(Integer bgid);

    int insert(Brandgoods record);

    int insertSelective(Brandgoods record);

    List<Brandgoods> selectByExample(BrandgoodsExample example);

    Brandgoods selectByPrimaryKey(Integer bgid);

    int updateByExampleSelective(@Param("record") Brandgoods record, @Param("example") BrandgoodsExample example);

    int updateByExample(@Param("record") Brandgoods record, @Param("example") BrandgoodsExample example);

    int updateByPrimaryKeySelective(Brandgoods record);

    int updateByPrimaryKey(Brandgoods record);
}