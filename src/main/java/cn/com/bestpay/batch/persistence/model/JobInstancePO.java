package cn.com.bestpay.batch.persistence.model;

import java.math.BigDecimal;

public class JobInstancePO {
    private String id;

    private BigDecimal version;

    private String jobName;

    private String jobKey;

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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(String jobKey) {
        this.jobKey = jobKey == null ? null : jobKey.trim();
    }
}