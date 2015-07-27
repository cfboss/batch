/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      GenericBatchJob.java
 * Create on:      2015/7/27 0027 16:23
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/27 0027 16:23               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.job;


import cn.com.bestpay.batch.commons.context.BatchContext;
import cn.com.bestpay.batch.commons.context.BatchContextHolder;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.util.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;

public class GenericFlatFileInvocation implements Runnable{

    @Override
    public void run() {
        ApplicationContext context = getApplicationContext();
        BatchJob batchJob = context.getBean("flatFileProcessJob",BatchJob.class);
        if (batchJob != null){
            BatchContext batchContext = BatchContextHolder.getBatchContext();
            batchJob.batch(batchContext);
        } else {
            throw new BatchException("文本文件处理任务不存在");
        }

    }

    private ApplicationContext getApplicationContext(){
        return ApplicationContextUtil.getApplicationContext();
    }

}
