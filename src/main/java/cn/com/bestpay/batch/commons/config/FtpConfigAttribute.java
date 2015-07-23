/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      FtpConfig.java
 * Create on:      2015/7/21 0021 11:21
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:21               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.config;


import java.util.List;

public class FtpConfigAttribute {
    public static int MODE_POSITIVE = 0;
    public static int MODE_NEGATIVE = 1;
    private String address;
    private int port;
    private String username;
    private String password;
    private String serverPath;
    private String localPath;
    private List<String> fileNames;
    /**
     * ftp 类型 0:ftp 1:sftp
     */
    private int ftpType;
    /**
     * 传输模式 0:被动模式 1:主动模式
     */
    private int ftpMode;

    private boolean isDownload;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServerPath() {
        return serverPath;
    }

    public void setServerPath(String serverPath) {
        this.serverPath = serverPath;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public List<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }

    public int getFtpType() {
        return ftpType;
    }

    public void setFtpType(int ftpType) {
        this.ftpType = ftpType;
    }

    public int getFtpMode() {
        return ftpMode;
    }

    public void setFtpMode(int ftpMode) {
        this.ftpMode = ftpMode;
    }

    public boolean isDownload() {
        return isDownload;
    }

    public void setDownload(boolean isDownload) {
        this.isDownload = isDownload;
    }

}
