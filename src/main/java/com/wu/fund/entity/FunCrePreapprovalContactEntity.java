package com.wu.fund.entity;

import java.io.Serializable;


/**
 * @Author: wangying
 * @Description:授信预审批联系人信息
 * @Date: Created in  2018/5/9
 */
public class FunCrePreapprovalContactEntity implements Serializable {
    /**
     * 联系人流水号
     */
    private String serialno;

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
    private String fundunitno;

    /**
     * 贷款机构编号
     */
    private String loanorgcode;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 开始时间
     */
    private String begintime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * FUN_CRE_PREAPPROVAL_CONTACT
     */
    private static final long serialVersionUID = 1L;

    /**
     * null
     * @return SERIALNO null
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * null
     * @param serialno null
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
     * null
     * @return A_APPLY_NO null
     */
    public String getaApplyNo() {
        return aApplyNo;
    }

    /**
     * null
     * @param aApplyNo null
     */
    public void setaApplyNo(String aApplyNo) {
        this.aApplyNo = aApplyNo;
    }

    /**
     * null
     * @return CONTACTS_RELATION null
     */
    public String getContactsRelation() {
        return contactsRelation;
    }

    /**
     * null
     * @param contactsRelation null
     */
    public void setContactsRelation(String contactsRelation) {
        this.contactsRelation = contactsRelation;
    }

    /**
     * null
     * @return CONTACTS_NAME null
     */
    public String getContactsName() {
        return contactsName;
    }

    /**
     * null
     * @param contactsName null
     */
    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    /**
     * null
     * @return CONTACTS_MOBILE null
     */
    public String getContactsMobile() {
        return contactsMobile;
    }

    /**
     * null
     * @param contactsMobile null
     */
    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile;
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
}