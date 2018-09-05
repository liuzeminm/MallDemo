package cn.controller;

import cn.service.Colllookservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "展示收藏")
@RestController
@RequestMapping("/collshow")
public class Notenote {
    @Resource(name = "clsi")
    private Colllookservice cll;

    public Colllookservice getCll() {
        return cll;
    }

    public void setCll(Colllookservice cll) {
        this.cll = cll;
    }
    @ApiOperation(value = "collus", notes = "个人收藏的所有 ")
    @RequestMapping(value = "/collsh", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ncusernameid",value = "用户ID",dataType = "int", paramType="query")
    })
    public String collsh(@RequestParam(value = "ncusernameid",required = false)int id, HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String selective = cll.Selective(id);
        return selective;
    }
}
