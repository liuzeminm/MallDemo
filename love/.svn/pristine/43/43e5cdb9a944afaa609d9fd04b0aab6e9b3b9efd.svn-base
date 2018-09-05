package cn.dao;

import cn.pojo.Notesdraft;
import cn.pojo.NotesdraftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INotesdraftDao {
    int countByExample(NotesdraftExample example);

    int deleteByExample(NotesdraftExample example);

    int deleteByPrimaryKey(Integer ndid);

    int insert(Notesdraft record);

    int insertSelective(Notesdraft record);

    List<Notesdraft> selectByExample(NotesdraftExample example);

    Notesdraft selectByPrimaryKey(Integer ndid);

    int updateByExampleSelective(@Param("record") Notesdraft record, @Param("example") NotesdraftExample example);

    int updateByExample(@Param("record") Notesdraft record, @Param("example") NotesdraftExample example);

    int updateByPrimaryKeySelective(Notesdraft record);

    int updateByPrimaryKey(Notesdraft record);
}