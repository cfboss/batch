/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      SchedulerConsumerTest.java
 * Create on:      2015/7/22 0022 16:34
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 16:34               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-config.xml"})
public class SchedulerConsumerTest {
    @Resource
    ISchedulerConsumerService schedulerConsumerServiceImpl;
    @Test
    public void testConsumerFilter(){
        schedulerConsumerServiceImpl.consume("1");
    }
}
