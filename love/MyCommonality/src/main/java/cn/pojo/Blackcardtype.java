package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="黑卡表",description="黑卡表分类")
public class Blackcardtype {
    @ApiModelProperty(value = "黑卡表id",required = true)
    private Integer bctid;
    @ApiModelProperty(value = "黑卡类型",required = true)
    private String bctype;

    public Integer getBctid() {
        return bctid;
    }

    public void setBctid(Integer bctid) {
        this.bctid = bctid;
    }

    public String getBctype() {
        return bctype;
    }

    public void setBctype(String bctype) {
        this.bctype = bctype == null ? null : bctype.trim();
    }
}