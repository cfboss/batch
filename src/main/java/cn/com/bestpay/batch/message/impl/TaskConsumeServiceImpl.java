/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      SchedulerConsumerServiceImpl.java
 * Create on:      2015年7月16日 15:41:19
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015年7月16日 15:41:19           	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.message.impl;

import cn.com.bestpay.batch.message.ITaskConsumeService;
import cn.com.bestpay.batch.message.vo.BatchReqBo;
import cn.com.bestpay.batch.message.vo.BatchRspBo;
import cn.com.bestpay.batch.message.vo.Response;
import cn.com.bestpay.batch.service.IJobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b>DESCRIPTION:</b>批处理受理服务实现类<br/>
 * <b>Create on:</b>2015年7月16日 15:41:19<br/>
 *
 * @author 袁其亮
 */
@Service
public class TaskConsumeServiceImpl implements ITaskConsumeService {
    /**
     * 批处理任务启动器
     */
    @Autowired
    private IJobLauncher jobLauncher;


    /**
     * 启动批处理任务
     * @param batchReqBo 被调用的任务传递的参数
     */
    @Override
    public Response<BatchRspBo> consume(BatchReqBo batchReqBo) {
        return jobLauncher.start(batchReqBo);
    }

}
