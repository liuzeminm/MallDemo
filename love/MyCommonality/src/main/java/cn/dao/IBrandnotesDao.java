package cn.dao;

import cn.pojo.Brandnotes;
import cn.pojo.BrandnotesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBrandnotesDao {
    int countByExample(BrandnotesExample example);

    int deleteByExample(BrandnotesExample example);

    int deleteByPrimaryKey(Integer bnid);

    int insert(Brandnotes record);

    int insertSelective(Brandnotes record);

    List<Brandnotes> selectByExample(BrandnotesExample example);

    Brandnotes selectByPrimaryKey(Integer bnid);

    int updateByExampleSelective(@Param("record") Brandnotes record, @Param("example") BrandnotesExample example);

    int updateByExample(@Param("record") Brandnotes record, @Param("example") BrandnotesExample example);

    int updateByPrimaryKeySelective(Brandnotes record);

    int updateByPrimaryKey(Brandnotes record);
}