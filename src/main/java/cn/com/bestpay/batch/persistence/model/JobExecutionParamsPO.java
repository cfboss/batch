package cn.com.bestpay.batch.persistence.model;

import java.math.BigDecimal;
import java.util.Date;

public class JobExecutionParamsPO {
    private String id;

    private String typeCd;

    private String keyName;

    private String stringVal;

    private Date dateVal;

    private BigDecimal longVal;

    private Short doubleVal;

    private String identifying;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd == null ? null : typeCd.trim();
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public String getStringVal() {
        return stringVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal == null ? null : stringVal.trim();
    }

    public Date getDateVal() {
        return dateVal;
    }

    public void setDateVal(Date dateVal) {
        this.dateVal = dateVal;
    }

    public BigDecimal getLongVal() {
        return longVal;
    }

    public void setLongVal(BigDecimal longVal) {
        this.longVal = longVal;
    }

    public Short getDoubleVal() {
        return doubleVal;
    }

    public void setDoubleVal(Short doubleVal) {
        this.doubleVal = doubleVal;
    }

    public String getIdentifying() {
        return identifying;
    }

    public void setIdentifying(String identifying) {
        this.identifying = identifying == null ? null : identifying.trim();
    }
}