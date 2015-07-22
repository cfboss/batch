/**
 * *********************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * <p/>
 * File name:      ISchedulerConsumerService.java
 * Create on:      2015/7/16 15:06
 * Author :        袁其亮
 * <p/>
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 15:06               	    袁其亮					    Create
 * **********************************************************************************
 */
package cn.com.bestpay.batch.message;

import cn.com.bestpay.batch.message.vo.Response;

public interface ISchedulerConsumerService {

    /**
     * 启动批处理任务
     * @param jobInstanceId 被调用的任务实例ID
     */
    public Response<String> consume(String jobInstanceId);
}
