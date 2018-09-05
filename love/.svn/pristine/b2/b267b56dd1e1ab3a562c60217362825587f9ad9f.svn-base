package cn.dao;

import cn.pojo.Notesorting;
import cn.pojo.NotesortingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INotesortingDao {
    int countByExample(NotesortingExample example);

    int deleteByExample(NotesortingExample example);

    int deleteByPrimaryKey(Integer nsid);

    int insert(Notesorting record);

    int insertSelective(Notesorting record);

    List<Notesorting> selectByExample(NotesortingExample example);

    Notesorting selectByPrimaryKey(Integer nsid);

    int updateByExampleSelective(@Param("record") Notesorting record, @Param("example") NotesortingExample example);

    int updateByExample(@Param("record") Notesorting record, @Param("example") NotesortingExample example);

    int updateByPrimaryKeySelective(Notesorting record);

    int updateByPrimaryKey(Notesorting record);
}