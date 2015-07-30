/**
 * *********************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * <p/>
 * File name:      IJobLauncher.java
 * Create on:      2015年7月15日 15:12:38
 * Author :        袁其亮
 * <p/>
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015年7月15日 15:12:38            	    袁其亮					    Create
 * **********************************************************************************
 */

package cn.com.bestpay.batch.service;
import cn.com.bestpay.batch.message.vo.BatchReqBo;
import cn.com.bestpay.batch.message.vo.BatchRspBo;
import cn.com.bestpay.batch.message.vo.Response;

/**
 * <b>DESCRIPTION:</b>批处理任务启动接口<br/>
 * <b>Create on:</b>2015年7月15日 15:12:38<br/>
 *
 * @author 袁其亮
 */
public interface IJobLauncher {

    /**
     * 启动任务
     * @param batchReqBo 请求实体
     * @return 响应实体
     */
    public Response<BatchRspBo> start(BatchReqBo batchReqBo);

}
