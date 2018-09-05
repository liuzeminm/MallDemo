package cn.dao;

import cn.pojo.Search;
import cn.pojo.SearchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISearchDao {
    int countByExample(SearchExample example);

    int deleteByExample(SearchExample example);

    int deleteByPrimaryKey(Integer shid);

    int insert(Search record);

    int insertSelective(Search record);

    List<Search> selectByExample(SearchExample example);

    Search selectByPrimaryKey(Integer shid);

    int updateByExampleSelective(@Param("record") Search record, @Param("example") SearchExample example);

    int updateByExample(@Param("record") Search record, @Param("example") SearchExample example);

    int updateByPrimaryKeySelective(Search record);

    int updateByPrimaryKey(Search record);
}