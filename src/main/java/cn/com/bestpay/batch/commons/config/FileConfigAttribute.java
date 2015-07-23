/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      FileConfigAttribute.java
 * Create on:      2015/7/21 0021 11:21
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:21               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.config;


import cn.com.bestpay.batch.commons.constant.Constant;

import java.util.Date;

public class FileConfigAttribute {
    private String fileKey;
    private String fileName;
    private String fileReturnName;
    private String directory;
    private long fileSize;
    private long fileReturnSize;
    private long rowTotalCount;
    private long rowSuccessCount;
    private long rowFailCount;
    private long rowSkipCount;
    private Date fileCreateDate;
    private boolean fileReturn;

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileReturnName() {
        return fileReturnName;
    }

    public void setFileReturnName(String fileReturnName) {
        this.fileReturnName = fileReturnName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getFileReturnSize() {
        return fileReturnSize;
    }

    public void setFileReturnSize(long fileReturnSize) {
        this.fileReturnSize = fileReturnSize;
    }

    public long getRowTotalCount() {
        return rowTotalCount;
    }

    public void setRowTotalCount(long rowTotalCount) {
        this.rowTotalCount = rowTotalCount;
    }

    public long getRowSuccessCount() {
        return rowSuccessCount;
    }

    public void setRowSuccessCount(long rowSuccessCount) {
        this.rowSuccessCount = rowSuccessCount;
    }

    public long getRowFailCount() {
        return rowFailCount;
    }

    public void setRowFailCount(long rowFailCount) {
        this.rowFailCount = rowFailCount;
    }

    public long getRowSkipCount() {
        return rowSkipCount;
    }

    public void setRowSkipCount(long rowSkipCount) {
        this.rowSkipCount = rowSkipCount;
    }

    public Date getFileCreateDate() {
        return fileCreateDate;
    }

    public void setFileCreateDate(Date fileCreateDate) {
        this.fileCreateDate = fileCreateDate;
    }

    public boolean isFileReturn() {
        return fileReturn;
    }

    public void setFileReturn(boolean fileReturn) {
        this.fileReturn = fileReturn;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String fileInitData(){
        StringBuffer sb = new StringBuffer(Constant.Symbol.ENTER);
        sb.append("文件标识:"+fileKey).append(Constant.Symbol.ENTER)
                .append("文件名:"+fileName).append(Constant.Symbol.ENTER)
                .append("文件大小:"+fileSize).append(Constant.Symbol.ENTER)
                .append("文件总条目数:"+rowTotalCount);
        return sb.toString();
    }

    public String fileFinishData(){
        StringBuffer sb = new StringBuffer(Constant.Symbol.ENTER);
        sb.append("文件标识:"+fileKey).append(Constant.Symbol.ENTER);
        if (fileReturn){
            sb.append("回盘文件名: " + fileName).append(Constant.Symbol.ENTER)
                    .append("回盘文件大小: " + fileSize).append(Constant.Symbol.ENTER);
        }

        sb.append("文件总条目数:  " + rowTotalCount)
                .append("文件处理成功条目数： " + rowSuccessCount).append(Constant.Symbol.ENTER)
                .append("文件处理失败条目数:  " + rowFailCount).append(Constant.Symbol.ENTER)
                .append("文件处理跳过条目数:  " + rowSkipCount).append(Constant.Symbol.ENTER);
        return sb.toString();
    }

}
