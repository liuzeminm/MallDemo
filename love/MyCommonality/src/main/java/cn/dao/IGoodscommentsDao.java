package cn.dao;

import cn.pojo.Goodscomments;
import cn.pojo.GoodscommentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodscommentsDao {
    int countByExample(GoodscommentsExample example);

    int deleteByExample(GoodscommentsExample example);

    int deleteByPrimaryKey(Integer gcid);

    int insert(Goodscomments record);

    int insertSelective(Goodscomments record);

    List<Goodscomments> selectByExample(GoodscommentsExample example);

    Goodscomments selectByPrimaryKey(Integer gcid);

    int updateByExampleSelective(@Param("record") Goodscomments record, @Param("example") GoodscommentsExample example);

    int updateByExample(@Param("record") Goodscomments record, @Param("example") GoodscommentsExample example);

    int updateByPrimaryKeySelective(Goodscomments record);

    int updateByPrimaryKey(Goodscomments record);
}