package cn.pojo;

public class Notefiltering {
    private Integer nfid;

    private String nfgeneralnotes;

    private String nfvideonotes;

    private String nflongnotes;

    public Integer getNfid() {
        return nfid;
    }

    public void setNfid(Integer nfid) {
        this.nfid = nfid;
    }

    public String getNfgeneralnotes() {
        return nfgeneralnotes;
    }

    public void setNfgeneralnotes(String nfgeneralnotes) {
        this.nfgeneralnotes = nfgeneralnotes == null ? null : nfgeneralnotes.trim();
    }

    public String getNfvideonotes() {
        return nfvideonotes;
    }

    public void setNfvideonotes(String nfvideonotes) {
        this.nfvideonotes = nfvideonotes == null ? null : nfvideonotes.trim();
    }

    public String getNflongnotes() {
        return nflongnotes;
    }

    public void setNflongnotes(String nflongnotes) {
        this.nflongnotes = nflongnotes == null ? null : nflongnotes.trim();
    }
}