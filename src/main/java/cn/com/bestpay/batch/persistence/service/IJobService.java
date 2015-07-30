package cn.com.bestpay.batch.persistence.service;

import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.persistence.model.FtpPO;

/**
 * *********************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * <p/>
 * File name:      IJobService.java
 * Create on:      2015/7/16 0016 16:13
 * Author :        袁其亮
 * <p/>
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 0016 16:13               	    袁其亮					    Create
 * **********************************************************************************
 */
public interface IJobService {

    FtpPO getFtpPO(String jobInstanceId);


}
