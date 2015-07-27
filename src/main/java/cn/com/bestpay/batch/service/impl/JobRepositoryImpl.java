/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobRepositoryImpl.java
 * Create on:      2015/7/27 0027 16:12
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/27 0027 16:12               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.service.impl;


import cn.com.bestpay.batch.persistence.model.*;
import cn.com.bestpay.batch.service.IJobRepository;

import java.util.List;

public class JobRepositoryImpl implements IJobRepository {
    @Override
    public JobInstancePO getJobInstance(String jobKey) {
        return null;
    }

    @Override
    public List<JobExecutionParamsPO> getJobParams(String jobId) {
        return null;
    }

    @Override
    public List<StepInstancePO> getStepInstance(String jobId) {
        return null;
    }

    @Override
    public List<StepExecutionParamsPO> getStepParams(String stepId) {
        return null;
    }

    @Override
    public List<StepInstancePO> getNextStep(String stepId, int order) {
        return null;
    }

    @Override
    public void update(JobExecutionPO jobExecutionPO) {

    }

    @Override
    public void update(StepExecutionPO stepExecutionPO) {

    }

    @Override
    public List<JobExecutionContextPO> getJobContext(String jobId) {
        return null;
    }

    @Override
    public List<StepExecutionContextPO> getStepContext(String stepId) {
        return null;
    }
}
