/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      ExceptionProcessFilter.java
 * Create on:      2015/7/22 0022 10:45
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 10:45               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter.impl;


import cn.com.bestpay.batch.commons.config.ConfigAttribute;
import cn.com.bestpay.batch.commons.exception.*;
import cn.com.bestpay.batch.commons.filter.Filter;
import cn.com.bestpay.batch.commons.filter.FilterChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionProcessFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        // todo 将异常信息持久化到数据库
        try {
            chain.doFilter(configAttribute);
        } catch (FtpException e){
            logger.error("Ftp 连接出现异常");
            e.printStackTrace();
        } catch (FileDownloadException e){
            logger.error("文件下载出现异常");
            e.printStackTrace();
        } catch (HeaderValidateException e){
            logger.error("文件头校验出现异常");
            e.printStackTrace();
        } catch (RowMapperException e){
            logger.error("文件行映射出现异常");
            e.printStackTrace();
        } catch (RowValidateException e) {
            logger.error("文件行校验出现异常");
            e.printStackTrace();
        } catch (BatchException e){
            logger.error("批处理出现未知异常");
            e.printStackTrace();
        }

    }
}
