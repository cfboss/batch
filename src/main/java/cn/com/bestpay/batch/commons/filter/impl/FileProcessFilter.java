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
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileProcessFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        //对文件的统计 包括文件数 文件大小等
        //todo
        logger.info("开始对需要处理的文件进行统计");
        chain.doFilter(configAttribute);
        logger.info("开始进行回盘文件进行统计");
    }
}
