/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobRepositoryImpl.java
 * Create on:      2015年7月27日 17:04:51
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015年7月27日 17:04:51               	袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.service.impl;

import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FtpConfigAttribute;
import cn.com.bestpay.batch.commons.exception.FtpException;
import cn.com.bestpay.batch.persistence.model.*;
import cn.com.bestpay.batch.persistence.service.IJobService;
import cn.com.bestpay.batch.service.IJobRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <b>DESCRIPTION:</b>任务仓库实现类<br/>
 * <b>Create on:</b>2015年7月27日 17:04:51<br/>
 *
 * @author 袁其亮
 */
@Service
public class JobRepositoryImpl implements IJobRepository {

    /**
     * 任务服务类
     */
    @Resource
    private IJobService jobServiceImpl;

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

    @Override
    public ConfigAttribute createConfigAttribute(String jobId) {

        FtpPO ftpPO = jobServiceImpl.getFtpPO(jobId);
        if (ftpPO == null) {
            throw new FtpException("无法获取FTP信息,任务ID: " + jobId) ;
        }
        ConfigAttribute configAttribute = new ConfigAttribute();
        wrapFtpConfigAttribute(configAttribute,ftpPO);
        return configAttribute;

    }

    private void wrapFtpConfigAttribute(ConfigAttribute configAttribute,FtpPO ftpPO) {
        FtpConfigAttribute ftpConfigAttribute = new FtpConfigAttribute();
        ftpConfigAttribute.setUsername(ftpPO.getUsername());
        ftpConfigAttribute.setPassword(ftpPO.getPassword());
        ftpConfigAttribute.setAddress(ftpPO.getAddress());
        ftpConfigAttribute.setPort(ftpPO.getPort());
        ftpConfigAttribute.setFtpType(ftpPO.getFtpType());
        ftpConfigAttribute.setFtpMode(ftpPO.getFtpMode());
        ftpConfigAttribute.setDownload(ftpPO.getFileType().equals("0"));
        ftpConfigAttribute.setServerPath(ftpPO.getServerPath());
        ftpConfigAttribute.setLocalPath(ftpPO.getLocalPath());
        configAttribute.setFtpConfigAttribute(ftpConfigAttribute);

    }
}
