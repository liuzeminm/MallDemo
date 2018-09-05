package cn.controller;

import cn.service.ShopdelAllservice;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "清空购物车")
@RestController
@RequestMapping("/shopdelA")
public class ShopdelAllcontroller {
    @Resource(name = "sasi")
    private ShopdelAllservice sdas;

    public ShopdelAllservice getSdas() {
        return sdas;
    }

    public void setSdas(ShopdelAllservice sdas) {
        this.sdas = sdas;
    }
    @ApiOperation(value = "清空", notes = "删除购物车商品")
    @RequestMapping(value = "/shopdelAll", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuserid",value = "用户ID",dataType = "int", paramType="query")
    })
    public String shopdelAll(
            @RequestParam(value = "userid",required = false)Integer userid,
            HttpServletResponse response, HttpServletRequest request
    ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = sdas.delshopAll(userid);
        return s;
    }
}
