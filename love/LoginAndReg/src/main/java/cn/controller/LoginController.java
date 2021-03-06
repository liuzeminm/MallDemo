package cn.controller;


import cn.service.LoginService;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "登陆相关接口")
@Controller
@RequestMapping("/log")
@ResponseBody
public class LoginController {
    private Logger logger = Logger.getLogger(LoginController.class);
    @Resource(name = "login")
    private LoginService ls;
    public LoginService getLs() {
        return ls;
    }
    public void setLs(LoginService ls) {
        this.ls = ls;
    }

    @ApiOperation(value = "手机密码登陆", notes = "通过手机号和密码登陆")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone",value = "用户手机号",dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "verification",value = "密码",dataType = "String", paramType="query"),
    })
    public String login1(@RequestParam(value = "phone",required = true)String phone,
                         @RequestParam(value = "verification",required = true) String verification,
                         HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String login = ls.login(phone, verification);
        logger.info(login);
        return login;
    }
    @ApiOperation(value = "验证码登陆", notes = "通过短信验证码登陆")
    @RequestMapping(value = "/loginverification", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone",value = "用户手机号",dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "verification",value = "验证码",dataType = "String", paramType="query"),
    })
    public String login2(@RequestParam(value = "phone",required = true) String phone,
                         @RequestParam(value = "verification",required = true) String verification,
                         HttpServletResponse response,HttpServletRequest request) {
        response.setHeader("Access-Control-Allow-Origin","*");
        String login = ls.loginbyPhone(phone , verification);
        logger.info(login);
        return login;
    }
    /**
     * 获取手机验证码
     * @param phone
     * @return String
     */
    @ApiOperation(value = "获取验证码", notes = "发送短信获取验证码")
    @RequestMapping(value = "/getverification", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone",value = "用户手机号",dataType = "String", paramType="query"),
    })
    public String verify(@RequestParam(value = "phone",required = true) String phone,
                       HttpServletResponse response,HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        return ls.RegVerify(phone);
    }

    @ApiOperation(value = "token登陆", notes = "通过验证token登陆")
    @RequestMapping(value = "/logintoken", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone",value = "用户手机号",dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "useridtoken",value = "登陆验证",dataType = "String", paramType="query"),
    })
    public String login3(@RequestParam(value = "phone",required = true) String phone,
                         @RequestParam(value = "useridtoken",required = true) String useridtoken,
                         HttpServletResponse response,HttpServletRequest request) {
        response.setHeader("Access-Control-Allow-Origin","*");
        String login = ls.loginbyToken(phone, useridtoken);
        logger.info(login);
        return login;
    }

    @ApiOperation(value = "忘记密码", notes = "重置密码")
    @RequestMapping(value = "/loginnewpwd", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userloginpassword",value = "新密码",dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "userid",value = "用户id",dataType = "String", paramType="query"),
    })
    public String newpwd(@RequestParam(value = "userloginpassword",required = true) String userloginpassword,
                         @RequestParam(value = "userid",required = true) int userid,
                         HttpServletResponse response,HttpServletRequest request) {
        response.setHeader("Access-Control-Allow-Origin","*");
        return ls.updateuser(userloginpassword, userid);
    }
}
