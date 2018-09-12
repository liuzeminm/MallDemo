package cn.controller;

import cn.service.Shopupdateservice;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "shoppinghave")
@RestController
@RequestMapping("/shopping")
public class Shopselcontroller {
    @Resource(name = "susi")
    private Shopupdateservice sus;

    public Shopupdateservice getSus() {
        return sus;
    }

    public void setSus(Shopupdateservice sus) {
        this.sus = sus;
    }

    @ApiOperation(value = "shoppinghave", notes = "该商品添加数量加1")
    @RequestMapping(value = "/trolley", method = RequestMethod.GET)
    public String trolley(
            @RequestParam(value = "stcomid",required = false) Integer stcomid,
            HttpServletResponse response, HttpServletRequest request
    ){
        response.setHeader("Access-Control-Allow-Origin","*");
        String quantity = sus.quantity(stcomid);

        return quantity;
    }
}
