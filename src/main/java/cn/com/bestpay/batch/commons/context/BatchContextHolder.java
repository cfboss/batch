/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      BatchContextHolder.java
 * Create on:      2015/7/22 0022 14:02
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 14:02               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.context;


public class BatchContextHolder {
    private static ThreadLocal<BatchContext> batchContextList = new ThreadLocal<BatchContext>();
    public static BatchContext getBatchContext(){
        return batchContextList.get();
    }

    public static void saveBatchContext(BatchContext batchContext){
        batchContextList.set(batchContext);
    }

    public static void removeBatchContext(){
        batchContextList.remove();
    }
}
