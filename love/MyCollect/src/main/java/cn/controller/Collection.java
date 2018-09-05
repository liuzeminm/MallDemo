package cn.controller;


import cn.pojo.Notenote;
import cn.service.Collectionservice;
import com.alibaba.fastjson.JSON;
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

@Api(tags = "收藏")
@RestController
@RequestMapping("/coll")
public class Collection {
    @Resource(name = "csi")
    private Collectionservice cs;

    public Collectionservice getCs() {
        return cs;
    }

    public void setCs(Collectionservice cs) {
        this.cs = cs;
    }

    @ApiOperation(value = "collgoods", notes = "收藏物品")
    @RequestMapping(value = "/collinst", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ncusernameid",value = "用户ID",dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "nccollectionid",value = "收藏ID",dataType = "int", paramType="query")
    })
    public String collinst(@RequestParam(value = "ncusernameid",required = false)int ncusernameid, @RequestParam(value = "nccollectionid",required = false)int nccollectionid, HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        Notenote re = new Notenote();
        re.setNcusernameid(ncusernameid);
        re.setNccollectionid(nccollectionid);
        String s = cs.insertSelective(re);
        String s1 = JSON.toJSONString(s);
        return s1;
    }
}
