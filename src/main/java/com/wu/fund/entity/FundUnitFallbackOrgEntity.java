package com.wu.fund.entity;



/**
 * @Author: wangying
 * @Description:资金单元兜底机构
 * @Date: Created in 17:29 2018/5/8
 */
public class FundUnitFallbackOrgEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 关联资金配置流水号
     */
    private String relativeSerialNo;

    /**
     * 兜底机构类型
     */
    private String orgType;

    /**
     * 兜底机构名称
     */
    private String orgName;

    /**
     * 兜底机构编码
     */
    private String orgCode;

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
     * 兜底模式
     */
    private String fallbackType;

    /**
     * 代偿天数
     */
    private String compensatoryDay;

    /**
     * 回购天数
     */
    private String buybackDay;

    /**
     * 兜底费率类型
     */
    private String rateType;

    /**
     * 兜底费率
     */
    private String rate;

    /**
     * 兜底保证金比例
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

    public String getFallbackType() {
        return fallbackType;
    }

    public void setFallbackType(String fallbackType) {
        this.fallbackType = fallbackType;
    }

    public String getCompensatoryDay() {
        return compensatoryDay;
    }

    public void setCompensatoryDay(String compensatoryDay) {
        this.compensatoryDay = compensatoryDay;
    }

    public String getBuybackDay() {
        return buybackDay;
    }

    public void setBuybackDay(String buybackDay) {
        this.buybackDay = buybackDay;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(String marginLevel) {
        this.marginLevel = marginLevel;
    }
}