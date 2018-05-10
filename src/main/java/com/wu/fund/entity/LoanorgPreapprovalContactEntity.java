package com.wu.fund.entity;

import java.io.Serializable;


/**
 * @Author: wangying
 * @Description:贷款机构预审批联系人信息
 * @Date: Created in  2018/5/9
 */
public class LoanorgPreapprovalContactEntity implements Serializable {
    /**
     * 联系人流水号
     */
    private String serialNo;

    /**
     * 授信或预审批请求流水号
     */
    private String aApplyNo;

    /**
     * 联系人与客户关系
     */
    private String contactsRelation;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人手机号
     */
    private String contactsMobile;

    /**
     * 资金单元编号
     */
    private String fundUnitNo;

    /**
     * 贷款机构编号
     */
    private String loanOrgCode;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * LOANORG_PREAPPROVAL_CONTACT
     */
    private static final long serialVersionUID = 1L;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getaApplyNo() {
        return aApplyNo;
    }

    public void setaApplyNo(String aApplyNo) {
        this.aApplyNo = aApplyNo;
    }

    public String getContactsRelation() {
        return contactsRelation;
    }

    public void setContactsRelation(String contactsRelation) {
        this.contactsRelation = contactsRelation;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsMobile() {
        return contactsMobile;
    }

    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}