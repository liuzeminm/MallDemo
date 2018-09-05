package cn.dao;

import cn.pojo.Merchant;
import cn.pojo.MerchantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMerchantDao {
    int countByExample(MerchantExample example);

    int deleteByExample(MerchantExample example);

    int deleteByPrimaryKey(Integer mcid);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExample(MerchantExample example);

    Merchant selectByPrimaryKey(Integer mcid);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}