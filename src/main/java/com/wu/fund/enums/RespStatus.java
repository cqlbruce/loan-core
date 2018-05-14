package com.wu.fund.enums;

/**
 * @Description:响应调用方通用状态码
 * @author cql
 * @date:   2018年5月14日 
 */
public enum RespStatus {
	
	SUCCESS("0000","成功"),FAIL("9999","失败"),NOT_RECORD("0010","无该笔申请记录"),DOING("0030","处理中"),
	FILE_NOT_FOUND("0040","影像或合同文件缺失"),UNKOWN_STATUS("0020","其它");
	 
	private String code;
	private String desc;

	private RespStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
