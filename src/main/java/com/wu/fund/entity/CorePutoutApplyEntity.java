package com.wu.fund.entity;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @Author: wangying
 * @Description:核心放款申请
 * @Date: Created in  2018/5/9
 */
public class CorePutoutApplyEntity implements Serializable {
    /**
     * 放款请求流水号
     */
    private String lApplyNo;

    /**
     * 放款世联金融业务流水号
     */
    private String lSlBusinessNo;

    /**
     * 授信或预审批受理编号
     */
    private String aDealNo;

    /**
     * 授信或预审批资金方业务流水号
     */
    private String aCapitalBusinessNo;

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
    private String imagefileName;

    /**
     * 收款银行名称
     */
    private String receiveBankName;

    /**
     * 收款银行账号
     */
    private String receiveBankAcno;

    /**
     * 认证ID
     */
    private String checkAppleId;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 银行卡类型
     */
    private String bankCardType;

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
    private String lCapitalBusinessNo;

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
    private String fundunitno;

    /**
     * 贷款机构编号
     */
    private String loanorgcode;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * 开始时间
     */
    private String begintime;

    /**
     * 交易编号
     */
    private String transno;

    /**
     * 交易请求编号
     */
    private String reqno;

    /**
     * 客户编号
     */
    private String customerid;

    /**
     * CORE_PUTOUT_APPLY
     */
    private static final long serialVersionUID = 1L;

    /**
     * null
     * @return L_APPLY_NO null
     */
    public String getlApplyNo() {
        return lApplyNo;
    }

    /**
     * null
     * @param lApplyNo null
     */
    public void setlApplyNo(String lApplyNo) {
        this.lApplyNo = lApplyNo;
    }

    /**
     * null
     * @return L_SL_BUSINESS_NO null
     */
    public String getlSlBusinessNo() {
        return lSlBusinessNo;
    }

    /**
     * null
     * @param lSlBusinessNo null
     */
    public void setlSlBusinessNo(String lSlBusinessNo) {
        this.lSlBusinessNo = lSlBusinessNo;
    }

    /**
     * null
     * @return A_DEAL_NO null
     */
    public String getaDealNo() {
        return aDealNo;
    }

    /**
     * null
     * @param aDealNo null
     */
    public void setaDealNo(String aDealNo) {
        this.aDealNo = aDealNo;
    }

    /**
     * null
     * @return A_CAPITAL_BUSINESS_NO null
     */
    public String getaCapitalBusinessNo() {
        return aCapitalBusinessNo;
    }

    /**
     * null
     * @param aCapitalBusinessNo null
     */
    public void setaCapitalBusinessNo(String aCapitalBusinessNo) {
        this.aCapitalBusinessNo = aCapitalBusinessNo;
    }

    /**
     * null
     * @return LOAN_AMT null
     */
    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    /**
     * null
     * @param loanAmt null
     */
    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    /**
     * null
     * @return TERM_NO null
     */
    public String getTermNo() {
        return termNo;
    }

    /**
     * null
     * @param termNo null
     */
    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    /**
     * null
     * @return PAYBACK_TYPE null
     */
    public String getPaybackType() {
        return paybackType;
    }

    /**
     * null
     * @param paybackType null
     */
    public void setPaybackType(String paybackType) {
        this.paybackType = paybackType;
    }

    /**
     * null
     * @return LOAN_USE null
     */
    public String getLoanUse() {
        return loanUse;
    }

