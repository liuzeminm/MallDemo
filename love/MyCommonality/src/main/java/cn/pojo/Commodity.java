package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.multipart.MultipartFile;

@ApiModel(value="Commodity对象",description="商品对象Commodity")
public class Commodity {
    @ApiModelProperty(value = "商品",required = true)
    private Integer comid =0;
    @ApiModelProperty(value = "商品名称",required = true)
    private String comname;
    @ApiModelProperty(value = "商品图片",required = true)
    private String compicture;
    @ApiModelProperty(value = "商品精选",required = true)
    private String comchoiceness;
    @ApiModelProperty(value = "商品规格参数",required = true)
    private String comspecificationofgoods;
    @ApiModelProperty(value = "商品说明",required = true)
    private String comtradedescription;
    @ApiModelProperty(value = "领券",required = true)
    private String comgetacoupon;
    @ApiModelProperty(value = "商品价格",required = true)
    private Integer comcommodityprices;
    @ApiModelProperty(value = "商品评论",required = true)
    private Integer comgoodscomments;
    @ApiModelProperty(value = "商品销售来源",required = true)
    private Integer comsourceofcommoditysales;
    @ApiModelProperty(value = "品牌",required = true)
    private Integer combrand;
    @ApiModelProperty(value = "商品分类",required = true)
    private Integer comclassificationgoods;
    @ApiModelProperty(value = "备用字段",required = true)
    private int tentative1;
    @ApiModelProperty(value = "备用字段",required = true)
    private String tentative2;
    @ApiModelProperty(value = "备用字段",required = true)
    private String tentative3;

    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Integer getComcommodityprices() {
        return comcommodityprices;
    }

    public void setComcommodityprices(Integer comcommodityprices) {
        this.comcommodityprices = comcommodityprices;
    }

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public String getCompicture() {
        return compicture;
    }

    public void setCompicture(String compicture) {
        this.compicture = compicture == null ? null : compicture.trim();
    }

    public String getComchoiceness() {
        return comchoiceness;
    }

    public void setComchoiceness(String comchoiceness) {
        this.comchoiceness = comchoiceness == null ? null : comchoiceness.trim();
    }

    public String getComspecificationofgoods() {
        return comspecificationofgoods;
    }

    public void setComspecificationofgoods(String comspecificationofgoods) {
        this.comspecificationofgoods = comspecificationofgoods == null ? null : comspecificationofgoods.trim();
    }

    public String getComtradedescription() {
        return comtradedescription;
    }

    public void setComtradedescription(String comtradedescription) {
        this.comtradedescription = comtradedescription == null ? null : comtradedescription.trim();
    }

    public String getComgetacoupon() {
        return comgetacoupon;
    }

    public void setComgetacoupon(String comgetacoupon) {
        this.comgetacoupon = comgetacoupon == null ? null : comgetacoupon.trim();
    }

    public Integer getComcommodityprices(String s) {
        return comcommodityprices;
    }


    public Integer getComgoodscomments() {
        return comgoodscomments;
    }

    public void setComgoodscomments(Integer comgoodscomments) {
        this.comgoodscomments = comgoodscomments;
    }

    public Integer getComsourceofcommoditysales() {
        return comsourceofcommoditysales;
    }

    public void setComsourceofcommoditysales(Integer comsourceofcommoditysales) {
        this.comsourceofcommoditysales = comsourceofcommoditysales;
    }

    public Integer getCombrand() {
        return combrand;
    }

    public void setCombrand(Integer combrand) {
        this.combrand = combrand;
    }

    public Integer getComclassificationgoods() {
        return comclassificationgoods;
    }

    public void setComclassificationgoods(Integer comclassificationgoods) {
        this.comclassificationgoods = comclassificationgoods;
    }

    public int getTentative1() {
        return tentative1;
    }

    public void setTentative1(int tentative1) {
        this.tentative1 = tentative1;
    }

    public String getTentative2() {
        return tentative2;
    }

    public void setTentative2(String tentative2) {
        this.tentative2 = tentative2 == null ? null : tentative2.trim();
    }

    public String getTentative3() {
        return tentative3;
    }

    public void setTentative3(String tentative3) {
        this.tentative3 = tentative3 == null ? null : tentative3.trim();
    }
}