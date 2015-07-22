/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobLauncherImpl.java
 * Create on:      2015/7/16 0016 16:08
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 0016 16:08               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.service.impl;


import cn.com.bestpay.batch.service.IJobLauncher;
import org.springframework.batch.core.launch.JobLauncher;

import javax.annotation.Resource;

public class JobLauncherImpl implements IJobLauncher {
    @Resource
    private  JobLauncher jobLauncher;
    @Override
    public void start(String id) {

    }

    @Override
    public void pause(String id) {

    }

    @Override
    public void stop(String id) {

    }

    @Override
    public void resume(String id) {

    }
}
