/************************************************************************************
 * Copyright (c) 2015 © Bestpay Co., Ltd.  All  Rights Reserved.
 * This software is published under the terms of the Bestpay.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * File name:      BusinessCodeEnum.java
 * Create on:      2015-7-7 下午3:05:06
 * Author :        徐宽伟
 * 
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2015月7月7日 下午3:05:40			    徐宽伟						Create
 ************************************************************************************/
package cn.com.bestpay.batch.commons.constant;

/**
 * <b>DESCRIPTION:</b>错误码枚举类<br/>
 * <b>Create on:</b>2015年7月30日 17:04:09<br/>
 * 
 * @author 袁其亮
 */
public enum BusinessCodeEnum {

	RSP_SUCCESS("000000", "成功"),

	RSP_DATA_INIT_ERROR("00001","无法从数据库相应信息"),

    RESP_SYS_ERROR("111111","系统错误"),

    RESP_FTP_INIT_ERROR("00002","无法从数据库加载给定的FTP信息"),

	RESPONSE_ERROR("999999", "失败")	;

	/**
	 * 错误码
	 */
	private String code;
	/**
	 * 错误描述
	 */
	private String desc;

	private BusinessCodeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}


	public static String getName(String code) {
		for (BusinessCodeEnum c : BusinessCodeEnum.values()) {
			if (c.getCode().equals(code)) {
				return c.desc;
			}
		}
		return null;
	}


	public String getCode() {
		return code;
	}


	public String getDesc() {
		return desc;
	}
}