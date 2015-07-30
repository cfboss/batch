/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      Batch.java
 * Create on:      2015/7/28 0028 9:05
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/28 0028 9:05               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.message.vo;


import java.util.List;

public class BatchReqBo {
    private String jobInstanceId;
    private List<String> fileNames;
    private boolean fileReturn;

    public String getJobInstanceId() {
        return jobInstanceId;
    }

    public void setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    public List<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }

    public boolean isFileReturn() {
        return fileReturn;
    }

    public void setFileReturn(boolean fileReturn) {
        this.fileReturn = fileReturn;
    }
}
