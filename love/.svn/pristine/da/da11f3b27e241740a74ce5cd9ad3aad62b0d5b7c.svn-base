package cn.dao;

import cn.pojo.Label;
import cn.pojo.LabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ILabelDao {
    int countByExample(LabelExample example);

    int deleteByExample(LabelExample example);

    int deleteByPrimaryKey(Integer labid);

    int insert(Label record);

    int insertSelective(Label record);

    List<Label> selectByExample(LabelExample example);

    Label selectByPrimaryKey(Integer labid);

    int updateByExampleSelective(@Param("record") Label record, @Param("example") LabelExample example);

    int updateByExample(@Param("record") Label record, @Param("example") LabelExample example);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);
}