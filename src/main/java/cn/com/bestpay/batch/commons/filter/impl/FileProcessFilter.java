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
 * 2015/7/21 0021 11:09               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;
import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileMapAttribute;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.exception.FileProcessException;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import cn.com.bestpay.utils.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FileProcessFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        logger.info("开始对需要处理的文件进行预处理:");
        try {
            filePreProcess(configAttribute);
            logger.info("完成对文件的预处理工作");
        } catch (IOException e) {
            logger.error("文件统计时发生异常");
            FileProcessException ex = new FileProcessException("文件预处理进行统计时发生异常");
            ex.setStackTrace(e.getStackTrace());
            throw ex;
        }
        chain.doFilter(configAttribute);
        logger.info("开始进行处理后的文件进行后统计");
        try {
            filePostProcess(configAttribute.getFileConfigAttribute());
            logger.info("完成对文件的后处理工作");
        } catch (IOException e) {
            logger.error("文件统计时发生异常");
            FileProcessException ex = new FileProcessException("文件预处理进行统计时发生异常");
            ex.setStackTrace(e.getStackTrace());
            throw ex;
        }

    }

    private void filePreProcess(ConfigAttribute configAttribute) throws IOException {
        String directory = configAttribute.getFtpConfigAttribute().getLocalPath();
        List<FileConfigAttribute> fileConfigAttributes = configAttribute.getFileConfigAttribute();
        Set<Map.Entry<String, String>> sets = configAttribute.getFileMap().entrySet();
        for (Map.Entry<String,String> entry: sets){
            String fileName = entry.getKey();
            String fileReturnName = entry.getValue();
            createReturnFile(directory,fileReturnName);
            for ( FileConfigAttribute fileConfigAttribute : fileConfigAttributes) {
                if (fileName.equals(fileConfigAttribute.getFileName())){
                    fileConfigAttribute.setFileReturnName(fileReturnName);
                }
            }
        }

    }

    private void createReturnFile(String directory, String filename) throws IOException {
        FileUtil.createNewFile(directory,filename);
    }

    private void filePostProcess(List<FileConfigAttribute> fileConfigAttributes) throws IOException {
        for (FileConfigAttribute fileConfigAttribute : fileConfigAttributes) {
            String fileReturnName= fileConfigAttribute.getFileReturnName();
            String directory = fileConfigAttribute.getDirectory();
            long fileSize = FileUtil.getFileSize(directory,fileReturnName);
            fileConfigAttribute.setFileReturnSize(fileSize);
        }
    }

}
