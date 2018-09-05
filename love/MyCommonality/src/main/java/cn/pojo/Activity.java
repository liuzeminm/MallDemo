package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="商家活动",description="商家活动")
public class Activity {
    @ApiModelProperty(value = "商家活动id",required = true)
    private Integer actid;
    @ApiModelProperty(value = "专场",required = true)
    private Double actoriginalcost;

    public Integer getActid() {
        return actid;
    }

    public void setActid(Integer actid) {
        this.actid = actid;
    }

    public Double getActoriginalcost() {
        return actoriginalcost;
    }

    public void setActoriginalcost(Double actoriginalcost) {
        this.actoriginalcost = actoriginalcost;
    }
}