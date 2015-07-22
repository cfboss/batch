/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      ApplicationContextUtil.java
 * Create on:      2015/7/22 0022 14:43
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 14:43               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.util;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public final class ApplicationContextUtil implements ApplicationContextAware {
    /**
     * 获取spring运行环境
     */
    private static  ApplicationContext context;


    public static ApplicationContext getApplicationContext(){
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
