package com.wu.fund.entity;

import java.io.Serializable;

/**
 * @Author: wangying
 * @Description:授信预审批共借人和担保人信息
 * @Date: Created in  2018/5/9
 */

public class CoreCrePreapprovalGuarantorEntity implements Serializable {
    /**
     * 共借人(或担保人)流水号
     */
    private String serialno;

    /**
     * 授信或预审批请求流水号
     */
    private String aApplyNo;

    /**
     * 干系人与客户关系
     */
    private String stakeholderRelation;

    /**
     * 干系人类型1：共借人2：担保人
     */
    private String stakeholderType;

    /**
     * 干系人姓名
     */
    private String stakeholderName;

    /**
     * 干系人手机号
     */
    private String stakeholderMobile;

    /**
     * 干系人证件类型
     */
    private String stakeholderCertType;

    /**
     * 干系人证件号码
     */
    private String stakeholderCertNo;

    /**
     * 干系人性别
     */
    private String stakeholderSex;

    /**
     * 干系人出生日期
     */
    private String stakeholderBirthday;

    /**
     * 干系人婚姻状况
     */
    private String stakeholderMaritalStatus;

    /**
     * 干系人家庭住址/通讯地址
     */
    private String stakeholderHomeAddress;

    /**
     * 干系人职业类型
     */
    private String stakeholderWorkType;

    /**
     * 干系人单位性质
     */
    private String stakeholderWorkProperty;

    /**
     * 干系人企业主营
     */
    private String stakeholderWorkField;

    /**
     * 干系人单位地址
     */
    private String stakeholderWorkAddress;

    /**
     * 干系人电话
     */
    private String stakeholderWorkPhone;

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
     * CORE_CRE_PREAPPROVAL_GUARANTOR
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
     * @return STAKEHOLDER_RELATION null
     */
    public String getStakeholderRelation() {
        return stakeholderRelation;
    }

    /**
     * null
     * @param stakeholderRelation null
     */
    public void setStakeholderRelation(String stakeholderRelation) {
        this.stakeholderRelation = stakeholderRelation;
    }

    /**
     * null
     * @return STAKEHOLDER_TYPE null
     */
    public String getStakeholderType() {
        return stakeholderType;
    }

    /**
     * null
     * @param stakeholderType null
     */
    public void setStakeholderType(String stakeholderType) {
        this.stakeholderType = stakeholderType;
    }

    /**
     * null
     * @return STAKEHOLDER_NAME null
     */
    public String getStakeholderName() {
        return stakeholderName;
    }

    /**
     * null
     * @param stakeholderName null
     */
    public void setStakeholderName(String stakeholderName) {
        this.stakeholderName = stakeholderName;
    }

    /**
     * null
     * @return STAKEHOLDER_MOBILE null
     */
    public String getStakeholderMobile() {
        return stakeholderMobile;
    }

    /**
     * null
     * @param stakeholderMobile null
     */
    public void setStakeholderMobile(String stakeholderMobile) {
        this.stakeholderMobile = stakeholderMobile;
    }

    /**
     * null
     * @return STAKEHOLDER_CERT_TYPE null
     */
    public String getStakeholderCertType() {
        return stakeholderCertType;
    }

    /**
     * null
     * @param stakeholderCertType null
     */
    public void setStakeholderCertType(String stakeholderCertType) {
        this.stakeholderCertType = stakeholderCertType;
    }

    /**
     * null
     * @return STAKEHOLDER_CERT_NO null
     */
    public String getStakeholderCertNo() {
        return stakeholderCertNo;
    }

    /**
     * null
     * @param stakeholderCertNo null
     */
    public void setStakeholderCertNo(String stakeholderCertNo) {
        this.stakeholderCertNo = stakeholderCertNo;
    }

    /**
     * null
     * @return STAKEHOLDER_SEX null
     */
    public String getStakeholderSex() {
        return stakeholderSex;
    }

    /**
     * null
     * @param stakeholderSex null
     */
    public void setStakeholderSex(String stakeholderSex) {
        this.stakeholderSex = stakeholderSex;
    }

    /**
     * null
     * @return STAKEHOLDER_BIRTHDAY null
     */
    public String getStakeholderBirthday() {
        return stakeholderBirthday;
    }

    /**
     * null
     * @param stakeholderBirthday null
     */
    public void setStakeholderBirthday(String stakeholderBirthday) {
        this.stakeholderBirthday = stakeholderBirthday;
    }

    /**
     * null
     * @return STAKEHOLDER_MARITAL_STATUS null
     */
    public String getStakeholderMaritalStatus() {
        return stakeholderMaritalStatus;
    }

    /**
     * null
     * @param stakeholderMaritalStatus null
     */
    public void setStakeholderMaritalStatus(String stakeholderMaritalStatus) {
        this.stakeholderMaritalStatus = stakeholderMaritalStatus;
    }

    /**
     * null
     * @return STAKEHOLDER_HOME_ADDRESS null
     */
    public String getStakeholderHomeAddress() {
        return stakeholderHomeAddress;
    }

    /**
     * null
     * @param stakeholderHomeAddress null
     */
    public void setStakeholderHomeAddress(String stakeholderHomeAddress) {
        this.stakeholderHomeAddress = stakeholderHomeAddress;
    }

    /**
     * null
     * @return STAKEHOLDER_WORK_TYPE null
     */
    public String getStakeholderWorkType() {
        return stakeholderWorkType;
    }

    /**
     * null
     * @param stakeholderWorkType null
     */
    public void setStakeholderWorkType(String stakeholderWorkType) {
        this.stakeholderWorkType = stakeholderWorkType;
    }

    /**
     * null
     * @return STAKEHOLDER_WORK_PROPERTY null
     */
    public String getStakeholderWorkProperty() {
        return stakeholderWorkProperty;
    }

    /**
     * null
     * @param stakeholderWorkProperty null
     */
    public void setStakeholderWorkProperty(String stakeholderWorkProperty) {
        this.stakeholderWorkProperty = stakeholderWorkProperty;
    }

    /**
     * null
     * @return STAKEHOLDER_WORK_FIELD null
     */
    public String getStakeholderWorkField() {
        return stakeholderWorkField;
    }

    /**
     * null
     * @param stakeholderWorkField null
     */
    public void setStakeholderWorkField(String stakeholderWorkField) {
        this.stakeholderWorkField = stakeholderWorkField;
    }

    /**
     * null
     * @return STAKEHOLDER_WORK_ADDRESS null
     */
    public String getStakeholderWorkAddress() {
        return stakeholderWorkAddress;
    }

    /**
     * null
     * @param stakeholderWorkAddress null
     */
    public void setStakeholderWorkAddress(String stakeholderWorkAddress) {
        this.stakeholderWorkAddress = stakeholderWorkAddress;
    }

    /**
     * null
     * @return STAKEHOLDER_WORK_PHONE null
     */
    public String getStakeholderWorkPhone() {
        return stakeholderWorkPhone;
    }

    /**
     * null
     * @param stakeholderWorkPhone null
     */
    public void setStakeholderWorkPhone(String stakeholderWorkPhone) {
        this.stakeholderWorkPhone = stakeholderWorkPhone;
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