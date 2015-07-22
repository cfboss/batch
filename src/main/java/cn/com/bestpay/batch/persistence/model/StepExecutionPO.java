package cn.com.bestpay.batch.persistence.model;

import java.math.BigDecimal;
import java.util.Date;

public class StepExecutionPO {
    private String id;

    private BigDecimal version;

    private String stepName;

    private String jobExecutionId;

    private Date startTime;

    private Date endTime;

    private String status;

    private BigDecimal commitCount;

    private BigDecimal readCount;

    private BigDecimal filterCount;

    private BigDecimal writeCount;

    private BigDecimal readSkipCount;

    private BigDecimal writeSkipCount;

    private BigDecimal processSkipCount;

    private BigDecimal rollbackCount;

    private String exitCode;

    private String exitMessage;

    private Date lastUpdated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

    public String getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId == null ? null : jobExecutionId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(BigDecimal commitCount) {
        this.commitCount = commitCount;
    }

    public BigDecimal getReadCount() {
        return readCount;
    }

    public void setReadCount(BigDecimal readCount) {
        this.readCount = readCount;
    }

    public BigDecimal getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(BigDecimal filterCount) {
        this.filterCount = filterCount;
    }

    public BigDecimal getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(BigDecimal writeCount) {
        this.writeCount = writeCount;
    }

    public BigDecimal getReadSkipCount() {
        return readSkipCount;
    }

    public void setReadSkipCount(BigDecimal readSkipCount) {
        this.readSkipCount = readSkipCount;
    }

    public BigDecimal getWriteSkipCount() {
        return writeSkipCount;
    }

    public void setWriteSkipCount(BigDecimal writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
    }

    public BigDecimal getProcessSkipCount() {
        return processSkipCount;
    }

    public void setProcessSkipCount(BigDecimal processSkipCount) {
        this.processSkipCount = processSkipCount;
    }

    public BigDecimal getRollbackCount() {
        return rollbackCount;
    }

    public void setRollbackCount(BigDecimal rollbackCount) {
        this.rollbackCount = rollbackCount;
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode == null ? null : exitCode.trim();
    }

    public String getExitMessage() {
        return exitMessage;
    }

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage == null ? null : exitMessage.trim();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}