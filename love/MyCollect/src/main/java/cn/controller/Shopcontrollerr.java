package cn.controller;

import cn.pojo.Shoppingtrolley;
import cn.service.Shopupdateservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Api(tags = "加入购物车")
@RestController
@RequestMapping("/shopinst")
public class   Shopcontrollerr {
    @Resource(name = "susi")
    private Shopupdateservice sus;

    public Shopupdateservice getSus() {
        return sus;
    }

    public void setSus(Shopupdateservice sus) {
        this.sus = sus;
    }
    @ApiOperation(value = "instshopping",notes = "从心愿单添加到购物车里")
    @RequestMapping(value = "/shopinster",method = RequestMethod.POST)

    public String shopinster(@RequestParam(value = "商品名称stname",required = false) String stname,
                             @RequestParam(value = "商品价格stcommodityprices",required = false) Double stcommodityprices,
                             @RequestParam(value = "商品图片stcommodityimages",required = false) String stcommodityimages,
                             @RequestParam(value = "商品IDcomid",required = false) Integer comid,
                             @RequestParam(value = "用户IDuserid",required = false) Integer userid,
                             HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String stname1 = "";
        try {
            stname1 = new String(stname.getBytes("ISO-8859-1"),"utf-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Shoppingtrolley st = new Shoppingtrolley();
        st.setStname(stname1);
        st.setStcommodityprices(stcommodityprices);
        st.setStcommodityimages(stcommodityimages);
        st.setStcomid(comid);
        st.setStuserid(userid);
        String inserttrolley = sus.inserttrolley(st);
        return inserttrolley;

    }
}
