package cn.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel(value="Useri对象",description="用户对象Useri")
public class Useri {
    @ApiModelProperty(value="用户id",required = true)
    private Integer userid;
    @ApiModelProperty(value="用户名",required = true)
    private String username;
    @ApiModelProperty(value="用户头像",required = true)
    private String useravatar;
    @ApiModelProperty(value="用户登录密码",required = true)
    private String userloginpassword;
    @ApiModelProperty(value="用户支付密码",required = true)
    private String userpaymentpassword;
    @ApiModelProperty(value="用户收货信息",required = true)
    private String usergoodsreceivinginformation;
    @ApiModelProperty(value="用户点赞",required = true)
    private Integer userlike;
    @ApiModelProperty(value="用户评论",required = true)
    private String usercomment;
    @ApiModelProperty(value="用户署劵",required = true)
    private String userpotatostamps;
    @ApiModelProperty(value="用户购物车",required = true)
    private Integer usershoppingcart;
    @ApiModelProperty(value="用户收货地址",required = true)
    private String userreceivingaddress;
    @ApiModelProperty(value="用户身份证号码",required = true)
    private Integer useridnumber;
    @ApiModelProperty(value="收藏",required = true)
    private Integer usercollect;
    @ApiModelProperty(value="标识",required = true)
    private Integer useridentification;
    @ApiModelProperty(value="用户消息",required = true)
    private Integer usermessage;
    @ApiModelProperty(value="黑卡会员",required = true)
    private Integer usermember;
    @ApiModelProperty(value="用户手机号",required = true)
    private String userphone;
    @ApiModelProperty(value="出生年月",required = true)
    private String userdatebirth;
    @ApiModelProperty(value="性别",required = true)
    private String usersex;
    @ApiModelProperty(value="常住地",required = true)
    private String useroftensite;
    @ApiModelProperty(value="null",required = true)
    private String tentative3;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseravatar() {
        return useravatar;
    }

    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar == null ? null : useravatar.trim();
    }

    public String getUserloginpassword() {
        return userloginpassword;
    }

    public void setUserloginpassword(String userloginpassword) {
        this.userloginpassword = userloginpassword == null ? null : userloginpassword.trim();
    }

    public String getUserpaymentpassword() {
        return userpaymentpassword;
    }

    public void setUserpaymentpassword(String userpaymentpassword) {
        this.userpaymentpassword = userpaymentpassword == null ? null : userpaymentpassword.trim();
    }

    public String getUsergoodsreceivinginformation() {
        return usergoodsreceivinginformation;
    }

    public void setUsergoodsreceivinginformation(String usergoodsreceivinginformation) {
        this.usergoodsreceivinginformation = usergoodsreceivinginformation == null ? null : usergoodsreceivinginformation.trim();
    }

    public Integer getUserlike() {
        return userlike;
    }

    public void setUserlike(Integer userlike) {
        this.userlike = userlike;
    }

    public String getUsercomment() {
        return usercomment;
    }

    public void setUsercomment(String usercomment) {
        this.usercomment = usercomment == null ? null : usercomment.trim();
    }

    public String getUserpotatostamps() {
        return userpotatostamps;
    }

    public void setUserpotatostamps(String userpotatostamps) {
        this.userpotatostamps = userpotatostamps == null ? null : userpotatostamps.trim();
    }

    public Integer getUsershoppingcart() {
        return usershoppingcart;
    }

    public void setUsershoppingcart(Integer usershoppingcart) {
        this.usershoppingcart = usershoppingcart;
    }

    public String getUserreceivingaddress() {
        return userreceivingaddress;
    }

    public void setUserreceivingaddress(String userreceivingaddress) {
        this.userreceivingaddress = userreceivingaddress == null ? null : userreceivingaddress.trim();
    }

    public Integer getUseridnumber() {
        return useridnumber;
    }

    public void setUseridnumber(Integer useridnumber) {
        this.useridnumber = useridnumber;
    }

    public Integer getUsercollect() {
        return usercollect;
    }

    public void setUsercollect(Integer usercollect) {
        this.usercollect = usercollect;
    }

    public Integer getUseridentification() {
        return useridentification;
    }

    public void setUseridentification(Integer useridentification) {
        this.useridentification = useridentification;
    }

    public Integer getUsermessage() {
        return usermessage;
    }

    public void setUsermessage(Integer usermessage) {
        this.usermessage = usermessage;
    }

    public Integer getUsermember() {
        return usermember;
    }

    public void setUsermember(Integer usermember) {
        this.usermember = usermember;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUserdatebirth() {
        return userdatebirth;
    }

    public void setUserdatebirth(String userdatebirth) {
        this.userdatebirth = userdatebirth;
    }
    public String getUsersex() { return usersex; }

    public void setUsersex(String usersex) { this.usersex = usersex; }

    public String getUseroftensite() { return useroftensite; }

    public void setUseroftensite(String useroftensite) { this.useroftensite = useroftensite; }

    public String getTentative3() {
        return tentative3;
    }

    public void setTentative3(String tentative3) {
        this.tentative3 = tentative3 == null ? null : tentative3.trim();
    }
}