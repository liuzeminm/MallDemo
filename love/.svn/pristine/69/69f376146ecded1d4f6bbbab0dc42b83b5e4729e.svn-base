package cn.dao;

import cn.pojo.Orderprice;
import cn.pojo.OrderpriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOrderpriceDao {
    int countByExample(OrderpriceExample example);

    int deleteByExample(OrderpriceExample example);

    int deleteByPrimaryKey(Integer opid);

    int insert(Orderprice record);

    int insertSelective(Orderprice record);

    List<Orderprice> selectByExample(OrderpriceExample example);

    Orderprice selectByPrimaryKey(Integer opid);

    int updateByExampleSelective(@Param("record") Orderprice record, @Param("example") OrderpriceExample example);

    int updateByExample(@Param("record") Orderprice record, @Param("example") OrderpriceExample example);

    int updateByPrimaryKeySelective(Orderprice record);

    int updateByPrimaryKey(Orderprice record);
}