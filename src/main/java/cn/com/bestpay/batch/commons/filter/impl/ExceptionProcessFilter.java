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

public class ExceptionProcessFilter implements Filter{
    @Override
    public void doFilter(ConfigAttribute configAttribute, FilterChain chain) throws BatchException {
        try {
            chain.doFilter(configAttribute);
        } catch (FileDownloadException e){

        } catch (HeaderValidateException e){

        } catch (RowMapperException e){

        } catch (RowValidateException e) {

        } catch (Exception e){

        }

    }
}
