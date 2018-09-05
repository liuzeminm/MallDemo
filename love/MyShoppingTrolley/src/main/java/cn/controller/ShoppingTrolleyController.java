/*
package cn.controller;

import cn.pojo.Shoppingtrolley;
import cn.sptservice.ShoppingTrolleyService;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "购物车")
@Controller
@RequestMapping("/ShoppingTrolley")
@ResponseBody
public class ShoppingTrolleyController {

    @Resource(name = "stsi")
    private ShoppingTrolleyService stsi;

    public ShoppingTrolleyService getStsi() {
        return stsi;
    }

    public void setStsi(ShoppingTrolleyService stsi) {
        this.stsi = stsi;
    }

    @ApiOperation(value = "添加删除购物车", notes = "添加删除购物车")
    @RequestMapping(value = "/addanddelShoppingTrolley", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofshippinginformation",value = "用户id",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "serialNumber",value = "订单号",dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "ofstate",value = "订单状态",dataType = "String", paramType="query")
    })
    public String cancellationOfOrder(@ApiParam(required = true, name = "Orderform", value = "订单信息以json格式")Shoppingtrolley st,
                                      @RequestParam(value = "flage",required = true)int flage,
                                      HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = stsi.addCommodity(st, flage);
        return s;
    }
}
*/
