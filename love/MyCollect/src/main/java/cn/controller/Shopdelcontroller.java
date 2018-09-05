package cn.controller;


import cn.service.Shoppingdelservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "删除购物车商品")
@RestController
@RequestMapping("/shopdelete")
public class Shopdelcontroller {
    @Resource(name="sd")
    private Shoppingdelservice sd;

    public Shoppingdelservice getSd() {
        return sd;
    }

    public void setSd(Shoppingdelservice sd) {
        this.sd = sd;
    }

    @ApiOperation(value = "delshop", notes = "删除购物车单个商品")
    @RequestMapping(value = "/delshopp", method = RequestMethod.POST)
    public String delshopp(
            @RequestParam(value = "comid",required = false)Integer comid,
            @RequestParam(value = "userid",required = false)Integer userid,
            HttpServletResponse response, HttpServletRequest request
    ){
        response.setHeader("Access-Control-Allow-Origin","*");
        return sd.delshopping(comid,userid);
    }
}
