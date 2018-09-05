package cn.dao;

import cn.pojo.Orderform;
import cn.pojo.OrderformExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOrderformDao {
    int countByExample(OrderformExample example);

    int deleteByExample(OrderformExample example);

    int deleteByPrimaryKey(Integer ofshippinginformation , String serialNumber,Integer ofstate);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    List<Orderform> selectByExample(int ofshippinginformation);

    Orderform selectByPrimaryKey(Integer ofid,String serialNumber);

    int updateByExampleSelective(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByExample(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);


    List<Orderform> selectByExample(@Param("userid") Integer ofshippinginformation,@Param("state") Integer ofstate);
    List<Orderform> selectByExampleone(Integer ofshippinginformation);
    Orderform selectByExampleDetails(int ofid);


    Orderform aaa();
}