package com.wu.fund.dto;

import java.math.BigDecimal;

/**
 * @Author: wangying
 * @Description:申请放款请求参数
 * @Date: Created in  2018/5/14
 */
public class LoadApplyReqDto {

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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
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
}
