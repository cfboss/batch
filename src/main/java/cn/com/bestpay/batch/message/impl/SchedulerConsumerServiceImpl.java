/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      SchedulerConsumerServiceImpl.java
 * Create on:      2015/7/16 15:26
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 15:26               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.message.impl;

import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileConfigAttribute;
import cn.com.bestpay.batch.commons.config.FileMapAttribute;
import cn.com.bestpay.batch.commons.config.FtpConfigAttribute;
import cn.com.bestpay.batch.commons.filter.GenericFilterChain;
import cn.com.bestpay.batch.message.ISchedulerConsumerService;
import cn.com.bestpay.batch.message.vo.Response;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.support.SimpleJobRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SchedulerConsumerServiceImpl implements ISchedulerConsumerService {
    //@Resource
    private JobLauncher jobLauncher;
    @Resource
    private GenericFilterChain batchFilter;

    /**
     * 启动批处理任务
     * @param jobInstanceId 被调用的任务实例ID
     */
    @Override
    public Response<String> consume(String jobInstanceId) {
        //从数据库获取初始化数据
        // todo
        FtpConfigAttribute ftpConfigAttribute = new FtpConfigAttribute();
        FileConfigAttribute fileConfigAttribute = new FileConfigAttribute();

        ftpConfigAttribute.setAddress("192.178.106.209");
        ftpConfigAttribute.setPort(21);
        ftpConfigAttribute.setServerPath("/batch/server");
        ftpConfigAttribute.setLocalPath("/batch/local");
        ftpConfigAttribute.setUsername("host");
        ftpConfigAttribute.setPassword("host");
        List fileNames = Lists.newArrayList();
        fileNames.add("batch-file-1.txt");
        fileNames.add("batch-file-2.txt");
        ftpConfigAttribute.setFileNames(fileNames);
        ftpConfigAttribute.setFtpMode(0);
        ftpConfigAttribute.setFtpType(0);
        ftpConfigAttribute.setDownload(true);
        List<FileConfigAttribute> fileConfigAttributes = Lists.newArrayList();
        fileConfigAttributes.add(fileConfigAttribute);

        Map map = Maps.newHashMap();
        map.put("batch-file-1.txt","batch-file-return-1.txt");
        map.put("batch-file-2.txt","batch-file-return-2.txt");

        ConfigAttribute configAttribute = new ConfigAttribute();
        configAttribute.setFileConfigAttribute(fileConfigAttributes);
        configAttribute.setFtpConfigAttribute(ftpConfigAttribute);
        configAttribute.setFileMap(map);
        configAttribute.setStepType("0");
        batchFilter.doFilter(configAttribute);

        return null;
    }
}
