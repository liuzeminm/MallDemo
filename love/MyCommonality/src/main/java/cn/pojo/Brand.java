package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="品牌",description="品牌属性")
public class Brand {
    @ApiModelProperty(value = "品牌id",required = true)
    private Integer bdid;
    @ApiModelProperty(value = "品牌标签",required = true)
    private String bdbrandlabel;
    @ApiModelProperty(value = "品牌介绍",required = true)
    private String bdintroduction;
    @ApiModelProperty(value = "品牌粉丝",required = true)
    private String bdfansof;
    @ApiModelProperty(value = "品牌名称",required = true)
    private String bdname;
    @ApiModelProperty(value = "品牌优惠",required = true)
    private String bddiscount;
    @ApiModelProperty(value = "品牌商品",required = true)
    private Integer bdgoods;
    @ApiModelProperty(value = "品牌笔记",required = true)
    private Integer bdnotes;
    @ApiModelProperty(value = "商品分类",required = true)
    private Integer bdclassificationgoods;

    public Integer getBdid() {
        return bdid;
    }

    public void setBdid(Integer bdid) {
        this.bdid = bdid;
    }

    public String getBdbrandlabel() {
        return bdbrandlabel;
    }

    public void setBdbrandlabel(String bdbrandlabel) {
        this.bdbrandlabel = bdbrandlabel == null ? null : bdbrandlabel.trim();
    }

    public String getBdintroduction() {
        return bdintroduction;
    }

    public void setBdintroduction(String bdintroduction) {
        this.bdintroduction = bdintroduction == null ? null : bdintroduction.trim();
    }

    public String getBdfansof() {
        return bdfansof;
    }

    public void setBdfansof(String bdfansof) {
        this.bdfansof = bdfansof == null ? null : bdfansof.trim();
    }

    public String getBdname() {
        return bdname;
    }

    public void setBdname(String bdname) {
        this.bdname = bdname == null ? null : bdname.trim();
    }

    public String getBddiscount() {
        return bddiscount;
    }

    public void setBddiscount(String bddiscount) {
        this.bddiscount = bddiscount == null ? null : bddiscount.trim();
    }

    public Integer getBdgoods() {
        return bdgoods;
    }

    public void setBdgoods(Integer bdgoods) {
        this.bdgoods = bdgoods;
    }

    public Integer getBdnotes() {
        return bdnotes;
    }

    public void setBdnotes(Integer bdnotes) {
        this.bdnotes = bdnotes;
    }

    public Integer getBdclassificationgoods() {
        return bdclassificationgoods;
    }

    public void setBdclassificationgoods(Integer bdclassificationgoods) {
        this.bdclassificationgoods = bdclassificationgoods;
    }
}