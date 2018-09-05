package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="我的专辑",description="我的专辑")
public class Collect {
    @ApiModelProperty(value = "我的专辑id",required = true)
    private Integer collectid;
    @ApiModelProperty(value = "我的专辑",required = true)
    private String collectmyalbum;

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public String getCollectmyalbum() {
        return collectmyalbum;
    }

    public void setCollectmyalbum(String collectmyalbum) {
        this.collectmyalbum = collectmyalbum == null ? null : collectmyalbum.trim();
    }
}