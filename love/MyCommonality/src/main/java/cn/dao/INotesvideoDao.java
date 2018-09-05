package cn.dao;

import cn.pojo.Notesvideo;
import cn.pojo.NotesvideoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INotesvideoDao {
    int countByExample(NotesvideoExample example);

    int deleteByExample(NotesvideoExample example);

    int deleteByPrimaryKey(Integer noid);

    int insert(Notesvideo record);

    int insertSelective(Notesvideo record);

    List<Notesvideo> selectByExample(NotesvideoExample example);

    Notesvideo selectByPrimaryKey(Integer noid);

    int updateByExampleSelective(@Param("record") Notesvideo record, @Param("example") NotesvideoExample example);

    int updateByExample(@Param("record") Notesvideo record, @Param("example") NotesvideoExample example);

    int updateByPrimaryKeySelective(Notesvideo record);

    int updateByPrimaryKey(Notesvideo record);
}