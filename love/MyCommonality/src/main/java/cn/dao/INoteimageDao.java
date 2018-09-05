package cn.dao;

import cn.pojo.Noteimage;
import cn.pojo.NoteimageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INoteimageDao {
    int countByExample(NoteimageExample example);

    int deleteByExample(NoteimageExample example);

    int deleteByPrimaryKey(Integer niid);

    int insert(Noteimage record);

    int insertSelective(Noteimage record);

    List<Noteimage> selectByExample(NoteimageExample example);

    Noteimage selectByPrimaryKey(Integer niid);

    int updateByExampleSelective(@Param("record") Noteimage record, @Param("example") NoteimageExample example);

    int updateByExample(@Param("record") Noteimage record, @Param("example") NoteimageExample example);

    int updateByPrimaryKeySelective(Noteimage record);

    int updateByPrimaryKey(Noteimage record);
}