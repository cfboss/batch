/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobExecutionFilterChain.java
 * Create on:      2015/7/22 0022 13:46
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 13:46               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileConfigAttribute;
import cn.com.bestpay.batch.commons.context.BatchContext;
import cn.com.bestpay.batch.commons.exception.BatchException;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.launch.JobLauncher;

import java.util.List;

public class JobExecutionFilterChain implements FilterChain {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private JobLauncher jobLauncher;
    @Override
    public void doFilter(ConfigAttribute configAttribute) throws BatchException {
        logger.info("开始文件处理");
        // 处理文件 调用spring batch框架进行处理
        // todo
        //jobLauncher.run()
        List<FileConfigAttribute> configAttributes = configAttribute.getFileConfigAttribute();
        for (FileConfigAttribute config: configAttributes){
            System.out.println(config.getFileReturnName());
        }
        logger.info("文件处理完成");
    }

    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }
}
