/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      FileProcessFilter.java
 * Create on:      2015/7/21 0021 11:09
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:09                 袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;

import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FtpConfigAttribute;
import cn.com.bestpay.batch.commons.context.BatchContextHolder;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.exception.FileDownloadException;
import cn.com.bestpay.batch.commons.exception.FtpException;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import cn.com.bestpay.batch.commons.strategy.BatchStrategy;
import cn.com.bestpay.batch.commons.strategy.ftp.FtpStrategy;
import cn.com.bestpay.batch.commons.strategy.ftp.SFtpStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FtpProcessFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        logger.info("开始下载文件");
        //处理文件下载 并将下载的文件放入环境变量
        try{
            fileDownload(configAttribute);
        } catch (FtpException e){
            logger.error("FTP连接文件下载错误");
            throw e;
        }

        BatchContextHolder.getBatchContext().save("test","test batch context");
        chain.doFilter(configAttribute);

        //处理文件上传 并将上传的文件放入环境变量
        if (configAttribute.isFileReturn()){
            logger.info("开始上传文件");
            // todo
        } else {
            logger.info("检测到不需要上传文件");
        }
    }

    private void fileDownload(ConfigAttribute configAttribute) throws FtpException,FileDownloadException{
        BatchStrategy batchStrategy = null;
        FtpConfigAttribute ftpConfigAttribute = configAttribute.getFtpConfigAttribute();
        if (ftpConfigAttribute.getFtpType()==0){//类型为 ftp
            batchStrategy = new FtpStrategy();
        }else if (ftpConfigAttribute.getFtpType()==1){//类型为sftp
            batchStrategy = new SFtpStrategy();
        } else {
            throw new FtpException("不支持的FTP传输类型");
        }
        ftpFileDownload(batchStrategy,configAttribute);
    }

    private void ftpFileDownload(BatchStrategy batchStrategy,ConfigAttribute configAttribute){
        if (batchStrategy !=null){
            batchStrategy.strategy(configAttribute);
        }
    }





}
