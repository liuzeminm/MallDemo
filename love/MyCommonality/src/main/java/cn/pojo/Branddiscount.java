package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="特价商品",description="特价商品优惠活动")
public class Branddiscount {
    @ApiModelProperty(value = "特价商品id",required = true)
    private Integer ddid;
    @ApiModelProperty(value = "限时特价",required = true)
    private Double ddtimedspecials;
    @ApiModelProperty(value = "优惠券",required = true)
    private String dddiscountCoupon;

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public Double getDdtimedspecials() {
        return ddtimedspecials;
    }

    public void setDdtimedspecials(Double ddtimedspecials) {
        this.ddtimedspecials = ddtimedspecials;
    }

    public String getDddiscountCoupon() {
        return dddiscountCoupon;
    }

    public void setDddiscountCoupon(String dddiscountCoupon) {
        this.dddiscountCoupon = dddiscountCoupon == null ? null : dddiscountCoupon.trim();
    }
}