package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:资金单元配置
 * @Date: Created in 17:29 2018/5/8
 */
public class FundunitBasicinfomationEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 资金单元名称
     */
    private String fundUnitName;

    /**
     * 资金单元状态
     */
    private String fundUnitStatus;

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
     * 资金单元编码
     */
    private String fundUnitNo;

    /**
     * 资金引入地区公司
     */
    private String company;

    /**
     * 资金引入地区权重
     */
    private String weight;

    /**
     * 生效日期
     */
    private String validDate;

    /**
     * 失效日期
     */
    private String invalidDate;

    /**
     * 额度模式
     */
    private String quotaMode;

    /**
     * 放款方式
     */
    private String lenders;

    /**
     * 暂存标识
     */
    private String tempSaveFlag;

    /**
     * 调整标识
     */
    private String changeFlag;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getFundUnitName() {
        return fundUnitName;
    }

    public void setFundUnitName(String fundUnitName) {
        this.fundUnitName = fundUnitName;
    }

    public String getFundUnitStatus() {
        return fundUnitStatus;
    }

    public void setFundUnitStatus(String fundUnitStatus) {
        this.fundUnitStatus = fundUnitStatus;
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

    public String getFundUnitNo() {
        return fundUnitNo;
    }

    public void setFundUnitNo(String fundUnitNo) {
        this.fundUnitNo = fundUnitNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getQuotaMode() {
        return quotaMode;
    }

    public void setQuotaMode(String quotaMode) {
        this.quotaMode = quotaMode;
    }

    public String getLenders() {
        return lenders;
    }

    public void setLenders(String lenders) {
        this.lenders = lenders;
    }

    public String getTempSaveFlag() {
        return tempSaveFlag;
    }

    public void setTempSaveFlag(String tempSaveFlag) {
        this.tempSaveFlag = tempSaveFlag;
    }

    public String getChangeFlag() {
        return changeFlag;
    }

    public void setChangeFlag(String changeFlag) {
        this.changeFlag = changeFlag;
    }
}