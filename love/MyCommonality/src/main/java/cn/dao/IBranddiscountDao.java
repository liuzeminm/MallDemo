package cn.dao;

import cn.pojo.Branddiscount;
import cn.pojo.BranddiscountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBranddiscountDao {
    int countByExample(BranddiscountExample example);

    int deleteByExample(BranddiscountExample example);

    int deleteByPrimaryKey(Integer ddid);

    int insert(Branddiscount record);

    int insertSelective(Branddiscount record);

    List<Branddiscount> selectByExample(BranddiscountExample example);

    Branddiscount selectByPrimaryKey(Integer ddid);

    int updateByExampleSelective(@Param("record") Branddiscount record, @Param("example") BranddiscountExample example);

    int updateByExample(@Param("record") Branddiscount record, @Param("example") BranddiscountExample example);

    int updateByPrimaryKeySelective(Branddiscount record);

    int updateByPrimaryKey(Branddiscount record);
}