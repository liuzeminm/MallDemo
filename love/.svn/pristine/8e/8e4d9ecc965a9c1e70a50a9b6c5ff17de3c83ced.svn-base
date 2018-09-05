package cn.dao;

import cn.pojo.Collect;
import cn.pojo.CollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICollectDao {
    int countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int deleteByPrimaryKey(Integer collectid);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    Collect selectByPrimaryKey(Integer collectid);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}