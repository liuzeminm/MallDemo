package cn.dao;

import cn.pojo.Blackcardtype;
import cn.pojo.BlackcardtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBlackcardtypeDao {
    int countByExample(BlackcardtypeExample example);

    int deleteByExample(BlackcardtypeExample example);

    int deleteByPrimaryKey(Integer bctid);

    int insert(Blackcardtype record);

    int insertSelective(Blackcardtype record);

    List<Blackcardtype> selectByExample(BlackcardtypeExample example);

    Blackcardtype selectByPrimaryKey(Integer bctid);

    int updateByExampleSelective(@Param("record") Blackcardtype record, @Param("example") BlackcardtypeExample example);

    int updateByExample(@Param("record") Blackcardtype record, @Param("example") BlackcardtypeExample example);

    int updateByPrimaryKeySelective(Blackcardtype record);

    int updateByPrimaryKey(Blackcardtype record);
}