package cn.dao;

import cn.pojo.Identification;
import cn.pojo.IdentificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IdentificationMapper {
    int countByExample(IdentificationExample example);

    int deleteByExample(IdentificationExample example);

    int deleteByPrimaryKey(Integer ifid);

    int insert(Identification record);

    int insertSelective(Identification record);

    List<Identification> selectByExample(IdentificationExample example);

    Identification selectByPrimaryKey(Integer ifid);

    int updateByExampleSelective(@Param("record") Identification record, @Param("example") IdentificationExample example);

    int updateByExample(@Param("record") Identification record, @Param("example") IdentificationExample example);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);
}