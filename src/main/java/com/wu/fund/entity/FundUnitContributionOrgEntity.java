package com.wu.fund.entity;

/**
 * @Author: wangying
 * @Description:出资机构清单
 * @Date: Created in 17:29 2018/5/8
 */
public class FundUnitContributionOrgEntity {
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
     * 出资机构类型
     */
    private String orgType;

    /**
     * 出资机构名称
     */
    private String orgName;

    /**
     * 出资机构编码
     */
    private String orgCode;

    /**
     * 出资比例
     */
    private String contributionProportion;

    /**
     * 收益分配方式
     */
    private String incomeDistributionMode;

    /**
     * 收益比例
     */
    private String incomeRatio;

    /**
     * '资金成本（年化利率）
     */
    private String capitalCost;

    /**
     * 保证金比例
     */
    private String marginLevel;

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

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getContributionProportion() {
        return contributionProportion;
    }

    public void setContributionProportion(String contributionProportion) {
        this.contributionProportion = contributionProportion;
    }

    public String getIncomeDistributionMode() {
        return incomeDistributionMode;
    }

    public void setIncomeDistributionMode(String incomeDistributionMode) {
        this.incomeDistributionMode = incomeDistributionMode;
    }

    public String getIncomeRatio() {
        return incomeRatio;
    }

    public void setIncomeRatio(String incomeRatio) {
        this.incomeRatio = incomeRatio;
    }

    public String getCapitalCost() {
        return capitalCost;
    }

    public void setCapitalCost(String capitalCost) {
        this.capitalCost = capitalCost;
    }

    public String getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(String marginLevel) {
        this.marginLevel = marginLevel;
    }
}