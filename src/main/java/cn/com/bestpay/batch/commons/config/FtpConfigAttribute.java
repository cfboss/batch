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


public class FtpConfigAttribute {
    public static int MODE_POSITIVE = 0;
    public static int MODE_NEGATIVE = 1;
    private String address;
    private int port;
    private String username;
    private String password;
    private String directory;
    private int ftpMode;

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

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public int getFtpMode() {
        return ftpMode;
    }

    public void setFtpMode(int ftpMode) {
        this.ftpMode = ftpMode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FtpConfigAttribute{");
        sb.append("address='").append(address).append('\'');
        sb.append(", port=").append(port);
        sb.append(", username='").append(username).append('\'');
        sb.append(", directory='").append(directory).append('\'');
        sb.append(", ftpMode=").append(ftpMode);
        sb.append('}');
        return sb.toString();
    }
}
