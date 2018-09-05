package cn.dao;

import cn.pojo.Prerogative;
import cn.pojo.PrerogativeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPrerogativeDao {
    int countByExample(PrerogativeExample example);

    int deleteByExample(PrerogativeExample example);

    int deleteByPrimaryKey(Integer pgid);

    int insert(Prerogative record);

    int insertSelective(Prerogative record);

    List<Prerogative> selectByExample(PrerogativeExample example);

    Prerogative selectByPrimaryKey(Integer pgid);

    int updateByExampleSelective(@Param("record") Prerogative record, @Param("example") PrerogativeExample example);

    int updateByExample(@Param("record") Prerogative record, @Param("example") PrerogativeExample example);

    int updateByPrimaryKeySelective(Prerogative record);

    int updateByPrimaryKey(Prerogative record);
}