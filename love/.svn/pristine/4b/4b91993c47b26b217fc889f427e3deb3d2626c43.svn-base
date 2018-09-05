package cn.dao;

import cn.pojo.Notecomments;
import cn.pojo.NotecommentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INotecommentsDao {
    int countByExample(NotecommentsExample example);

    int deleteByExample(NotecommentsExample example);

    int deleteByPrimaryKey(Integer ncid);

    int insert(Notecomments record);

    int insertSelective(Notecomments record);

    List<Notecomments> selectByExample(NotecommentsExample example);

    Notecomments selectByPrimaryKey(Integer ncid);

    int updateByExampleSelective(@Param("record") Notecomments record, @Param("example") NotecommentsExample example);

    int updateByExample(@Param("record") Notecomments record, @Param("example") NotecommentsExample example);

    int updateByPrimaryKeySelective(Notecomments record);

    int updateByPrimaryKey(Notecomments record);
}