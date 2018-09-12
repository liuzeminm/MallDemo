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
    @ApiOperation(value = "添加购物车",notes = "从心愿单添加到购物车里")
    @RequestMapping(value = "/shopinster",method = RequestMethod.POST,produces = "text/html;charset=utf-8")

    public String shopinster(@RequestParam(value = "stname",required = false) String stname,
                             @RequestParam(value = "stcommodityprices",required = false) Double stcommodityprices,
                             @RequestParam(value = "stcommodityimages",required = false) String stcommodityimages,
                             @RequestParam(value = "comid",required = false) Integer comid,
                             @RequestParam(value = "userid",required = false) Integer userid,
                             HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {

        response.setHeader("Access-Control-Allow-Origin","*");
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        Shoppingtrolley st = new Shoppingtrolley();
        st.setStcommodityprices(stcommodityprices);
        st.setStcommodityimages(stcommodityimages);
        st.setStcomid(comid);
        st.setStuserid(userid);
        //解决前台中文乱码
        try {
            String searchtext = java.net.URLDecoder.decode(stname,"UTF-8");  //进行解码，会抛异常，直接捕获即可。
            st.setStname(searchtext);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String inserttrolley = sus.inserttrolley(st);
        return inserttrolley;
    }
}
