package cn.pojo;

public class Report {
    private Integer reportid;

    private String reportmessage;

    private String reportpicture;

    private Integer reporttype;

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public String getReportmessage() {
        return reportmessage;
    }

    public void setReportmessage(String reportmessage) {
        this.reportmessage = reportmessage == null ? null : reportmessage.trim();
    }

    public String getReportpicture() {
        return reportpicture;
    }

    public void setReportpicture(String reportpicture) {
        this.reportpicture = reportpicture == null ? null : reportpicture.trim();
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }
}