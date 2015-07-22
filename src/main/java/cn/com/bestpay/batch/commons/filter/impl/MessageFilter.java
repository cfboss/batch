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
 * 2015/7/22 0022 13:41               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;


import cn.com.bestpay.batch.commons.context.BatchContext;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;

public class MessageFilter implements Filter {


    @Override
    public void doFilter(BatchContext batchContext, FilterChain chain) {
        System.out.println("MessageFilter before");
        chain.doFilter(batchContext);
        System.out.println("MessageFilter after");
    }
}
