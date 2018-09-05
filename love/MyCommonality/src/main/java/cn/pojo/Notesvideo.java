package cn.pojo;

public class Notesvideo {
    private Integer noid;

    private String noalbum;

    private String nowuli;

    public Integer getNoid() {
        return noid;
    }

    public void setNoid(Integer noid) {
        this.noid = noid;
    }

    public String getNoalbum() {
        return noalbum;
    }

    public void setNoalbum(String noalbum) {
        this.noalbum = noalbum == null ? null : noalbum.trim();
    }

    public String getNowuli() {
        return nowuli;
    }

    public void setNowuli(String nowuli) {
        this.nowuli = nowuli == null ? null : nowuli.trim();
    }
}