package com.wu.fund.entity;




/**
 * @Author: wangying
 * @Description:授信约束
 * @Date: Created in 17:29 2018/5/8
 */
public class LoanOrgApplyConstraintEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeSerialNo;

    /**
     * 授信月限次控制方式
     */
    private String controlType;

    /**
     * 授信固定月限次
     */
    private String monthLimit;

    /**
     * 授信月限次放款倍数
     */
    private String putOutMultiple;

    /**
     * 授信日限次
     */
    private String dayLimit;

    /**
     * 授信通过有效期限
     */
    private String approveTerm;

    /**
     * 授信拒绝限制期限
     */
    private String refuseTerm;

    /**
     * 授信自主查询征信
     */
    private String queryCredit;

    /**
     * 授信自主绑卡验证
     */
    private String cardCheck;

    /**
     * 录入时间
     */
    private String inputDate;

    /**
     * 更新人
     */
    private String updateUserId;

    /**
     * 更新时间
     */
    private String updateDate;

    /**
     * 录入人
     */
    private String inputUserId;

    /**
     * 录入机构
     */
    private String inputOrgId;

    /**
     * 更新机构
     */
    private String updateOrgId;

    /**
     * 身份验证收费标准
     */
    private String chargeType;

    /**
     * 关联类型
     */
    private String relativeType;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getRelativeSerialNo() {
        return relativeSerialNo;
    }

    public void setRelativeSerialNo(String relativeSerialNo) {
        this.relativeSerialNo = relativeSerialNo;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public String getMonthLimit() {
        return monthLimit;
    }

    public void setMonthLimit(String monthLimit) {
        this.monthLimit = monthLimit;
    }

    public String getPutOutMultiple() {
        return putOutMultiple;
    }

    public void setPutOutMultiple(String putOutMultiple) {
        this.putOutMultiple = putOutMultiple;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(String dayLimit) {
        this.dayLimit = dayLimit;
    }

    public String getApproveTerm() {
        return approveTerm;
    }

    public void setApproveTerm(String approveTerm) {
        this.approveTerm = approveTerm;
    }

    public String getRefuseTerm() {
        return refuseTerm;
    }

    public void setRefuseTerm(String refuseTerm) {
        this.refuseTerm = refuseTerm;
    }

    public String getQueryCredit() {
        return queryCredit;
    }

    public void setQueryCredit(String queryCredit) {
        this.queryCredit = queryCredit;
    }

    public String getCardCheck() {
        return cardCheck;
    }

    public void setCardCheck(String cardCheck) {
        this.cardCheck = cardCheck;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getInputUserId() {
        return inputUserId;
    }

    public void setInputUserId(String inputUserId) {
        this.inputUserId = inputUserId;
    }

    public String getInputOrgId() {
        return inputOrgId;
    }

    public void setInputOrgId(String inputOrgId) {
        this.inputOrgId = inputOrgId;
    }

    public String getUpdateOrgId() {
        return updateOrgId;
    }

    public void setUpdateOrgId(String updateOrgId) {
        this.updateOrgId = updateOrgId;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(String relativeType) {
        this.relativeType = relativeType;
    }
}