package cn.pojo;

public class Orderprice {
    private Integer opid;

    private String optype;

    public Integer getOpid() {
        return opid;
    }

    public void setOpid(Integer opid) {
        this.opid = opid;
    }

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype == null ? null : optype.trim();
    }
}