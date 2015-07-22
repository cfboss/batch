/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      FilterChainTest.java
 * Create on:      2015/7/22 0022 13:38
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 13:38               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.filter;


import cn.com.bestpay.batch.commons.context.BatchContext;
import cn.com.bestpay.batch.commons.filter.GenericFilterChain;
import cn.com.bestpay.batch.commons.filter.impl.JobExecutionFilterChain;
import cn.com.bestpay.batch.commons.filter.impl.ContextPersistenceFilter;
import cn.com.bestpay.batch.commons.filter.impl.ExceptionProcessFilter;
import cn.com.bestpay.batch.commons.filter.impl.FileProcessFilter;
import cn.com.bestpay.batch.commons.filter.impl.MessageFilter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class FilterChainTest {
    /**
     * 测试过滤器流程
     */
    @Test
    public void testFilterChainFlow(){
        JobExecutionFilterChain jobChain = new JobExecutionFilterChain();
        MessageFilter messageFilter = new MessageFilter();
        ContextPersistenceFilter contextPersistenceFilter = new ContextPersistenceFilter();
        FileProcessFilter fileProcessFilter = new FileProcessFilter();
        ExceptionProcessFilter exceptionProcessFilter = new ExceptionProcessFilter();
        List list = Lists.newArrayList();
        list.add(messageFilter);
        list.add(exceptionProcessFilter);
        list.add(contextPersistenceFilter);
        list.add(fileProcessFilter);
        GenericFilterChain genericFilterChain = new GenericFilterChain(jobChain,list);
        //genericFilterChain.doFilter(new BatchContext());
    }
}
