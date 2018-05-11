package com.wu.fund.dto;

public class CreditApplyRespDto {

	
	/**
	 * 人行请求流水号
	 */
	private String  applyNo ; 
	
	/**
	 *  人行受理流水号
	 */
	private String  dealNo ;
	

	public String getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getDealNo() {
		return dealNo;
	}

	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	} 
	
}
