package cn.setservice.impl;

import cn.dao.IUseriDao;
import cn.pojo.Useri;
import cn.setservice.UpdVerService;
import cn.setservice.UpdVerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ver")
public class UpdVerServiceimpl implements UpdVerService {
    @Resource(name="IUseriDao")
    private IUseriDao id;

    public IUseriDao getId() { return id; }
    public void setId(IUseriDao id) { this.id = id; }

    /**
     * 修改个人信息以及信息验证业务
     * @param ue
     * @param type
     * @returnt
     */

    public Object verify(Useri ue,String type) {
        Useri us = id.VerifySel(ue);
        Object ob= "";
        int count = 0;
        switch (type) {
            case "name":
                if(us.getUsername().equals(ue.getUsername())){
                    ob="与原用户名相同";
                }else{
                    count = id.updateuser(ue);
                    ob="用户名已更改";
                    if (count!=1)
                        ob="修改失败";
                }
                break;
            case "sex":
                if(us.getUsersex().equals(ue.getUsersex())){
                    ob="未修改";
                }else{
                    count = id.updateuser(ue);
                    ob="性别已更改";
                    if (count!=1)
                        ob="更改失败";
                }
                break;
            case "site":
                if(us.getUseroftensite().equals(ue.getUseroftensite())){
                    ob="与原地址相同";
                }else{
                    count = id.updateuser(ue);
                    ob="常住地已更改";
                    if (count!=1)
                        ob="更改失败";
                }
                break;
            case "briday":
                if(us.getUserdatebirth().equals(ue.getUserdatebirth())){
                    ob="未修改";
                }else{
                    count = id.updateuser(ue);
                    ob="出生日期已更改";
                    if (count!=1)
                        ob="更改失败";
                }
                break;
            case "phone":
                if(us.getUserphone().equals(ue.getUserphone())){
                    ob="与原手机号相同";
                }else{
                    count = id.updateuser(ue);
                    ob="手机号已更改";
                    if (count!=1)
                        ob="更改失败";
                }
                break;
            case "pwd":
                if(us.getUserloginpassword().equals(ue.getUserloginpassword())){
                    ob="未修改";
                }else{
                    count = id.updateuser(ue);
                    ob="密码已更改";
                    if (count!=1)
                        ob="更改失败";
                }
                break;
            default:
                break;
        }
        return ob;
    }
}
