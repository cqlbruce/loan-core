package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:贷款机构人行约束
 * @Date: Created in 17:29 2018/5/8
 */
public class LoanOrgBankConstraintEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeSerialNo;

    /**
     * 人行数据类型
     */
    private String bankDataType;

    /**
     * 人行优先级
     */
    private String priority;

    /**
     * 人行权重
     */
    private String weight;

    /**
     * 人行月限次控制方式
     */
    private String controlType;

    /**
     * 人行固定月限次
     */
    private String monthLimit;

    /**
     * 人行月限次放款倍数
     */
    private String putOutMultiple;

    /**
     * 人行收费标准
     */
    private String chargeType;

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
     * 人行日限次
     */
    private String dayLimit;

    /**
     * 人行报告有效期限
     */
    private String reportTerm;

    /**
     * 暂存标识
     */
    private String tempSaveFlag;

    /**
     * 关联类型
     */
    private String relativeType;

    /**
     * 人行固定月限次剩余次数
     */
    private String remainMonthLimit;

    /**
     * 人行日限次剩余次数
     */
    private String remainDayLimit;

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

    public String getBankDataType() {
        return bankDataType;
    }

    public void setBankDataType(String bankDataType) {
        this.bankDataType = bankDataType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

    public String getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(String dayLimit) {
        this.dayLimit = dayLimit;
    }

    public String getReportTerm() {
        return reportTerm;
    }

    public void setReportTerm(String reportTerm) {
        this.reportTerm = reportTerm;
    }

    public String getTempSaveFlag() {
        return tempSaveFlag;
    }

    public void setTempSaveFlag(String tempSaveFlag) {
        this.tempSaveFlag = tempSaveFlag;
    }

    public String getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(String relativeType) {
        this.relativeType = relativeType;
    }

    public String getRemainMonthLimit() {
        return remainMonthLimit;
    }

    public void setRemainMonthLimit(String remainMonthLimit) {
        this.remainMonthLimit = remainMonthLimit;
    }

    public String getRemainDayLimit() {
        return remainDayLimit;
    }

    public void setRemainDayLimit(String remainDayLimit) {
        this.remainDayLimit = remainDayLimit;
    }
}