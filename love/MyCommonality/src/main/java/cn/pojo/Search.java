package cn.pojo;

public class Search {
    private Integer shid;

    private String shtype;

    public Integer getShid() {
        return shid;
    }

    public void setShid(Integer shid) {
        this.shid = shid;
    }

    public String getShtype() {
        return shtype;
    }

    public void setShtype(String shtype) {
        this.shtype = shtype == null ? null : shtype.trim();
    }
}