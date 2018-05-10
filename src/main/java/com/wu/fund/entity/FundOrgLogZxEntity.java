package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:资金平台-人行征信查询结果
 * @Date: Created in 17:29 2018/5/8
 */
public class FundOrgLogZxEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 人行请求流水号
     */
    private String cApplyNo;

    /**
     * 世联金融业务流水号
     */
    private String cslBusinessNo;

    /**
     * 人行受理流水号
     */
    private String cDealNo;

    /**
     * 当前步骤节点
     */
    private String fundStepName;

    /**
     * 当前主流程节点
     */
    private String fundMainFlowName;

    /**
     * 当前子流程节点
     */
    private String fundSubFlowName;

    /**
     * 当前子流程状态(codeno为FundSubFlowStatus 01 待处理 02 处理中 03挂起)
     */
    private String fundSubFlowStatus;

    /**
     * 当前子流程返回码
     */
    private String fundServiceReturnCode;

    /**
     * 当前子流程返回信息
     */
    private String fundServiceReturnMsg;

    /**
     * 业务状态(Codeno 为FundBusinessStatus)
     */
    private String fundBusinessStatus;

    /**
     * 人行资金方业务流水号
     */
    private String cCapitalBusinessNo;

    /**
     * 开始查询时间
     */
    private String beginTime;

    /**
     * 结束查询时间
     */
    private String endTime;

    /**
     * 报告内容
     */
    private String loanOrgCode;

    /**
     * 贷款机构编号
     */
    private String status;

    /**
     * 状态
     */
    private String oldLoanOrgCode;

    /**
     * 身份证证件号码
     */
    private String certId;

    /**
     * 人行征信报告地址
     */
    private String filePackageName;

    /**
     * 处理结果
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * null
     */
    private String responseMessage;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCApplyNo() {
        return cApplyNo;
    }

    public void setCApplyNo(String capplyNo) {
        this.cApplyNo = capplyNo;
    }

    public String getCslBusinessNo() {
        return cslBusinessNo;
    }

    public void setCslBusinessNo(String cslBusinessNo) {
        this.cslBusinessNo = cslBusinessNo;
    }

    public String getcDealNo() {
        return cDealNo;
    }

    public void setcDealNo(String cDealNo) {
        this.cDealNo = cDealNo;
    }

    public String getFundStepName() {
        return fundStepName;
    }

    public void setFundStepName(String fundStepName) {
        this.fundStepName = fundStepName;
    }

    public String getFundMainFlowName() {
        return fundMainFlowName;
    }

    public void setFundMainFlowName(String fundMainFlowName) {
        this.fundMainFlowName = fundMainFlowName;
    }

    public String getFundSubFlowName() {
        return fundSubFlowName;
    }

    public void setFundSubFlowName(String fundSubFlowName) {
        this.fundSubFlowName = fundSubFlowName;
    }

    public String getFundSubFlowStatus() {
        return fundSubFlowStatus;
    }

    public void setFundSubFlowStatus(String fundSubFlowStatus) {
        this.fundSubFlowStatus = fundSubFlowStatus;
    }

    public String getFundServiceReturnCode() {
        return fundServiceReturnCode;
    }

    public void setFundServiceReturnCode(String fundServiceReturnCode) {
        this.fundServiceReturnCode = fundServiceReturnCode;
    }

    public String getFundServiceReturnMsg() {
        return fundServiceReturnMsg;
    }

    public void setFundServiceReturnMsg(String fundServiceReturnMsg) {
        this.fundServiceReturnMsg = fundServiceReturnMsg;
    }

    public String getFundBusinessStatus() {
        return fundBusinessStatus;
    }

    public void setFundBusinessStatus(String fundBusinessStatus) {
        this.fundBusinessStatus = fundBusinessStatus;
    }

    public String getcCapitalBusinessNo() {
        return cCapitalBusinessNo;
    }

    public void setcCapitalBusinessNo(String cCapitalBusinessNo) {
        this.cCapitalBusinessNo = cCapitalBusinessNo;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLoanOrgCode() {
        return loanOrgCode;
    }

    public void setLoanOrgCode(String loanOrgCode) {
        this.loanOrgCode = loanOrgCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOldLoanOrgCode() {
        return oldLoanOrgCode;
    }

    public void setOldLoanOrgCode(String oldLoanOrgCode) {
        this.oldLoanOrgCode = oldLoanOrgCode;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getFilePackageName() {
        return filePackageName;
    }

    public void setFilePackageName(String filePackageName) {
        this.filePackageName = filePackageName;
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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}