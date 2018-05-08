package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:资金单元当客限额约束
 * @Date: Created in 17:29 2018/5/8
 */
public class FundUnitCustomerConstraintEntity {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 客户编号
     */
    private String customerid;

    /**
     * 客户剩余可用额度
     */
    private String remainsum;

    /**
     * 资金单元编码
     */
    private String fundunitno;

    /**
     * 录入时间
     */
    private String inputdate;

    /**
     * 更新人
     */
    private String updateuserid;

    /**
     * 更新时间
     */
    private String updatedate;

    /**
     * 录入人
     */
    private String inputuserid;

    /**
     * 录入机构
     */
    private String inputorgid;

    /**
     * 更新机构
     */
    private String updateorgid;

    /**
     * null
     * @return SERIALNO null
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * null
     * @param serialno null
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
     * null
     * @return CUSTOMERID null
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * null
     * @param customerid null
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * null
     * @return REMAINSUM null
     */
    public String getRemainsum() {
        return remainsum;
    }

    /**
     * null
     * @param remainsum null
     */
    public void setRemainsum(String remainsum) {
        this.remainsum = remainsum;
    }

    /**
     * null
     * @return FUNDUNITNO null
     */
    public String getFundunitno() {
        return fundunitno;
    }

    /**
     * null
     * @param fundunitno null
     */
    public void setFundunitno(String fundunitno) {
        this.fundunitno = fundunitno;
    }

    /**
     * null
     * @return INPUTDATE null
     */
    public String getInputdate() {
        return inputdate;
    }

    /**
     * null
     * @param inputdate null
     */
    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }

    /**
     * null
     * @return UPDATEUSERID null
     */
    public String getUpdateuserid() {
        return updateuserid;
    }

    /**
     * null
     * @param updateuserid null
     */
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid;
    }

    /**
     * null
     * @return UPDATEDATE null
     */
    public String getUpdatedate() {
        return updatedate;
    }

    /**
     * null
     * @param updatedate null
     */
    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * null
     * @return INPUTUSERID null
     */
    public String getInputuserid() {
        return inputuserid;
    }

    /**
     * null
     * @param inputuserid null
     */
    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid;
    }

    /**
     * null
     * @return INPUTORGID null
     */
    public String getInputorgid() {
        return inputorgid;
    }

    /**
     * null
     * @param inputorgid null
     */
    public void setInputorgid(String inputorgid) {
        this.inputorgid = inputorgid;
    }

    /**
     * null
     * @return UPDATEORGID null
     */
    public String getUpdateorgid() {
        return updateorgid;
    }

    /**
     * null
     * @param updateorgid null
     */
    public void setUpdateorgid(String updateorgid) {
        this.updateorgid = updateorgid;
    }
}