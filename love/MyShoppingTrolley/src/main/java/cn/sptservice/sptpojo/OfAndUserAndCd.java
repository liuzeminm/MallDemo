package cn.sptservice.sptpojo;

import java.util.Date;

public class OfAndUserAndCd {
    //送货地址
    private String userreceivingaddress;
    //图片
    private String compicture;
    //商品名称
    private String comname;
    //商品单价
    private Integer comcommodityprices;
    //订单号
    private String ofordernumber;
    //时间
    private Date ofordertime;
    //商品总价
    private double oforderprice;
    //商品数量
    private String oforder;

    public String getUserreceivingaddress() {
        return userreceivingaddress;
    }

    public void setUserreceivingaddress(String userreceivingaddress) {
        this.userreceivingaddress = userreceivingaddress;
    }

    public String getCompicture() {
        return compicture;
    }

    public void setCompicture(String compicture) {
        this.compicture = compicture;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public Integer getComcommodityprices() {
        return comcommodityprices;
    }

    public void setComcommodityprices(Integer comcommodityprices) {
        this.comcommodityprices = comcommodityprices;
    }

    public String getOfordernumber() {
        return ofordernumber;
    }

    public void setOfordernumber(String ofordernumber) {
        this.ofordernumber = ofordernumber;
    }

    public Date getOfordertime() {
        return ofordertime;
    }

    public void setOfordertime(Date ofordertime) {
        this.ofordertime = ofordertime;
    }

    public double getOforderprice() {
        return oforderprice;
    }

    public void setOforderprice(double oforderprice) {
        this.oforderprice = oforderprice;
    }

    public String getOforder() {
        return oforder;
    }

    public void setOforder(String oforder) {
        this.oforder = oforder;
    }
}
