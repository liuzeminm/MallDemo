package cn.controller;

import cn.service.Colldelservice;
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

@Api(tags = "删除收藏")
@RestController
@RequestMapping("/colldel")
public class Colldel {
    @Resource(name = "cds")
    private Colldelservice cls;

    public Colldelservice getCls() {
        return cls;
    }

    public void setCls(Colldelservice cls) {
        this.cls = cls;
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @RequestMapping(value = "/colld", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ncid",value = "收藏ID",dataType = "int", paramType="query")
    })
    public String colld(HttpServletResponse response, HttpServletRequest request,@RequestParam(value = "id", required = false)int id){
        response.setHeader("Access-Control-Allow-Origin","*");
        String updatadel = cls.updatadel(id);
        return updatadel;
    }
}
