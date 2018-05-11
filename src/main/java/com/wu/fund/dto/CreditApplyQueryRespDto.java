package com.wu.fund.dto;

public class CreditApplyQueryRespDto {
	
	
	/**
	 * 人行请求流水号
	 */
	private String applyNo                ;
	
	/**
	 * 人行受理流水号
	 */
	private String dealNo                 ;
	
	/**
	 * 人行资金方业务流水号
	 */
	private String capitalBusiNo          ;
	
	/**
	 * 处理结果
	 */
	private String dealStatus             ;
	
	/**
	 * 描述
	 */
	private String dealDesc               ;
	
	/**
	 * 人行征信报告文件包名
	 */
	private String reportXmlFilePackage   ;
	
	/**
	 * 人行征信报告PDF文件包名
	 */
	private String reportPdfFilePackage   ;
	
	/**
	 * 人行征信报告内容
	 */
	private String reportXmlMsg           ;
	
	/**
	 * 人行征信报告PDF文件包名
	 */
	private String reportPdfMsg           ;
	
	

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

	public String getCapitalBusiNo() {
		return capitalBusiNo;
	}

	public void setCapitalBusiNo(String capitalBusiNo) {
		this.capitalBusiNo = capitalBusiNo;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getDealDesc() {
		return dealDesc;
	}

	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}

	public String getReportXmlFilePackage() {
		return reportXmlFilePackage;
	}

	public void setReportXmlFilePackage(String reportXmlFilePackage) {
		this.reportXmlFilePackage = reportXmlFilePackage;
	}

	public String getReportPdfFilePackage() {
		return reportPdfFilePackage;
	}

	public void setReportPdfFilePackage(String reportPdfFilePackage) {
		this.reportPdfFilePackage = reportPdfFilePackage;
	}

	public String getReportXmlMsg() {
		return reportXmlMsg;
	}

	public void setReportXmlMsg(String reportXmlMsg) {
		this.reportXmlMsg = reportXmlMsg;
	}

	public String getReportPdfMsg() {
		return reportPdfMsg;
	}

	public void setReportPdfMsg(String reportPdfMsg) {
		this.reportPdfMsg = reportPdfMsg;
	}

}
