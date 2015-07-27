/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      ConfigAttribute.java
 * Create on:      2015/7/21 0021 11:28
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:28               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.config;


import java.util.List;
import java.util.Map;

public class ConfigAttribute {
    private FtpConfigAttribute ftpConfigAttribute;
    private List<FileConfigAttribute> fileConfigAttribute;
    private Map<String,String> fileMap;
    private String jobId;
    private String stepType;
    private int stepOrder;
    private boolean fileReturn;
    private String message;

    public FtpConfigAttribute getFtpConfigAttribute() {
        return ftpConfigAttribute;
    }

    public void setFtpConfigAttribute(FtpConfigAttribute ftpConfigAttribute) {
        this.ftpConfigAttribute = ftpConfigAttribute;
    }

    public List<FileConfigAttribute> getFileConfigAttribute() {
        return fileConfigAttribute;
    }

    public Map<String, String> getFileMap() {
        return fileMap;
    }

    public void setFileMap(Map<String, String> fileMap) {
        this.fileMap = fileMap;
    }

    public void setFileConfigAttribute(List<FileConfigAttribute> fileConfigAttribute) {
        this.fileConfigAttribute = fileConfigAttribute;
    }

    public boolean isFileReturn() {
        return fileReturn;
    }

    public void setFileReturn(boolean fileReturn) {
        this.fileReturn = fileReturn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getFileType() {
        return stepType;
    }

    public void setFileType(String fileType) {
        this.stepType = fileType;
    }

    public String getStepType() {
        return stepType;
    }

    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    public int getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(int stepOrder) {
        this.stepOrder = stepOrder;
    }
}
