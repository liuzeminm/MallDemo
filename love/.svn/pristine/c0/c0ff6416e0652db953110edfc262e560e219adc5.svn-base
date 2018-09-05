package cn.dao;

import cn.pojo.Attention;
import cn.pojo.AttentionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAttentionDao {
    int countByExample(AttentionExample example);

    int deleteByExample(AttentionExample example);

    int deleteByPrimaryKey(Integer attentionid);

    int insert(Attention record);

    int insertSelective(Attention record);

    List<Attention> selectByExample(AttentionExample example);

    Attention selectByPrimaryKey(Integer attentionid);

    int updateByExampleSelective(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByExample(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}