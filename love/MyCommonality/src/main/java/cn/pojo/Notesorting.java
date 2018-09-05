package cn.pojo;

import java.util.Date;

public class Notesorting {
    private Integer nsid;

    private String nsheat;

    private Date nstime;

    public Integer getNsid() {
        return nsid;
    }

    public void setNsid(Integer nsid) {
        this.nsid = nsid;
    }

    public String getNsheat() {
        return nsheat;
    }

    public void setNsheat(String nsheat) {
        this.nsheat = nsheat == null ? null : nsheat.trim();
    }

    public Date getNstime() {
        return nstime;
    }

    public void setNstime(Date nstime) {
        this.nstime = nstime;
    }
}