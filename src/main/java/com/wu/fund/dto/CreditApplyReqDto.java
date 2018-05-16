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
	
	/**
	 * 证件照片正面
	 */
	private String creditPicReverse ; 
	
	/**
	 * 证件照片反面 
	 */
	private String creditPicPositive ;
	
	/**
	 *  授权书照片正面
	 */
	private String attorneyPicPositive ;
	
	/**
	 * 授权书照片反面
	 */
	private String attorneyPicReverse ;

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

	public String getCreditPicReverse() {
		return creditPicReverse;
	}

	public void setCreditPicReverse(String creditPicReverse) {
		this.creditPicReverse = creditPicReverse;
	}

	public String getCreditPicPositive() {
		return creditPicPositive;
	}

	public void setCreditPicPositive(String creditPicPositive) {
		this.creditPicPositive = creditPicPositive;
	}

	public String getAttorneyPicPositive() {
		return attorneyPicPositive;
	}

	public void setAttorneyPicPositive(String attorneyPicPositive) {
		this.attorneyPicPositive = attorneyPicPositive;
	}

	public String getAttorneyPicReverse() {
		return attorneyPicReverse;
	}

	public void setAttorneyPicReverse(String attorneyPicReverse) {
		this.attorneyPicReverse = attorneyPicReverse;
	}

}
