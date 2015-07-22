/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      SchedulerConsumerServiceImpl.java
 * Create on:      2015/7/16 15:26
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 15:26               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.message.impl;

import cn.com.bestpay.batch.message.ISchedulerConsumerService;
import cn.com.bestpay.batch.message.vo.Response;
import cn.com.bestpay.batch.service.IJobLauncher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SchedulerConsumerServiceImpl implements ISchedulerConsumerService{
    @Resource
    private IJobLauncher jobLauncher;

    /**
     * 启动批处理任务
     * @param jobInstanceId 被调用的任务实例ID
     */
    @Override
    public Response<String> consume(String jobInstanceId) {
        jobLauncher.start(jobInstanceId);
        return null;
    }
}
