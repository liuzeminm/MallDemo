package cn.dao;

import cn.pojo.Savethat;
import cn.pojo.SavethatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISavethatDao {
    int countByExample(SavethatExample example);

    int deleteByExample(SavethatExample example);

    int deleteByPrimaryKey(Integer stid);

    int insert(Savethat record);

    int insertSelective(Savethat record);

    List<Savethat> selectByExample(SavethatExample example);

    Savethat selectByPrimaryKey(Integer stid);

    int updateByExampleSelective(@Param("record") Savethat record, @Param("example") SavethatExample example);

    int updateByExample(@Param("record") Savethat record, @Param("example") SavethatExample example);

    int updateByPrimaryKeySelective(Savethat record);

    int updateByPrimaryKey(Savethat record);
}