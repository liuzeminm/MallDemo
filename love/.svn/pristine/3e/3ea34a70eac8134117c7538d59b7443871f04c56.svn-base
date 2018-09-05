package cn.dao;

import cn.pojo.Blackcardmember;
import cn.pojo.BlackcardmemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBlackcardmemberDao {
    int countByExample(BlackcardmemberExample example);

    int deleteByExample(BlackcardmemberExample example);

    int deleteByPrimaryKey(Integer bcmid);

    int insert(Blackcardmember record);

    int insertSelective(Blackcardmember record);

    List<Blackcardmember> selectByExample(BlackcardmemberExample example);

    Blackcardmember selectByPrimaryKey(Integer bcmid);

    int updateByExampleSelective(@Param("record") Blackcardmember record, @Param("example") BlackcardmemberExample example);

    int updateByExample(@Param("record") Blackcardmember record, @Param("example") BlackcardmemberExample example);

    int updateByPrimaryKeySelective(Blackcardmember record);

    int updateByPrimaryKey(Blackcardmember record);
}