package cn.controller;



import cn.pojo.Commodity;
import cn.service.ImgService;
import cn.util.Bsase64;
import io.swagger.annotations.Api;
import io.swagger.models.Model;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api(tags = "上架一个商品")
@Configuration
@RequestMapping("/photo")
public class FileUploadController1 {
    private static Logger logger = Logger.getLogger(FileUploadController.class);
    @Resource(name = "ssss")
    private ImgService is;
    public ImgService getIs() {
        return is;
    }

    public void setIs(ImgService is) {
        this.is = is;
    }


    public String toFileUpLoad(HttpServletRequest request, Model model){
        return "fileUpLoad";
    }
    //@Value("#{settings['picPath.picUrl']}")

    @RequestMapping(value = "/addAction",method = RequestMethod.POST,produces = "text/html;charset=utf-8")
    @ResponseBody//将返回结果写到response中
    public String save(HttpServletRequest request, HttpServletResponse response,
                       @RequestParam(value = "file",required = false)String file,
                       @RequestParam(value = "comname",required = false)String comname ,
                       @RequestParam(value = "comspecificationofgoods",required = false)String comspecificationofgoods ,
                       @RequestParam(value = "comcommodityprices",required = false)Integer comcommodityprices ,
                       @RequestParam(value = "combrand",required = false)Integer combrand ,
                       @RequestParam(value = "comclassificationgoods",required = false)Integer comclassificationgoods,
                       @RequestParam(value = "comgetacoupon",required = false)String comgetacoupon,
                       @RequestParam(value = "comtradedescription",required = false)String comtradedescription,
                       @RequestParam(value = "comsourceofcommoditysales",required = false)Integer comsourceofcommoditysales) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
        String a = null;
        String b = null;
        String c = null;
        String d = null;
        String e = null;
        a = new String(comname.getBytes("ISO-8859-1"), "UTF-8");
        b = new String(comspecificationofgoods.getBytes("ISO-8859-1"), "UTF-8");
        c = new String(comgetacoupon.getBytes("ISO-8859-1"), "UTF-8");
        d = new String(comtradedescription.getBytes("ISO-8859-1"), "UTF-8");


        Commodity con = new Commodity();
        if (file != null) {
            //输出base64 数据,截取","之后的值进行转换
            String str = file.substring(file.indexOf(",") + 1);

            System.out.println(str);
            String NewFile = System.currentTimeMillis() +".JPG";
            System.out.println(NewFile+"新名字");
            String realPath = request.getSession().getServletContext().getRealPath("");
            //第一个参数base64转图片的必须的base64数据，第二个是转换后生成的图片存放路径
            Bsase64.GenerateImage(str, str + "\\upload\\" + NewFile);
            //将图片名称路径集合保存至数据库
            con.setCompicture("\\upload\\" + NewFile);
            System.out.println("\\upload\\" + NewFile
            );
            con.setComname(comname);
            con.setComspecificationofgoods(comspecificationofgoods);
            con.setComtradedescription(comtradedescription);
            con.setComcommodityprices(comcommodityprices);
            con.setComsourceofcommoditysales(comsourceofcommoditysales);
            con.setCombrand(combrand);
            con.setComclassificationgoods(comclassificationgoods);
            con.setComgetacoupon(comgetacoupon);
        }
        return is.selgds(con);
    }
}