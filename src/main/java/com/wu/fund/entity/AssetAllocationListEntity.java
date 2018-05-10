package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:资产配置清单
 * @Date: Created in 17:29 2018/5/8
 */
public class AssetAllocationListEntity {
    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 关联外键
     */
    private String relativeSerialNo;

    /**
     * 产品编码
     */
    private String productCode;

    /**
     * 产品维度
     */
    private String productDimension;

    /**
     * 占比
     */
    private String proportion;

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
     * 资产清单配置类型
     */
    private String assetType;

    /**
     * 学历
     */
    private String education;

    /**
     * 档次金额下限
     */
    private String minAccount;

    /**
     * 档次金额上限
     */
    private String maxAccount;

    /**
     * 贷款期限单位
     */
    private String loanTermUnit;

    /**
     * 贷款期限
     */
    private String loanTerm;

    /**
     * 还款方式
     */
    private String repaymentType;

    /**
     * 申请渠道
     */
    private String applyOrgId;

    /**
     * 客户企业
     */
    private String cusEnterprise;

    /**
     * 工作城市
     */
    private String workCity;

    /**
     * 房产城市
     */
    private String houseCity;

    /**
     * 客户客群分类
     */
    private String cusClassify;

    /**
     * 客户风险等级
     */
    private String riskGrade;

    /**
     * 客户企业分类
     */
    private String cusEnterpriseType;

    /**
     * 工作城市分类
     */
    private String workCityType;

    /**
     * 房产城市分类
     */
    private String houseCityType;

    /**
     * 工作省
     */
    private String workProvince;

    /**
     * 房产省
     */
    private String houseProvince;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductDimension() {
        return productDimension;
    }

    public void setProductDimension(String productDimension) {
        this.productDimension = productDimension;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
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

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMinAccount() {
        return minAccount;
    }

    public void setMinAccount(String minAccount) {
        this.minAccount = minAccount;
    }

    public String getMaxAccount() {
        return maxAccount;
    }

    public void setMaxAccount(String maxAccount) {
        this.maxAccount = maxAccount;
    }

    public String getLoanTermUnit() {
        return loanTermUnit;
    }

    public void setLoanTermUnit(String loanTermUnit) {
        this.loanTermUnit = loanTermUnit;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getApplyOrgId() {
        return applyOrgId;
    }

    public void setApplyOrgId(String applyOrgId) {
        this.applyOrgId = applyOrgId;
    }

    public String getCusEnterprise() {
        return cusEnterprise;
    }

    public void setCusEnterprise(String cusEnterprise) {
        this.cusEnterprise = cusEnterprise;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getHouseCity() {
        return houseCity;
    }

    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity;
    }

    public String getCusClassify() {
        return cusClassify;
    }

    public void setCusClassify(String cusClassify) {
        this.cusClassify = cusClassify;
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade;
    }

    public String getCusEnterpriseType() {
        return cusEnterpriseType;
    }

    public void setCusEnterpriseType(String cusEnterpriseType) {
        this.cusEnterpriseType = cusEnterpriseType;
    }

    public String getWorkCityType() {
        return workCityType;
    }

    public void setWorkCityType(String workCityType) {
        this.workCityType = workCityType;
    }

    public String getHouseCityType() {
        return houseCityType;
    }

    public void setHouseCityType(String houseCityType) {
        this.houseCityType = houseCityType;
    }

    public String getWorkProvince() {
        return workProvince;
    }

    public void setWorkProvince(String workProvince) {
        this.workProvince = workProvince;
    }

    public String getHouseProvince() {
        return houseProvince;
    }

    public void setHouseProvince(String houseProvince) {
        this.houseProvince = houseProvince;
    }
}