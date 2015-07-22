/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobExecutionFilterChain.java
 * Create on:      2015/7/22 0022 13:46
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 13:46               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter;


import cn.com.bestpay.batch.commons.context.BatchContext;

public class JobExecutionFilterChain implements FilterChain {
    @Override
    public void doFilter(BatchContext batchContext) {
        System.out.println("job start");
    }
}
