package cn.pojo;

public class Prerogative {
    private Integer pgid;

    private String pgtype;

    private String pgcontent;

    public Integer getPgid() {
        return pgid;
    }

    public void setPgid(Integer pgid) {
        this.pgid = pgid;
    }

    public String getPgtype() {
        return pgtype;
    }

    public void setPgtype(String pgtype) {
        this.pgtype = pgtype == null ? null : pgtype.trim();
    }

    public String getPgcontent() {
        return pgcontent;
    }

    public void setPgcontent(String pgcontent) {
        this.pgcontent = pgcontent == null ? null : pgcontent.trim();
    }
}