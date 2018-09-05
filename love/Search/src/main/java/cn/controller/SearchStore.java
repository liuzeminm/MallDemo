package cn.controller;

import cn.service.SearchService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "搜索")
@ResponseBody
public class SearchStore {
    private Logger logger = Logger.getLogger(SearchStore.class);
    @Resource(name = "sss")
    private SearchService ss;

    public SearchService getSs() {
        return ss;
    }

    public void setSs(SearchService ss) {
        this.ss = ss;
    }
    List list = new ArrayList();
    @ApiOperation(value = "搜索商品" , notes = "搜索全部商品")
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "搜索商品",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "pageNo",value = "当前页数",dataType = "int",paramType = "query"),
            @ApiImplicitParam(name = "pageSize",value = "页面大小",dataType = "int",paramType = "query")
    })
    public String searchAll(@RequestParam(value = "name")String name, @RequestParam(value = "pageNo")int pageNo, @RequestParam(value = "pageSize")int pageSize,
                            HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
        String namem = new String(name.getBytes("ISO8859-1"), "UTF-8");
            String names = "%" + namem + "%";
            PageHelper.startPage(pageNo, pageSize);
            list = ss.getAll(names);
            PageInfo page=new PageInfo(list);
            String pages = JSON.toJSONString(page);
            logger.info(pages);
            return pages;
    }
}
