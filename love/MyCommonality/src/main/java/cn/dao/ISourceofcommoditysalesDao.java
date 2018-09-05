package cn.dao;

import cn.pojo.Sourceofcommoditysales;
import cn.pojo.SourceofcommoditysalesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISourceofcommoditysalesDao {
    int countByExample(SourceofcommoditysalesExample example);

    int deleteByExample(SourceofcommoditysalesExample example);

    int deleteByPrimaryKey(Integer socsid);

    int insert(Sourceofcommoditysales record);

    int insertSelective(Sourceofcommoditysales record);

    List<Sourceofcommoditysales> selectByExample(SourceofcommoditysalesExample example);

    Sourceofcommoditysales selectByPrimaryKey(Integer socsid);

    int updateByExampleSelective(@Param("record") Sourceofcommoditysales record, @Param("example") SourceofcommoditysalesExample example);

    int updateByExample(@Param("record") Sourceofcommoditysales record, @Param("example") SourceofcommoditysalesExample example);

    int updateByPrimaryKeySelective(Sourceofcommoditysales record);

    int updateByPrimaryKey(Sourceofcommoditysales record);
}