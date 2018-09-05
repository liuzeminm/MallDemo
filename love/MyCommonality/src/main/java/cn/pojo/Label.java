package cn.pojo;

public class Label {
    private Integer labid;

    private String label;

    public Integer getLabid() {
        return labid;
    }

    public void setLabid(Integer labid) {
        this.labid = labid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}