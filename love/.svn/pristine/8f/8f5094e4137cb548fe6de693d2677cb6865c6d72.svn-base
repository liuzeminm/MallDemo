package cn.dao;

import cn.pojo.Like;
import cn.pojo.LikeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ILikeDao {
    int countByExample(LikeExample example);

    int deleteByExample(LikeExample example);

    int deleteByPrimaryKey(Integer likeid);

    int insert(Like record);

    int insertSelective(Like record);

    List<Like> selectByExample(LikeExample example);

    Like selectByPrimaryKey(Integer likeid);

    int updateByExampleSelective(@Param("record") Like record, @Param("example") LikeExample example);

    int updateByExample(@Param("record") Like record, @Param("example") LikeExample example);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}