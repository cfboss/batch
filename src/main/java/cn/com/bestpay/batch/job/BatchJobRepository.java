/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      BatchJobRepository.java
 * Create on:      2015/7/24 0024 13:52
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/24 0024 13:52               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.job;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.dao.ExecutionContextDao;
import org.springframework.batch.core.repository.dao.JobExecutionDao;
import org.springframework.batch.core.repository.dao.JobInstanceDao;
import org.springframework.batch.core.repository.dao.StepExecutionDao;
import org.springframework.batch.core.repository.support.SimpleJobRepository;


public class BatchJobRepository extends SimpleJobRepository{

    public BatchJobRepository(JobInstanceDao jobInstanceDao, JobExecutionDao jobExecutionDao, StepExecutionDao stepExecutionDao, ExecutionContextDao ecDao) {
        super(jobInstanceDao, jobExecutionDao, stepExecutionDao, ecDao);
    }
    public void sdf(){
        //JobLauncher
    }


}
