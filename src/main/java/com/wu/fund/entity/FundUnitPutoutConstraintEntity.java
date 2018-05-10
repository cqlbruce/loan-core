package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:资金单元放款约束
 * @Date: Created in 17:29 2018/5/8
 */
public class FundUnitPutoutConstraintEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 关联资金单元编号
     */
    private String relativeSerialNo;

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
     * 收益计算方式
     */
    private String incomeCalcuMethod;

    /**
     * 放款一次性回佣比例
     */
    private String oneTimeLoanRebates;

    /**
     * 还款息费分佣比例
     */
    private String reimbursementRate;

    /**
     * 放款一次性回佣金额
     */
    private String oneTimeLoanSum;

    /**
     * 综合资金成本（年化利率）
     */
    private String annualInterestRate;

    /**
     * 放款优先级
     */
    private String lendingPriority;

    /**
     * 放款权重
     */
    private String lendingWeight;

    /**
     * 允许超限放款
     */
    private String allowableOverLimit;

    /**
     * 总额度（元）
     */
    private String totalSum;

    /**
     * 单客限额（元）
     */
    private String singleCustLimit;

    /**
     * 单笔最低限额（元）
     */
    private String singleMinAmount;

    /**
     * 单笔最高限额（元）
     */
    private String singleMaxAmount;

    /**
     * 日限额（元）
     */
    private String dailyLimit;

    /**
     * 月限额（元）
     */
    private String monthlyLimit;

    /**
     * 月限额剩余次数
     */
    private String remainMonthLimit;

    /**
     * 日限额剩余次数
     */
    private String remainDayLimit;

    /**
     * 剩余总额度
     */
    private String remainTotalSum;

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

    public String getIncomeCalcuMethod() {
        return incomeCalcuMethod;
    }

    public void setIncomeCalcuMethod(String incomeCalcuMethod) {
        this.incomeCalcuMethod = incomeCalcuMethod;
    }

    public String getOneTimeLoanRebates() {
        return oneTimeLoanRebates;
    }

    public void setOneTimeLoanRebates(String oneTimeLoanRebates) {
        this.oneTimeLoanRebates = oneTimeLoanRebates;
    }

    public String getReimbursementRate() {
        return reimbursementRate;
    }

    public void setReimbursementRate(String reimbursementRate) {
        this.reimbursementRate = reimbursementRate;
    }

    public String getOneTimeLoanSum() {
        return oneTimeLoanSum;
    }

    public void setOneTimeLoanSum(String oneTimeLoanSum) {
        this.oneTimeLoanSum = oneTimeLoanSum;
    }

    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getLendingPriority() {
        return lendingPriority;
    }

    public void setLendingPriority(String lendingPriority) {
        this.lendingPriority = lendingPriority;
    }

    public String getLendingWeight() {
        return lendingWeight;
    }

    public void setLendingWeight(String lendingWeight) {
        this.lendingWeight = lendingWeight;
    }

    public String getAllowableOverLimit() {
        return allowableOverLimit;
    }

    public void setAllowableOverLimit(String allowableOverLimit) {
        this.allowableOverLimit = allowableOverLimit;
    }

    public String getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    public String getSingleCustLimit() {
        return singleCustLimit;
    }

    public void setSingleCustLimit(String singleCustLimit) {
        this.singleCustLimit = singleCustLimit;
    }

    public String getSingleMinAmount() {
        return singleMinAmount;
    }

    public void setSingleMinAmount(String singleMinAmount) {
        this.singleMinAmount = singleMinAmount;
    }

    public String getSingleMaxAmount() {
        return singleMaxAmount;
    }

    public void setSingleMaxAmount(String singleMaxAmount) {
        this.singleMaxAmount = singleMaxAmount;
    }

    public String getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(String dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public String getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(String monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
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

    public String getRemainTotalSum() {
        return remainTotalSum;
    }

    public void setRemainTotalSum(String remainTotalSum) {
        this.remainTotalSum = remainTotalSum;
    }
}