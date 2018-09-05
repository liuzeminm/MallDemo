package cn.dao;

import cn.pojo.Brand;
import cn.pojo.BrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBrandDao {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer bdid);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Integer bdid);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}