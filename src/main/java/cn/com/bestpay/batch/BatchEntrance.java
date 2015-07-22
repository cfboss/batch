/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      BatchEntrance.java
 * Create on:      2015/7/16 15:13
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/7/16 15:13               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch;


import com.google.common.util.concurrent.AbstractIdleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchEntrance extends AbstractIdleService {
    //private final static Logger logger = LoggerFactory.getLogger(BatchEntrance.class);
    private ClassPathXmlApplicationContext context;
    public static void main(String[] args) {
        BatchEntrance batchEntrance = new BatchEntrance();
        batchEntrance.startAsync();
        try {
            Object lock = new Object();
            synchronized (lock) {
                while (true) {
                    lock.wait();
                }
            }
        } catch (InterruptedException ex) {
            //logger.error("ignore interruption");
        }
        System.out.println("启动成功");
    }

    /**
     * Start the service.
     */
    @Override
    protected void startUp() throws Exception {
        //logger.info("batch service init");
        context = new ClassPathXmlApplicationContext(new String[] { "spring-config.xml" });
        context.start();
        context.registerShutdownHook();
        //logger.info("batch service started successfully");

    }

    /**
     * Stop the service.
     */
    @Override
    protected void shutDown() throws Exception {
        context.stop();
        //logger.info("batch service stopped successfully");
    }
}
