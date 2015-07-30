/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      MessageFilter.java
 * Create on:      2015/7/22 0022 13:41
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 13:41               	袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageFilter implements Filter {
    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        logger.info("接收到处理请求,请求信息:{}",configAttribute.getMessage());
        // todo 请求消息进行加工
        chain.doFilter(configAttribute);
        // todo 响应消息进行加工
        logger.info("完成处理请求,响应信息:{}", configAttribute.getMessage());
    }
}
