/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      StepServiceImpl.java
 * Create on:      2015/7/16 0016 16:16
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 0016 16:16               	袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.persistence.service.impl;


import cn.com.bestpay.batch.persistence.model.StepExecutionContextPO;
import cn.com.bestpay.batch.persistence.model.StepExecutionPO;
import cn.com.bestpay.batch.persistence.service.IStepService;

import java.util.List;

public class StepServiceImpl implements IStepService{
    public List<StepExecutionPO> getStepsByJobId(String jobId){
        return null;
    }

    public List<StepExecutionPO> getStepParams(String stepId){
        return null;
    }

    public List<StepExecutionContextPO> getStepContext(String stepId){
        return null;
    }
}
