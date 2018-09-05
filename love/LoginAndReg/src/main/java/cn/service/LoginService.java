package cn.service;


import cn.pojo.Useri;

public interface LoginService {
    String RegVerify(String yanZheng);
    String login(String phone, String password);
    String loginbyPhone(String phone , String verification);
    String loginbyToken(String phone , String useridtoken);
    public String updateuser(String newpwd2,int userid);
}
