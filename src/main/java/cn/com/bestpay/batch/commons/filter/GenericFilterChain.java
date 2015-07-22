/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      GenericFilterChain.java
 * Create on:      2015/7/22 0022 11:18
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/22 0022 11:18               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.filter;


import cn.com.bestpay.batch.commons.context.BatchContext;
import java.util.List;

public class GenericFilterChain implements FilterChain {
    private final List<Filter> additionalFilters;
    private final FilterChain originalChain;
    private final int size;
    private int currentPosition = 0;

    public GenericFilterChain(FilterChain chain,List<Filter> additionalFilters) {
        this.originalChain = chain;
        this.additionalFilters = additionalFilters;
        this.size = additionalFilters.size();
    }

    @Override
    public void doFilter(BatchContext batchContext) {
        if (currentPosition == size) {
            originalChain.doFilter(batchContext);
        } else {
            currentPosition++;
            Filter nextFilter = additionalFilters.get(currentPosition - 1);
            nextFilter.doFilter(batchContext, this);
        }
    }
}
