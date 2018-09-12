package cn.controller;

import cn.service.Showshowservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "shoppingshow")
@RestController
@RequestMapping("/shops")
public class Shopshowcontrollr {
    @Resource(name = "sssi")
    private Showshowservice sss;

    public Showshowservice getSss() {
        return sss;
    }

    public void setSss(Showshowservice sss) {
        this.sss = sss;
    }
    @ApiOperation(value = "shoppingshow", notes = "显示购物车")
    @RequestMapping(value = "/shopshow", method = RequestMethod.POST)
    public String shopshow(
            @RequestParam(value = "stuserid",required = false) Integer stuserid,
            HttpServletResponse response, HttpServletRequest request
    ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String shoppingshow = sss.shoppingshow(stuserid);
        return shoppingshow;
    }
}
