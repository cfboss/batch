package cn.com.bestpay.batch.persistence.model;

public class JobExecutionContextPO {
    private String id;

    private String shortContext;

    private String longContext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShortContext() {
        return shortContext;
    }

    public void setShortContext(String shortContext) {
        this.shortContext = shortContext == null ? null : shortContext.trim();
    }

    public String getLongContext() {
        return longContext;
    }

    public void setLongContext(String longContext) {
        this.longContext = longContext == null ? null : longContext.trim();
    }
}