    /**
     * null
     * @param loanUse null
     */
    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse;
    }

    /**
     * null
     * @return CERT_TYPE null
     */
    public String getCertType() {
        return certType;
    }

    /**
     * null
     * @param certType null
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * null
     * @return CERT_NO null
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * null
     * @param certNo null
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * null
     * @return IMAGEFILE_NAME null
     */
    public String getImagefileName() {
        return imagefileName;
    }

    /**
     * null
     * @param imagefileName null
     */
    public void setImagefileName(String imagefileName) {
        this.imagefileName = imagefileName;
    }

    /**
     * null
     * @return RECEIVE_BANK_NAME null
     */
    public String getReceiveBankName() {
        return receiveBankName;
    }

    /**
     * null
     * @param receiveBankName null
     */
    public void setReceiveBankName(String receiveBankName) {
        this.receiveBankName = receiveBankName;
    }

    /**
     * null
     * @return RECEIVE_BANK_ACNO null
     */
    public String getReceiveBankAcno() {
        return receiveBankAcno;
    }

    /**
     * null
     * @param receiveBankAcno null
     */
    public void setReceiveBankAcno(String receiveBankAcno) {
        this.receiveBankAcno = receiveBankAcno;
    }

    /**
     * null
     * @return CHECK_APPLE_ID null
     */
    public String getCheckAppleId() {
        return checkAppleId;
    }

    /**
     * null
     * @param checkAppleId null
     */
    public void setCheckAppleId(String checkAppleId) {
        this.checkAppleId = checkAppleId;
    }

    /**
     * null
     * @return BANK_CARD_NO null
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * null
     * @param bankCardNo null
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * null
     * @return BANK_CARD_TYPE null
     */
    public String getBankCardType() {
        return bankCardType;
    }

    /**
     * null
     * @param bankCardType null
     */
    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
    }

    /**
     * null
     * @return BANK_NAME null
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * null
     * @param bankName null
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * null
     * @return BANK_MOBILE null
     */
    public String getBankMobile() {
        return bankMobile;
    }

    /**
     * null
     * @param bankMobile null
     */
    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    /**
     * null
     * @return THIRD_ORG_CODE null
     */
    public String getThirdOrgCode() {
        return thirdOrgCode;
    }

    /**
     * null
     * @param thirdOrgCode null
     */
    public void setThirdOrgCode(String thirdOrgCode) {
        this.thirdOrgCode = thirdOrgCode;
    }

    /**
     * null
     * @return VALID_STATUS null
     */
    public String getValidStatus() {
        return validStatus;
    }

    /**
     * null
     * @param validStatus null
     */
    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * null
     * @return THIRD_ORG_RETURN_CODE null
     */
    public String getThirdOrgReturnCode() {
        return thirdOrgReturnCode;
    }

    /**
     * null
     * @param thirdOrgReturnCode null
     */
    public void setThirdOrgReturnCode(String thirdOrgReturnCode) {
        this.thirdOrgReturnCode = thirdOrgReturnCode;
    }

    /**
     * null
     * @return THIRD_ORG_RETURN_MSG null
     */
    public String getThirdOrgReturnMsg() {
        return thirdOrgReturnMsg;
    }

    /**
     * null
     * @param thirdOrgReturnMsg null
     */
    public void setThirdOrgReturnMsg(String thirdOrgReturnMsg) {
        this.thirdOrgReturnMsg = thirdOrgReturnMsg;
    }

    /**
     * null
     * @return APPLY_DATETIME null
     */
    public String getApplyDatetime() {
        return applyDatetime;
    }

    /**
     * null
     * @param applyDatetime null
     */
    public void setApplyDatetime(String applyDatetime) {
        this.applyDatetime = applyDatetime;
    }

    /**
     * null
     * @return FINISH_DATETIME null
     */
    public String getFinishDatetime() {
        return finishDatetime;
    }

    /**
     * null
     * @param finishDatetime null
     */
    public void setFinishDatetime(String finishDatetime) {
        this.finishDatetime = finishDatetime;
    }

    /**
     * null
     * @return L_DEAL_NO null
     */
    public String getlDealNo() {
        return lDealNo;
    }

    /**
     * null
     * @param lDealNo null
     */
    public void setlDealNo(String lDealNo) {
        this.lDealNo = lDealNo;
    }

    /**
     * null
     * @return STATUS null
     */
    public String getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * null
     * @return L_CAPITAL_BUSINESS_NO null
     */
    public String getlCapitalBusinessNo() {
        return lCapitalBusinessNo;
    }

    /**
     * null
     * @param lCapitalBusinessNo null
     */
    public void setlCapitalBusinessNo(String lCapitalBusinessNo) {
        this.lCapitalBusinessNo = lCapitalBusinessNo;
    }

    /**
     * null
     * @return DEAL_STATUS null
     */
    public String getDealStatus() {
        return dealStatus;
    }

    /**
     * null
     * @param dealStatus null
     */
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    /**
     * null
     * @return DEAL_DESC null
     */
    public String getDealDesc() {
        return dealDesc;
    }

    /**
     * null
     * @param dealDesc null
     */
    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }

    /**
     * null
     * @return TRANS_DATE null
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * null
     * @param transDate null
     */
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    /**
     * null
     * @return CLEAR_DATE null
     */
    public String getClearDate() {
        return clearDate;
    }

    /**
     * null
     * @param clearDate null
     */
    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    /**
     * null
     * @return CUST_NAME null
     */
    public String getCustName() {
        return custName;
    }

    /**
     * null
     * @param custName null
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * null
     * @return RECEIVE_BANK_ACNM null
     */
    public String getReceiveBankAcnm() {
        return receiveBankAcnm;
    }

    /**
     * null
     * @param receiveBankAcnm null
     */
    public void setReceiveBankAcnm(String receiveBankAcnm) {
        this.receiveBankAcnm = receiveBankAcnm;
    }

    /**
     * null
     * @return PHONE_NO null
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * null
     * @param phoneNo null
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * null
     * @return BANK_NO null
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * null
     * @param bankNo null
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * null
     * @return FUNDUNITNO null
     */
    public String getFundunitno() {
        return fundunitno;
    }

    /**
     * null
     * @param fundunitno null
     */
    public void setFundunitno(String fundunitno) {
        this.fundunitno = fundunitno;
    }

    /**
     * null
     * @return LOANORGCODE null
     */
    public String getLoanorgcode() {
        return loanorgcode;
    }

    /**
     * null
     * @param loanorgcode null
     */
    public void setLoanorgcode(String loanorgcode) {
        this.loanorgcode = loanorgcode;
    }

    /**
     * null
     * @return ENDTIME null
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * null
     * @param endtime null
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * null
     * @return BEGINTIME null
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * null
     * @param begintime null
     */
    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    /**
     * null
     * @return TRANSNO null
     */
    public String getTransno() {
        return transno;
    }

    /**
     * null
     * @param transno null
     */
    public void setTransno(String transno) {
        this.transno = transno;
    }

    /**
     * null
     * @return REQNO null
     */
    public String getReqno() {
        return reqno;
    }

    /**
     * null
     * @param reqno null
     */
    public void setReqno(String reqno) {
        this.reqno = reqno;
    }

    /**
     * null
     * @return CUSTOMERID null
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * null
     * @param customerid null
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
}