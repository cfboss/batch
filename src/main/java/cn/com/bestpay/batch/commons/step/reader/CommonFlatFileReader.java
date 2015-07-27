/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      CommonFlatFileReader.java
 * Create on:      2015/7/16 8:54
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 8:54               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.step.reader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.file.*;
import org.springframework.batch.item.file.separator.RecordSeparatorPolicy;
import org.springframework.batch.item.file.separator.SimpleRecordSeparatorPolicy;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

public class CommonFlatFileReader<T> extends FlatFileItemReader<T>{
    private static final Log logger = LogFactory.getLog(FlatFileItemReader.class);


    private RecordSeparatorPolicy recordSeparatorPolicy = new SimpleRecordSeparatorPolicy();

    private Resource resource;

    private BufferedReader reader;

    private int lineCount = 0;

    private String[] comments = new String[] { "#" };

    private boolean noInput = false;

    private String encoding = Charset.defaultCharset().name();

    private LineMapper<T> lineMapper;

    private int linesToSkip = 0;

    private LineCallbackHandler skippedLinesCallback;

    private boolean strict = true;

    private BufferedReaderFactory bufferedReaderFactory = new DefaultBufferedReaderFactory();

    public CommonFlatFileReader() {
        setName(ClassUtils.getShortName(FlatFileItemReader.class));
    }

    @Override
    protected void doOpen() throws Exception {
        File file = resource.getFile();
        if (!file.exists()){
            throw  new Exception("file not exists");
        }
        try{
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
        } catch (Exception e){
            throw e;
        }
    }

    @Override
    protected T doRead() throws Exception {
        String line = reader.readLine();
        //SimpleAsyncTaskExecutor
        //FlatFileItemReader
        if (line==null){
            return null;
        }
        lineCount++;
        return (T) lineMapper.mapLine(line,lineCount);
    }


    @Override
    protected void doClose() throws Exception {
        lineCount = 0;
        reader.close();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(resource);
    }

    @Override
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void setLineMapper(LineMapper lineMapper) {
        this.lineMapper = lineMapper;
    }

    @Override
    public void setExecutionContextName(String name) {
        super.setExecutionContextName(name);
    }

    @Override
    public void setMaxItemCount(int count) {
        super.setMaxItemCount(count);
    }
}
