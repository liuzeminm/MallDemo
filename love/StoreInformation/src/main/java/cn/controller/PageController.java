package cn.controller;

import cn.service.SelPageService;
import cn.util.Page;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "商城主页显示页面")
@RestController
@RequestMapping
public class PageController {
    @Resource(name = "ssi")
    private SelPageService  ss;
    public SelPageService getSs() {
        return ss;
    }

    public void setSs(SelPageService ss) {
        this.ss = ss;
    }




    @ApiOperation(value = "计算主页条数", notes = "计算所选条数")
    @RequestMapping(value = "/Pagecount", method = RequestMethod.POST)
    @ResponseBody
    public int  count(@RequestParam(value = "state",required = false)int state ){
        int i = ss.selCount(state);
        return i;
    }

    @ApiOperation(value = "显示商城页面数据", notes = "显示商城页面图面信息")
    @RequestMapping(value = "/Page", method = RequestMethod.POST)
    @ResponseBody
    public String  filialeList(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "state", required = false)int state,@RequestParam(value = "index",required = false)int index  ){
        response.setHeader("Access-Control-Allow-Origin","*");
        Page page = ss.selClassAndDetails(state, index);
        String s = JSON.toJSONString(page);
        return   s;
    }

}
