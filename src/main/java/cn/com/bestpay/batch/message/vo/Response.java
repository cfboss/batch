/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      Response.java
 * Create on:      2015/3/16 17:44
 * Author :        袁其亮
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015/3/16 17:44               	    袁其亮					    Create
 ************************************************************************************/
package cn.com.bestpay.batch.message.vo;

import java.io.Serializable;

/**
 * 对账接口 调用返回
 * Author:  袁其亮
 * Date: 2015年3月16日 17:46:14
 */
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 8350327877975282483L;

    private boolean success;  //表示调用是否成功 ,如果为true,则可以调用getResult,如果为false,则调用errorCode来获取出错信息

    private T result;  //获取调用返回值

    private String errorCode; //获取错误码

    private String errorMsg;

    public Response() {
    }

    public Response(T result) {
        this.success = true;
        this.result = result;
    }


    /**
     * 构造方法，根据flag返回不同结果
     *
     * @param flag   true|false
     * @param result   若flag=true，则返回result对象,若flag=false则返回errorCode
     */
    public Response(boolean flag, T result) {
        if (flag) {
            this.success = true;
            this.result = result;
        } else {
            this.success = false;
            this.errorCode = (String) result;
        }
    }

    public Response(String errorCode) {
        this.success = false;
        this.errorCode = errorCode;
    }

    public Response(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        success = true;
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.success = false;
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response response = (Response) o;

        if (success != response.success) return false;
        if (!errorCode.equals(response.errorCode)) return false;
        if (!result.equals(response.result)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = (success ? 1 : 0);
        result1 = 31 * result1 + result.hashCode();
        result1 = 31 * result1 + errorCode.hashCode();
        return result1;
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", result=" + result +
                ", errorCode='" + errorCode + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
