package cn.com.bestpay.batch.service;

/**
 * *********************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * <p/>
 * File name:      IJobLauncher.java
 * Create on:      2015/7/16 15:28
 * Author :        袁其亮
 * <p/>
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 15:28               	    袁其亮					    Create
 * **********************************************************************************
 */
public interface IJobLauncher {
    public void start(String id);
    public void pause(String id);
    public void stop(String id);
    public void resume(String id);
}
