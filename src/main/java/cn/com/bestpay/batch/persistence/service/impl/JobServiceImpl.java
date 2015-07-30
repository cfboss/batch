/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobServiceImpl.java
 * Create on:      2015/7/16 0016 16:13
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 0016 16:13               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.persistence.service.impl;

import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FtpConfigAttribute;
import cn.com.bestpay.batch.persistence.mapper.batch.FtpPOMapper;
import cn.com.bestpay.batch.persistence.model.FtpPO;
import cn.com.bestpay.batch.persistence.service.IJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JobServiceImpl implements IJobService{
    @Resource
    private FtpPOMapper ftpPOMapper;


    @Override
    public FtpPO getFtpPO(String jobInstanceId) {
        return ftpPOMapper.getFtpByJobId(jobInstanceId);
    }

    private void wrapFileConfigAttribute(ConfigAttribute configAttribute) {

    }


}
