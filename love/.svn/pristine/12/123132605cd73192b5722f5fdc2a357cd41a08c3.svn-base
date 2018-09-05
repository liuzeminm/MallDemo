package cn.dao;

import cn.pojo.Merchantsfans;
import cn.pojo.MerchantsfansExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMerchantsfansDao {
    int countByExample(MerchantsfansExample example);

    int deleteByExample(MerchantsfansExample example);

    int deleteByPrimaryKey(Integer mfid);

    int insert(Merchantsfans record);

    int insertSelective(Merchantsfans record);

    List<Merchantsfans> selectByExample(MerchantsfansExample example);

    Merchantsfans selectByPrimaryKey(Integer mfid);

    int updateByExampleSelective(@Param("record") Merchantsfans record, @Param("example") MerchantsfansExample example);

    int updateByExample(@Param("record") Merchantsfans record, @Param("example") MerchantsfansExample example);

    int updateByPrimaryKeySelective(Merchantsfans record);

    int updateByPrimaryKey(Merchantsfans record);
}