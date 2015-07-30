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

import cn.com.bestpay.batch.message.vo.BatchReqBo;
import cn.com.bestpay.batch.message.vo.BatchRspBo;
import cn.com.bestpay.batch.message.vo.Response;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-config.xml"})
public class SchedulerConsumerTest {
    @Resource
    ITaskConsumeService schedulerConsumerServiceImpl;
    @Test
    public void testConsumerFilter(){
        BatchReqBo batchReqBo = new BatchReqBo();
        List<String> fileNames = Lists.newArrayList();
        fileNames.add("batch-file-1.txt");
        fileNames.add("batch-file-2.txt");
        batchReqBo.setFileNames(fileNames);
        batchReqBo.setJobInstanceId("1");
        batchReqBo.setFileReturn(false);
        Response<BatchRspBo> response = schedulerConsumerServiceImpl.consume(batchReqBo);
        if (response.isSuccess()) {
            System.out.println(response.getResult());
        } else {
            System.out.println(response.getErrorCode());
            System.out.println(response.getErrorMsg());
        }

    }
}
