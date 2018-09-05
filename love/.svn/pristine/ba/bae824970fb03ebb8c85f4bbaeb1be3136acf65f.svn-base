package cn.dao;

import cn.pojo.Sortord;
import cn.pojo.SortordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISortordDao {
    int countByExample(SortordExample example);

    int deleteByExample(SortordExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(Sortord record);

    int insertSelective(Sortord record);

    List<Sortord> selectByExample(SortordExample example);

    Sortord selectByPrimaryKey(Integer sdid);

    int updateByExampleSelective(@Param("record") Sortord record, @Param("example") SortordExample example);

    int updateByExample(@Param("record") Sortord record, @Param("example") SortordExample example);

    int updateByPrimaryKeySelective(Sortord record);

    int updateByPrimaryKey(Sortord record);
}