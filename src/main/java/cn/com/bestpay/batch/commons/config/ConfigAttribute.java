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


public class ConfigAttribute {
    private FtpConfigAttribute ftpConfigAttribute;
    private FileConfigAttribute fileConfigAttribute;
    private String message;

    public FtpConfigAttribute getFtpConfigAttribute() {
        return ftpConfigAttribute;
    }

    public void setFtpConfigAttribute(FtpConfigAttribute ftpConfigAttribute) {
        this.ftpConfigAttribute = ftpConfigAttribute;
    }

    public FileConfigAttribute getFileConfigAttribute() {
        return fileConfigAttribute;
    }

    public void setFileConfigAttribute(FileConfigAttribute fileConfigAttribute) {
        this.fileConfigAttribute = fileConfigAttribute;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
