package cn.controller;


import cn.service.impl.SelPinformationServiceImpl;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;;
@Api(tags = "查询商品信息")
@RestController
@RequestMapping
public class SelPinformationController {
    @Resource(name = "sps")
    private SelPinformationServiceImpl ss;

    public SelPinformationServiceImpl getSs() {
        return ss;
    }

    public void setSs(SelPinformationServiceImpl ss) {
        this.ss = ss;
    }

    @ApiOperation(value = "通过id查询商品信息")
    @RequestMapping(value = "/Blurb", method = RequestMethod.POST)
    @ResponseBody
    public String count(HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "informationid", required = false)int informationid ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = ss.selPinformation(informationid);
        String s1 = JSON.toJSONString(s);
        return s1;
    }



}
