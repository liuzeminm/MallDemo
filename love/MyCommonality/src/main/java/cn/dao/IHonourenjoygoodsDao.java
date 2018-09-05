package cn.dao;

import cn.pojo.Honourenjoygoods;
import cn.pojo.HonourenjoygoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IHonourenjoygoodsDao {
    int countByExample(HonourenjoygoodsExample example);

    int deleteByExample(HonourenjoygoodsExample example);

    int deleteByPrimaryKey(Integer hegid);

    int insert(Honourenjoygoods record);

    int insertSelective(Honourenjoygoods record);

    List<Honourenjoygoods> selectByExample(HonourenjoygoodsExample example);

    Honourenjoygoods selectByPrimaryKey(Integer hegid);

    int updateByExampleSelective(@Param("record") Honourenjoygoods record, @Param("example") HonourenjoygoodsExample example);

    int updateByExample(@Param("record") Honourenjoygoods record, @Param("example") HonourenjoygoodsExample example);

    int updateByPrimaryKeySelective(Honourenjoygoods record);

    int updateByPrimaryKey(Honourenjoygoods record);
}