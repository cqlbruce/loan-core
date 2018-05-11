package com.wu.fund.dto;


public class CreditApplyReqDto {
	
	

	/**
	 * 人行征信查询业务流水号
	 */
	private String busiNo            ;    
	
	/**
	 * 人行请求流水号
	 */
	private String applyNo           ;
	
	/**
	 * 客户姓名
	 */
	private String custName          ;
	
	/**
	 *  证件类型
	 */
	private String certType          ;
	
	/**
	 *  证件号码
	 */
	private String certId            ;
	
	/**
	 *  影像资料文件包名
	 */
	private String imageDataUrl      ;
	

	public String getBusiNo() {
		return busiNo;
	}

	public void setBusiNo(String busiNo) {
		this.busiNo = busiNo;
	}

	public String getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertId() {
		return certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
	}

	public String getImageDataUrl() {
		return imageDataUrl;
	}

	public void setImageDataUrl(String imageDataUrl) {
		this.imageDataUrl = imageDataUrl;
	}
	

}
