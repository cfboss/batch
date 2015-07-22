/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      BatchContext.java
 * Create on:      2015/7/21 0021 11:26
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/21 0021 11:26               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.context;


import com.google.common.collect.Maps;

import java.util.Map;

public class BatchContext implements Context{
    private Map<String,Object> map = Maps.newHashMap();
    @Override
    public Object get(String key) {
        return map.get(key);
    }

    @Override
    public void save(String key, Object value) {
        map.put(key,value);
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }

}
