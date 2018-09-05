package cn.controller;

import cn.sptservice.impl.ShowOrderStatusImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "订单")
@Controller
@RequestMapping("/ShowOrderStatus")
@ResponseBody
public class ShowOrderStatusController {
    @Resource(name = "sos")
    private ShowOrderStatusImpl sosi;

    public ShowOrderStatusImpl getSosi() {
        return sosi;
    }

    public void setSosi(ShowOrderStatusImpl sosi) {
        this.sosi = sosi;
    }

    @ApiOperation(value = "显示用户全部订单", notes = "显示用户全部订单")
    @RequestMapping(value = "/showdorderform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofshippinginformation",value = "用户id",dataType = "int", paramType="query"),
    })
    public String cancellationOfOrder(@RequestParam(value = "ofshippinginformation",required = false)int ofshippinginformation,
                                      HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = sosi.showAll(ofshippinginformation);
        return s;

    }

    @ApiOperation(value = "显示用户全部订单", notes = "显示用户全部订单")
    @RequestMapping(value = "/showonedorderform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofshippinginformation",value = "用户id",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "ofstate",value = "订单状态",dataType = "int", paramType="query")
    })
    public String cancellationOfOrder(@RequestParam(value = "ofshippinginformation",required = false)int ofshippinginformation,
                                      @RequestParam(value = "ofstate",required = false)int ofstate,
                                      HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = sosi.showOne(ofshippinginformation, ofstate);
        return s;

    }

    @ApiOperation(value = "账单详情", notes = "账单详情")
    @RequestMapping(value = "/showdetailsdorderform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofid",value = "订单id",dataType = "int", paramType="query")
    })
    public String showdetails(@RequestParam(value = "ofid",required = false)int ofid,
                                      HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = sosi.showDetails(ofid);
        return s;

    }
}
