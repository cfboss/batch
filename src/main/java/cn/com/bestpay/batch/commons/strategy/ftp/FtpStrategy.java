/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      FtpNegetiveStrategy.java
 * Create on:      2015/7/21 0021 11:13
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:13               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.strategy.ftp;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileConfigAttribute;
import cn.com.bestpay.batch.commons.config.FtpConfigAttribute;
import cn.com.bestpay.batch.commons.exception.FtpException;
import cn.com.bestpay.batch.commons.strategy.AbstractBatchStrategy;
import cn.com.bestpay.utils.FtpUtil;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class FtpStrategy extends AbstractBatchStrategy{
    @Override
    public Object strategy(ConfigAttribute configAttribute) throws FtpException{
        FtpConfigAttribute ftpConfigAttribute = configAttribute.getFtpConfigAttribute();
        if (ftpConfigAttribute.isDownload()){
            download(ftpConfigAttribute);
            createFileAttribute(configAttribute);
        }

        // todo 判断非空
        return null;

    }

    private void createFileAttribute(ConfigAttribute configAttribute) {
        FtpConfigAttribute ftpAttribute = configAttribute.getFtpConfigAttribute();
        List<FileConfigAttribute> fileAttributes = Lists.newArrayList();
        Set<String> fileNames = configAttribute.getFileMap().keySet();
        for (String fileName : fileNames) {
            FileConfigAttribute fileAttribute = new FileConfigAttribute();
            fileAttribute.setFileName(fileName);
            fileAttribute.setDirectory(ftpAttribute.getLocalPath());
            fileAttribute.setFileCreateDate(new Date());
            fileAttributes.add(fileAttribute);
        }
        configAttribute.setFileConfigAttribute(fileAttributes);
    }

    private void download(FtpConfigAttribute ftpConfigAttribute) throws FtpException {
        if ( ftpConfigAttribute.getFtpMode() == 0 ) {
            String username = ftpConfigAttribute.getUsername();
            String password = ftpConfigAttribute.getPassword();
            String address = ftpConfigAttribute.getAddress();
            String serverPath = ftpConfigAttribute.getServerPath();
            String localPath = ftpConfigAttribute.getLocalPath();
            List<String> fileNames = ftpConfigAttribute.getFileNames();
            int port = ftpConfigAttribute.getPort()==0?21:ftpConfigAttribute.getPort();
            try {
                FtpUtil.downloadFile(address,port,username,password,serverPath,localPath,fileNames);
            } catch (IOException e) {
                FtpException ftpException = new FtpException("Ftp下载出现错误");
                ftpException.setStackTrace(e.getStackTrace());
                throw  ftpException;
            }
        }
    }
    private void upload(){}

}
