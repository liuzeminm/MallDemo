package cn.controller;

import cn.pojo.Orderform;
import cn.sptservice.impl.OrderStatusServiceImpl;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "订单")
@Controller
@RequestMapping("/OrderStatus")
@ResponseBody
public class OrderStatusContoroller {
    private static Logger logger = Logger.getLogger(OrderStatusContoroller.class);
    @Resource(name = "ossi")
    private OrderStatusServiceImpl ossi;

    public OrderStatusServiceImpl getOssi() {
        return ossi;
    }

    public void setOssi(OrderStatusServiceImpl ossi) {
        this.ossi = ossi;
    }

    @ApiOperation(value = "删除订单", notes = "按订单状态删除订单")
    @RequestMapping(value = "/deldorderform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofshippinginformation",value = "用户id",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "serialNumber",value = "订单号",dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "ofstate",value = "订单状态",dataType = "String", paramType="query")
    })
    public String cancellationOfOrder(@RequestParam(value = "ofshippinginformation",required = false)int ofshippinginformation,
                                      @RequestParam(value = "serialNumber",required = false) String serialNumber ,
                                      @RequestParam(value = "ofstate",required = false)String  ofstate,
                                      HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = ossi.cancellationOfOrder(ofshippinginformation, serialNumber, ofstate);
        return s;

    }
    @ApiOperation(value = "操作账单", notes = "按订单状态操作账单")
    @RequestMapping(value = "/orderform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofstate",value = "订单状态",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "orderprice",value = "订单价格",dataType = "double", paramType="query"),
            @ApiImplicitParam(name = "userid",value = "用户id",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "ordernumber",value = "订单号",dataType = "String", paramType="query")
    })
    public String dispose(@RequestParam(value = "ofstate",required = false)int ofstate,
                          @RequestParam(value = "orderprice",required = false)Double orderprice ,
                          @RequestParam(value = "userid",required = false) int userid ,
                          @RequestParam(value = "ordernumber",required = false)String ordernumber,
                          HttpServletResponse response,HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String dispose = ossi.dispose(ofstate, orderprice, userid, ordernumber);
        return dispose;

    }
    @ApiOperation(value = "30分钟删除未付款订单", notes = "30分钟删除未付款订单")
    @RequestMapping(value = "/deleteorderform", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "commodityid",value = "商品id",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "userid",value = "用户id",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "Ofordernumber",value = "订单号",dataType = "String", paramType="query")
    })
    public String addOrderForm(@RequestParam(value = "userid",required = false)int userid,
                               @RequestParam(value = "commodityid",required = false)int commodityid,
                               @RequestParam(value = "Ofordernumber",required = false)String Ofordernumber,
                               HttpServletResponse response,HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = ossi.addOrderForm(userid, commodityid, Ofordernumber);
        logger.info("删除订单" + "----------------" + s);
        return s;

    }
    @ApiOperation(value = "添加订单", notes = "点击结账添加订单")
    @RequestMapping(value = "/addorderform", method = RequestMethod.POST )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "number",value = "方式",dataType = "int", paramType="query"),
    })
    public String addOrder( @ApiParam(required = true, name = "Orderform", value = "订单信息以json格式")
                                @ModelAttribute Orderform of,
                            @RequestParam(value = "number",required = false)int number,
                            HttpServletResponse response,HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = ossi.addOrder(of,number);

        return s;

    }

}
