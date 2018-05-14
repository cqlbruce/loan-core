package com.wu.fund.entity;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * @Author: wangying
 * @Description:放款申请
 * @Date: Created in  2018/5/9
 */
public class FunPutoutApplyEntity implements Serializable {
    /**
     * 放款请求流水号
     */
    private String lApplyNo;

    /**
     * 放款世联金融业务流水号
     */
    private String lBusiNo;

    /**
     * 授信或预审批受理编号
     */
    private String aDealNo;

    /**
     * 授信或预审批资金方业务流水号
     */
    private String aCapitalBusiNo;

    /**
     * 借款金额
     */
    private BigDecimal loanAmt;

    /**
     * 借款期限
     */
    private String termNo;

    /**
     * 还款方式
     */
    private String paybackType;

    /**
     * 借款用途
     */
    private String loanUse;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 证件号码
     */
    private String certNo;

    /**
     * 影像资料文件包名
     */
    private String imageFileName;

    /**
     * 收款银行名称
     */
    private String receiveBankName;

    /**
     * 收款银行账号
     */
    private String receiveBankAcNo;

    /**
     * 认证ID
     */
    private String checkAppleId;

    /**
     * 银行卡号
     */
    private String cardNo;

    /**
     * 银行卡类型
     */
    private String cardType;

    /**
     * 银行卡开户行名
     */
    private String bankName;

    /**
     * 银行预留手机号
     */
    private String bankMobile;

    /**
     * 第三方机构代码
     */
    private String thirdOrgCode;

    /**
     * 认证状态
     */
    private String validStatus;

    /**
     * 返回码
     */
    private String thirdOrgReturnCode;

    /**
     * 返回信息
     */
    private String thirdOrgReturnMsg;

    /**
     * 申请日期时间
     */
    private String applyDatetime;

    /**
     * 结束日期时间
     */
    private String finishDatetime;

    /**
     * 放款受理流水号
     */
    private String lDealNo;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 放款资金方业务流水号
     */
    private String lCapitalBusiNo;

    /**
     * 处理结果
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 起息日
     */
    private String transDate;

    /**
     * 对账日期
     */
    private String clearDate;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 收款户名
     */
    private String receiveBankAcnm;

    /**
     * 手机号码
     */
    private String phoneNo;

    /**
     * 银行行号
     */
    private String bankNo;

    /**
     * 资金单元编号
     */
    private String fundUnitNo;

    /**
     * 贷款机构编号
     */
    private String loanOrgCode;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 交易编号
     */
    private String transNo;

    /**
     * 交易请求编号
     */
    private String reqNo;

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 轮询处理时间（精确到毫秒）
     */
    private String dealTime;

    /**
     * null
     */
    private String oldfundUnitNo;

    /**
     * FUN_PUTOUT_APPLY
     */
    private static final long serialVersionUID = 1L;

    public String getlApplyNo() {
        return lApplyNo;
    }

    public void setlApplyNo(String lApplyNo) {
        this.lApplyNo = lApplyNo;
    }

    public String getlBusiNo() {
        return lBusiNo;
    }

    public void setlBusiNo(String lBusiNo) {
        this.lBusiNo = lBusiNo;
    }

    public String getaDealNo() {
        return aDealNo;
    }

    public void setaDealNo(String aDealNo) {
        this.aDealNo = aDealNo;
    }

    public String getaCapitalBusiNo() {
        return aCapitalBusiNo;
    }

    public void setaCapitalBusiNo(String aCapitalBusiNo) {
        this.aCapitalBusiNo = aCapitalBusiNo;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getPaybackType() {
        return paybackType;
    }

    public void setPaybackType(String paybackType) {
        this.paybackType = paybackType;
    }

    public String getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getReceiveBankName() {
        return receiveBankName;
    }

    public void setReceiveBankName(String receiveBankName) {
        this.receiveBankName = receiveBankName;
    }

    public String getReceiveBankAcNo() {
        return receiveBankAcNo;
    }

    public void setReceiveBankAcNo(String receiveBankAcNo) {
        this.receiveBankAcNo = receiveBankAcNo;
    }

    public String getCheckAppleId() {
        return checkAppleId;
    }

    public void setCheckAppleId(String checkAppleId) {
        this.checkAppleId = checkAppleId;
    }

    public String getBankCardNo() {
        return cardNo;
    }

    public void setBankCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankCardType() {
        return cardType;
    }

    public void setBankCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    public String getThirdOrgCode() {
        return thirdOrgCode;
    }

    public void setThirdOrgCode(String thirdOrgCode) {
        this.thirdOrgCode = thirdOrgCode;
    }

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    public String getThirdOrgReturnCode() {
        return thirdOrgReturnCode;
    }

    public void setThirdOrgReturnCode(String thirdOrgReturnCode) {
        this.thirdOrgReturnCode = thirdOrgReturnCode;
    }

    public String getThirdOrgReturnMsg() {
        return thirdOrgReturnMsg;
    }

    public void setThirdOrgReturnMsg(String thirdOrgReturnMsg) {
        this.thirdOrgReturnMsg = thirdOrgReturnMsg;
    }

    public String getApplyDatetime() {
        return applyDatetime;
    }

    public void setApplyDatetime(String applyDatetime) {
        this.applyDatetime = applyDatetime;
    }

    public String getFinishDatetime() {
        return finishDatetime;
    }

    public void setFinishDatetime(String finishDatetime) {
        this.finishDatetime = finishDatetime;
    }

    public String getlDealNo() {
        return lDealNo;
    }

    public void setlDealNo(String lDealNo) {
        this.lDealNo = lDealNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getlCapitalBusiNo() {
        return lCapitalBusiNo;
    }

    public void setlCapitalBusiNo(String lCapitalBusiNo) {
        this.lCapitalBusiNo = lCapitalBusiNo;
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

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getReceiveBankAcnm() {
        return receiveBankAcnm;
    }

    public void setReceiveBankAcnm(String receiveBankAcnm) {
        this.receiveBankAcnm = receiveBankAcnm;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getFundUnitNo() {
        return fundUnitNo;
    }

    public void setFundUnitNo(String fundUnitNo) {
        this.fundUnitNo = fundUnitNo;
    }

    public String getLoanOrgCode() {
        return loanOrgCode;
    }

    public void setLoanOrgCode(String loanOrgCode) {
        this.loanOrgCode = loanOrgCode;
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

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public String getOldfundUnitNo() {
        return oldfundUnitNo;
    }

    public void setOldfundUnitNo(String oldfundUnitNo) {
        this.oldfundUnitNo = oldfundUnitNo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}