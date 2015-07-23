/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      FileMapAttribute.java
 * Create on:      2015/7/23 0023 14:58
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/23 0023 14:58               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.config;


public class FileMapAttribute {
    private String fileName;
    private String fileReturnName;

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
}
