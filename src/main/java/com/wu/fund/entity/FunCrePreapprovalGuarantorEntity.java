package com.wu.fund.entity;

import java.io.Serializable;

/**
 * @Author: wangying
 * @Description:授信预审批共借人和担保人信息
 * @Date: Created in  2018/5/9
 */
public class FunCrePreapprovalGuarantorEntity implements Serializable {
    /**
     * 共借人(或担保人)流水号
     */
    private String serialNo;

    /**
     * 授信或预审批请求流水号
     */
    private String aApplyNo;

    /**
     * 干系人与客户关系
     */
    private String stakeholderRelation;

    /**
     * 干系人类型1：共借人
     * 2：担保人
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
     * FUN_CRE_PREAPPROVAL_GUARANTOR
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

    public String getStakeholderRelation() {
        return stakeholderRelation;
    }

    public void setStakeholderRelation(String stakeholderRelation) {
        this.stakeholderRelation = stakeholderRelation;
    }

    public String getStakeholderType() {
        return stakeholderType;
    }

    public void setStakeholderType(String stakeholderType) {
        this.stakeholderType = stakeholderType;
    }

    public String getStakeholderName() {
        return stakeholderName;
    }

    public void setStakeholderName(String stakeholderName) {
        this.stakeholderName = stakeholderName;
    }

    public String getStakeholderMobile() {
        return stakeholderMobile;
    }

    public void setStakeholderMobile(String stakeholderMobile) {
        this.stakeholderMobile = stakeholderMobile;
    }

    public String getStakeholderCertType() {
        return stakeholderCertType;
    }

    public void setStakeholderCertType(String stakeholderCertType) {
        this.stakeholderCertType = stakeholderCertType;
    }

    public String getStakeholderCertNo() {
        return stakeholderCertNo;
    }

    public void setStakeholderCertNo(String stakeholderCertNo) {
        this.stakeholderCertNo = stakeholderCertNo;
    }

    public String getStakeholderSex() {
        return stakeholderSex;
    }

    public void setStakeholderSex(String stakeholderSex) {
        this.stakeholderSex = stakeholderSex;
    }

    public String getStakeholderBirthday() {
        return stakeholderBirthday;
    }

    public void setStakeholderBirthday(String stakeholderBirthday) {
        this.stakeholderBirthday = stakeholderBirthday;
    }

    public String getStakeholderMaritalStatus() {
        return stakeholderMaritalStatus;
    }

    public void setStakeholderMaritalStatus(String stakeholderMaritalStatus) {
        this.stakeholderMaritalStatus = stakeholderMaritalStatus;
    }

    public String getStakeholderHomeAddress() {
        return stakeholderHomeAddress;
    }

    public void setStakeholderHomeAddress(String stakeholderHomeAddress) {
        this.stakeholderHomeAddress = stakeholderHomeAddress;
    }

    public String getStakeholderWorkType() {
        return stakeholderWorkType;
    }

    public void setStakeholderWorkType(String stakeholderWorkType) {
        this.stakeholderWorkType = stakeholderWorkType;
    }

    public String getStakeholderWorkProperty() {
        return stakeholderWorkProperty;
    }

    public void setStakeholderWorkProperty(String stakeholderWorkProperty) {
        this.stakeholderWorkProperty = stakeholderWorkProperty;
    }

    public String getStakeholderWorkField() {
        return stakeholderWorkField;
    }

    public void setStakeholderWorkField(String stakeholderWorkField) {
        this.stakeholderWorkField = stakeholderWorkField;
    }

    public String getStakeholderWorkAddress() {
        return stakeholderWorkAddress;
    }

    public void setStakeholderWorkAddress(String stakeholderWorkAddress) {
        this.stakeholderWorkAddress = stakeholderWorkAddress;
    }

    public String getStakeholderWorkPhone() {
        return stakeholderWorkPhone;
    }

    public void setStakeholderWorkPhone(String stakeholderWorkPhone) {
        this.stakeholderWorkPhone = stakeholderWorkPhone;
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