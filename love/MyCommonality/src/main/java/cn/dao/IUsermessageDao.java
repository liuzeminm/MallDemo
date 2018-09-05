package cn.dao;

import cn.pojo.Usermessage;
import cn.pojo.UsermessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUsermessageDao {
    int countByExample(UsermessageExample example);

    int deleteByExample(UsermessageExample example);

    int deleteByPrimaryKey(Integer umid);

    int insert(Usermessage record);

    int insertSelective(Usermessage record);

    List<Usermessage> selectByExample(UsermessageExample example);

    Usermessage selectByPrimaryKey(Integer umid);

    int updateByExampleSelective(@Param("record") Usermessage record, @Param("example") UsermessageExample example);

    int updateByExample(@Param("record") Usermessage record, @Param("example") UsermessageExample example);

    int updateByPrimaryKeySelective(Usermessage record);

    int updateByPrimaryKey(Usermessage record);
}