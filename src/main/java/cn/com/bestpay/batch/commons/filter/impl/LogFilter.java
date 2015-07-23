/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      LogFilter.java
 * Create on:      2015/7/21 0021 13:05
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 13:05               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileConfigAttribute;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        logger.info("开始处理对账任务,信息:{}", configAttribute.getMessage());
        logger.info("记录FTP信息:{}",configAttribute.getFtpConfigAttribute());
        logger.info("记录文件信息,文件数量:{}",configAttribute.getFileConfigAttribute().size());
        for (FileConfigAttribute fc : configAttribute.getFileConfigAttribute()){
            logger.info("记录文件信息:{}",fc.fileInitData());
        }

        chain.doFilter(configAttribute);

        logger.info("记录文件信息,文件数量:{}",configAttribute.getFileConfigAttribute().size());
        for (FileConfigAttribute fc : configAttribute.getFileConfigAttribute()){
            logger.info("记录文件信息:{}",fc.fileFinishData());
        }
        logger.info("记录文件信息:{}",configAttribute.getFileConfigAttribute().size());
        logger.info("完成对账任务处理,信息:{},开始统计本次处理的数据信息", configAttribute.getMessage());

    }
}
