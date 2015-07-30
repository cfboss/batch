/**
 * *********************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * <p/>
 * File name:      ISchedulerConsumerService.java
 * Create on:      2015年7月16日 16:41:19
 * Author :        袁其亮
 * <p/>
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015年7月16日 16:41:19            	    袁其亮					    Create
 * **********************************************************************************
 */
package cn.com.bestpay.batch.message;

import cn.com.bestpay.batch.message.vo.BatchReqBo;
import cn.com.bestpay.batch.message.vo.BatchRspBo;
import cn.com.bestpay.batch.message.vo.Response;

/**
 * <b>DESCRIPTION:</b>批处理受理服务接口<br/>
 * <b>Create on:</b>2015年7月16日 16:41:19<br/>
 *
 * @author 袁其亮
 */
public interface ITaskConsumeService {

    /**
     * 启动批处理任务
     * @param batchReqBo 请求实体
     */
    public Response<BatchRspBo> consume(BatchReqBo batchReqBo);
}
