package cn.dao;

import cn.pojo.Useri;
import cn.pojo.UseriExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUseriDao {
    int countByExample(UseriExample example);

    int deleteByExample(UseriExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Useri record);

    int insertSelective(Useri record);

    List<Useri> selectByExample(UseriExample example);

    Useri selectByPrimaryKey(String userphone, String userloginpassword);

    Useri selectByPrimaryKeyone(String userphone);

    int updateByExampleSelective(@Param("record") Useri record, @Param("example") UseriExample example);

    int updateByExample(@Param("record") Useri record, @Param("example") UseriExample example);

    int updateByPrimaryKeySelective(Useri record);

    int updateByPrimaryKey(Useri record);



    Useri getOf(int userid);

    int updatepwd(String userloginpassword , int userid);
 /**
     *
     * @param u
     * @return
     */
    Useri VerifySel(Useri u);

    /**
     *
     * @param u
     * @return
     */
    int updateuser(Useri u);

    /**
     * ע��ʱ��֤�ֻ���
     * @param phone
     * @return
     */
    int VerifyPhone(@Param ("p")String phone);

    /**
     * ��Ӹ�����Ϣ
     * @param u
     * @return
     */
    int ManyInf (Useri u);
    /**
     * 查询默认密码，作为返回；
     * @param phone
     * @return
     */
    String SelPwd(@Param("pwd") String phone);

}
