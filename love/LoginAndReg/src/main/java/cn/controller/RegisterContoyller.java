package cn.controller;

import cn.pojo.Useri;
import cn.service.RegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
@Api(tags = "注册相关接口")
@ResponseBody
public class RegisterContoyller {
    private Logger logger = Logger.getLogger(RegisterContoyller.class);
    @Resource(name="Register")
    private RegisterService rs;

    public RegisterService getRs() { return rs; }
    public void setRs(RegisterService rs) { this.rs = rs; }

    /**
     * 传入手机号
     * @param phonenum
     * @return
     */
    @ApiOperation(value="手机号 - 接口",notes = "输入手机号，进行注册")
    @RequestMapping(value = "getPhone",method = RequestMethod.POST,produces ="text/html;charset=UTF-8" )

    public String getPhone(@ApiParam( name="phonenum" ,value = "手机号",required=true)@RequestParam String phonenum,
                           HttpServletResponse response, HttpServletRequest request ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String phone = null;
        try {
            phone = new String (phonenum.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
       String ret= rs.Register(phone);
        return ret;

    }

    /**
     * 拿到验证码
     * @param vernumber
     * @return
     */
    @ApiOperation(value="验证码 - 接口",notes = "填写手机获取的短信验证码")
    @RequestMapping(value = "getvernum",method = RequestMethod.POST,produces ="text/html;charset=UTF-8" )
    public String getvernum(@ApiParam( name="vernumber" ,value = "短信验证码",required=true)@RequestParam String vernumber,
                            HttpServletResponse response, HttpServletRequest request ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String vernum = null;
        try {
            vernum = new String (vernumber.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String ret = rs.Verifynum(vernum);
        return ret;
    }

    /**
     * 添加更多信息
     * @param usersex
     * @param userbriday
     * @param username
     * @return
     */
    @ApiOperation(value="添加更多信息 - 接口",notes = "性别、生日、用户名信息")
    @RequestMapping(value = "insertinformation",method = RequestMethod.POST,produces ="text/html;charset=UTF-8" )
    public String insertinformation(@ApiParam( name="usersex",value = "性别",required=true)@RequestParam String usersex,
                                    @ApiParam( name="userbriday",value = "出生日期",required=true)@RequestParam String userbriday,
                                    @ApiParam( name="username",value = "用户名",required=true)@RequestParam String username,
                                    HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String usex = null;
        String ubriday = null;
        String uname = null;
        try {
            usex = new String (usersex.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            ubriday = new String (userbriday.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            uname = new String (username.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Useri u = new Useri();
        u.setUsersex(usex);
        u.setUserdatebirth(ubriday);
        u.setUsername(uname);
        String ret = rs.lnsertinf(u);
        return ret;
    }

}
