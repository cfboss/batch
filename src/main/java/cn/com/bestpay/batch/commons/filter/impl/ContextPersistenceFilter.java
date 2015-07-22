/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      DataFilter.java
 * Create on:      2015/7/21 0021 11:14
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:14               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.context.BatchContext;
import cn.com.bestpay.batch.commons.context.BatchContextHolder;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;

public class ContextPersistenceFilter implements Filter{
    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        BatchContext batchContext = BatchContextHolder.getBatchContext();
        if (batchContext == null) {
            batchContext = new BatchContext();
            BatchContextHolder.saveBatchContext(batchContext);
        }
        try{
            chain.doFilter(configAttribute);

        } finally {
            //持久化Context到数据库并清除环境
            // todo
            BatchContextHolder.removeBatchContext();

        }

    }
}
