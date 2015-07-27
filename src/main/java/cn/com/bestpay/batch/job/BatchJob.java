/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      BatchJob.java
 * Create on:      2015/7/27 0027 16:21
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/27 0027 16:21               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.job;


import cn.com.bestpay.batch.commons.context.BatchContext;

public interface BatchJob {
    void batch(BatchContext batchContext);
}
