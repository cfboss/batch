/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      IJobRepository.java
 * Create on:      2015/7/24 0024 14:07
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/24 0024 14:07               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.service;

import cn.com.bestpay.batch.persistence.model.*;

import java.util.List;

public interface IJobRepository {
    JobInstancePO getJobInstance(String jobKey);
    List<JobExecutionParamsPO> getJobParams(String jobId);
    List<StepInstancePO> getStepInstance(String jobId);
    List<StepExecutionParamsPO> getStepParams(String stepId);
    List<StepInstancePO> getNextStep(String stepId,int order);
    void update(JobExecutionPO jobExecutionPO);
    void update(StepExecutionPO stepExecutionPO);
    List<JobExecutionContextPO> getJobContext(String jobId);
    List<StepExecutionContextPO> getStepContext(String stepId);

}
