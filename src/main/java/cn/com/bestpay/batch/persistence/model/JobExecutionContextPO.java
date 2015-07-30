package cn.com.bestpay.batch.persistence.model;

import java.util.Date;

public class JobExecutionContextPO {
    private String id;

    private String jobId;

    private String shortContext;

    private Date createTime;

    private String createUid;

    private Date updateTime;

    private String updateUid;

    private String checkUid;

    private Date checkTime;

    private String archiveUid;

    private Date archiveTime;

    private String checkFlag;

    private String archiveFlag;

    private String longContext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getShortContext() {
        return shortContext;
    }

    public void setShortContext(String shortContext) {
        this.shortContext = shortContext == null ? null : shortContext.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }

    public String getCheckUid() {
        return checkUid;
    }

    public void setCheckUid(String checkUid) {
        this.checkUid = checkUid == null ? null : checkUid.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getArchiveUid() {
        return archiveUid;
    }

    public void setArchiveUid(String archiveUid) {
        this.archiveUid = archiveUid == null ? null : archiveUid.trim();
    }

    public Date getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(Date archiveTime) {
        this.archiveTime = archiveTime;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getArchiveFlag() {
        return archiveFlag;
    }

    public void setArchiveFlag(String archiveFlag) {
        this.archiveFlag = archiveFlag == null ? null : archiveFlag.trim();
    }

    public String getLongContext() {
        return longContext;
    }

    public void setLongContext(String longContext) {
        this.longContext = longContext == null ? null : longContext.trim();
    }
}