package cn.dao;

import cn.pojo.Activity;
import cn.pojo.ActivityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IActivityDao {
    int countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer actid);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer actid);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}