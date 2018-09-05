package cn.controller;

import cn.service.IGoodsclassService;
import cn.service.impl.IGoodsclassServiceImpl;
import cn.util.Page;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Api(tags = "igs的主分页栏信息")
@Configuration
@RequestMapping("/IGoodsclass1")
@RestController
public class IGoodsclassController {
    @Resource(name = "iiii")

    private IGoodsclassService ics;

    public IGoodsclassService getIcs() {
        return ics;
    }

    public void setIcs(IGoodsclassService ics) {
        this.ics = ics;
    }

    @ApiOperation(value = "显示商城主分页栏信息", notes = "显示商城主分页栏信息")
    @RequestMapping(value = "/Pageigs", method = RequestMethod.POST)
    @ResponseBody
    public String  Gsa(HttpServletRequest request, HttpServletResponse response  ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String getgs = ics.getgs();
        return  getgs ;
    }
}