package cn.dao;

import cn.pojo.Notefiltering;
import cn.pojo.NotefilteringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INotefilteringDao {
    int countByExample(NotefilteringExample example);

    int deleteByExample(NotefilteringExample example);

    int deleteByPrimaryKey(Integer nfid);

    int insert(Notefiltering record);

    int insertSelective(Notefiltering record);

    List<Notefiltering> selectByExample(NotefilteringExample example);

    Notefiltering selectByPrimaryKey(Integer nfid);

    int updateByExampleSelective(@Param("record") Notefiltering record, @Param("example") NotefilteringExample example);

    int updateByExample(@Param("record") Notefiltering record, @Param("example") NotefilteringExample example);

    int updateByPrimaryKeySelective(Notefiltering record);

    int updateByPrimaryKey(Notefiltering record);
}