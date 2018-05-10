package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:贷款机构配置
 * @Date: Created in 17:29 2018/5/8
 */
public class LoanOrgCatalogEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 贷款机构类型
     */
    private String orgType;

    /**
     * 贷款机构名称
     */
    private String orgName;

    /**
     * 贷款机构编码
     */
    private String orgCode;

    /**
     * 贷款机构状态
     */
    private String status;

    /**
     * 人行开关
     */
    private String peopleBankOnOff;

    /**
     * 授信开关
     */
    private String creditOnOff;

    /**
     * 放款开关
     */
    private String putOutOnOff;

    /**
     * 还款开关
     */
    private String repaymentOnOff;

    /**
     * 放款通知开关
     */
    private String putOutTipsOnOff;

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
     * 还款通知开关
     */
    private String repaymentTipsOnOff;

    /**
     * 对账时间
     */
    private String fundCheckDate;

    /**
     * 对账数据类型清单
     */
    private String fundCheckDataType;

    /**
     * 账单周期
     */
    private String billingCycle;

    /**
     * 账单日期
     */
    private String billingDate;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPeopleBankOnOff() {
        return peopleBankOnOff;
    }

    public void setPeopleBankOnOff(String peopleBankOnOff) {
        this.peopleBankOnOff = peopleBankOnOff;
    }

    public String getCreditOnOff() {
        return creditOnOff;
    }

    public void setCreditOnOff(String creditOnOff) {
        this.creditOnOff = creditOnOff;
    }

    public String getPutOutOnOff() {
        return putOutOnOff;
    }

    public void setPutOutOnOff(String putOutOnOff) {
        this.putOutOnOff = putOutOnOff;
    }

    public String getRepaymentOnOff() {
        return repaymentOnOff;
    }

    public void setRepaymentOnOff(String repaymentOnOff) {
        this.repaymentOnOff = repaymentOnOff;
    }

    public String getPutOutTipsOnOff() {
        return putOutTipsOnOff;
    }

    public void setPutOutTipsOnOff(String putOutTipsOnOff) {
        this.putOutTipsOnOff = putOutTipsOnOff;
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

    public String getRepaymentTipsOnOff() {
        return repaymentTipsOnOff;
    }

    public void setRepaymentTipsOnOff(String repaymentTipsOnOff) {
        this.repaymentTipsOnOff = repaymentTipsOnOff;
    }

    public String getFundCheckDate() {
        return fundCheckDate;
    }

    public void setFundCheckDate(String fundCheckDate) {
        this.fundCheckDate = fundCheckDate;
    }

    public String getFundCheckDataType() {
        return fundCheckDataType;
    }

    public void setFundCheckDataType(String fundCheckDataType) {
        this.fundCheckDataType = fundCheckDataType;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
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