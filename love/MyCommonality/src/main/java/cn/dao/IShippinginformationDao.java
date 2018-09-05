package cn.dao;

import cn.pojo.Shippinginformation;
import cn.pojo.ShippinginformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IShippinginformationDao {
    int countByExample(ShippinginformationExample example);

    int deleteByExample(ShippinginformationExample example);

    int deleteByPrimaryKey(Integer siid);

    int insert(Shippinginformation record);

    int insertSelective(Shippinginformation record);

    List<Shippinginformation> selectByExample(ShippinginformationExample example);

    Shippinginformation selectByPrimaryKey(Integer siid);

    int updateByExampleSelective(@Param("record") Shippinginformation record, @Param("example") ShippinginformationExample example);

    int updateByExample(@Param("record") Shippinginformation record, @Param("example") ShippinginformationExample example);

    int updateByPrimaryKeySelective(Shippinginformation record);

    int updateByPrimaryKey(Shippinginformation record);
}