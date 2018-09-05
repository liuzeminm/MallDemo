package cn.dao;

import cn.pojo.Classificationgoods;
import cn.pojo.ClassificationgoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IClassificationgoodsDao {
    int countByExample(ClassificationgoodsExample example);

    int deleteByExample(ClassificationgoodsExample example);

    int deleteByPrimaryKey(Integer cgid);

    int insert(Classificationgoods record);

    int insertSelective(Classificationgoods record);

    List<Classificationgoods> selectByExample(ClassificationgoodsExample example);

    Classificationgoods selectByPrimaryKey(Integer cgid);

    int updateByExampleSelective(@Param("record") Classificationgoods record, @Param("example") ClassificationgoodsExample example);

    int updateByExample(@Param("record") Classificationgoods record, @Param("example") ClassificationgoodsExample example);

    int updateByPrimaryKeySelective(Classificationgoods record);

    int updateByPrimaryKey(Classificationgoods record);
}