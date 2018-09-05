package cn.pojo;

public class Sourceofcommoditysales {
    private Integer socsid;

    private String socsscalping;

    private String socsbrandshop;

    private Integer socsmerchant;

    public Integer getSocsid() {
        return socsid;
    }

    public void setSocsid(Integer socsid) {
        this.socsid = socsid;
    }

    public String getSocsscalping() {
        return socsscalping;
    }

    public void setSocsscalping(String socsscalping) {
        this.socsscalping = socsscalping == null ? null : socsscalping.trim();
    }

    public String getSocsbrandshop() {
        return socsbrandshop;
    }

    public void setSocsbrandshop(String socsbrandshop) {
        this.socsbrandshop = socsbrandshop == null ? null : socsbrandshop.trim();
    }

    public Integer getSocsmerchant() {
        return socsmerchant;
    }

    public void setSocsmerchant(Integer socsmerchant) {
        this.socsmerchant = socsmerchant;
    }
}