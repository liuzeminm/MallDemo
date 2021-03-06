package cn.dao;

import cn.pojo.Goodsclass;
import cn.pojo.GoodsclassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodsclassDao {

    //获取GoodClass全部信息
    List<Goodsclass>     getgs();


    int countByExample(GoodsclassExample example);

    int deleteByExample(GoodsclassExample example);

    int deleteByPrimaryKey(Integer gsclassid);

    int insert(Goodsclass record);

    int insertSelective(Goodsclass record);

    List<Goodsclass> selectByExample(GoodsclassExample example);

    Goodsclass selectByPrimaryKey(Integer gsclassid);

    int updateByExampleSelective(@Param("record") Goodsclass record, @Param("example") GoodsclassExample example);

    int updateByExample(@Param("record") Goodsclass record, @Param("example") GoodsclassExample example);

    int updateByPrimaryKeySelective(Goodsclass record);

    int updateByPrimaryKey(Goodsclass record);
}