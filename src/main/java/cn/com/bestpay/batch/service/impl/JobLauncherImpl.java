/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JobLauncherImpl.java
 * Create on:      2015年7月16日 15:43:22
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015年7月16日 15:43:22            	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.service.impl;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.constant.BusinessCodeEnum;
import cn.com.bestpay.batch.commons.context.BatchContextHolder;
import cn.com.bestpay.batch.commons.exception.FtpException;
import cn.com.bestpay.batch.commons.filter.GenericFilterChain;
import cn.com.bestpay.batch.message.vo.BatchReqBo;
import cn.com.bestpay.batch.message.vo.BatchRspBo;
import cn.com.bestpay.batch.message.vo.Response;
import cn.com.bestpay.batch.service.IJobLauncher;
import cn.com.bestpay.batch.service.IJobRepository;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * <b>DESCRIPTION:</b>批处理任务启动实现类<br/>
 * <b>Create on:</b>2015年7月16日 15:43:22<br/>
 *
 * @author 袁其亮
 */
@Service
public class JobLauncherImpl implements IJobLauncher {
    /**
     * 任务仓库
     */
    @Autowired
    private IJobRepository jobRepository;

    /**
     * 批处理过滤器链
     */
    @Autowired
    private GenericFilterChain batchFilter;

    @Override
    public Response<BatchRspBo> start(BatchReqBo batchReqBo) {
        Response<BatchRspBo> response = null;
        try{
            ConfigAttribute configAttribute = jobRepository.createConfigAttribute(batchReqBo.getJobInstanceId());
            configAttribute.setFileReturn(batchReqBo.isFileReturn());
            wrapFileMap(configAttribute, batchReqBo);
            configAttribute.getFtpConfigAttribute().setFileNames(batchReqBo.getFileNames());
            batchFilter.doFilter(configAttribute);
            response = createResponse(configAttribute);
        }catch (FtpException e){
            response = new Response<BatchRspBo>(BusinessCodeEnum.RESP_FTP_INIT_ERROR.getCode(),BusinessCodeEnum.RESP_FTP_INIT_ERROR.getDesc());
        } finally {
            return response;
        }
    }

    private Response<BatchRspBo> createResponse(ConfigAttribute configAttribute) {
        Response<BatchRspBo> response = null;
        if (configAttribute.isResult()){
            BatchRspBo batchRspBo = new BatchRspBo();
            batchRspBo.setJobInstanceId(configAttribute.getJobId());
            //batchRspBo.setFileNames(configAttribute.getFileConfigAttribute().);
            response = new Response<BatchRspBo>(batchRspBo);
        } else {
            response = new Response<BatchRspBo>(configAttribute.getCode(),configAttribute.getMessage());
        }
        return response;
    }

    /**
     * 包装ConfigAttribute
     */
    private ConfigAttribute wrapFileMap(ConfigAttribute configAttribute,BatchReqBo batchReqBo) {
        Map<String,String> fileMap = Maps.newHashMap();
        List<String> fileNames = batchReqBo.getFileNames();
        for (String fileName : fileNames) {
            fileMap.put(fileName,null);
        }
        configAttribute.setFileMap(fileMap);
        return configAttribute;
    }


    public void setJobRepository(IJobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public void setBatchFilter(GenericFilterChain batchFilter) {
        this.batchFilter = batchFilter;
    }
}
