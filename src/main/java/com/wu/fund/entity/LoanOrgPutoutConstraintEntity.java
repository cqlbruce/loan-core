package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:贷款机构配置放款约束
 * @Date: Created in  2018/5/9
 */
public class LoanOrgPutoutConstraintEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeSerialNo;

    /**
     * 放款自主查询征信
     */
    private String queryputout;

    /**
     * 放款自主绑卡验证
     */
    private String cardCheck;

    /**
     * 银行二类户开通
     */
    private String secondAccount;

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
     * 代付收费标准
     */
    private String payFeeRule;

    /**
     * 是否由世联生成还款计划(code码YesNo  01是 02否)
     */
    private String isCreateSchedule;

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

    public String getQueryputout() {
        return queryputout;
    }

    public void setQueryputout(String queryputout) {
        this.queryputout = queryputout;
    }

    public String getCardCheck() {
        return cardCheck;
    }

    public void setCardCheck(String cardCheck) {
        this.cardCheck = cardCheck;
    }

    public String getSecondAccount() {
        return secondAccount;
    }

    public void setSecondAccount(String secondAccount) {
        this.secondAccount = secondAccount;
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

    public String getPayFeeRule() {
        return payFeeRule;
    }

    public void setPayFeeRule(String payFeeRule) {
        this.payFeeRule = payFeeRule;
    }

    public String getIsCreateSchedule() {
        return isCreateSchedule;
    }

    public void setIsCreateSchedule(String isCreateSchedule) {
        this.isCreateSchedule = isCreateSchedule;
    }
}