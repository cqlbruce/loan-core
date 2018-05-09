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
    private String serialno;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeserialno;

    /**
     * 放款自主查询征信
     */
    private String queryputout;

    /**
     * 放款自主绑卡验证
     */
    private String cardcheck;

    /**
     * 银行二类户开通
     */
    private String secondaccount;

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
     * 代付收费标准
     */
    private String payfeerule;

    /**
     * 是否由世联生成还款计划(code码YesNo  01是 02否)
     */
    private String iscreateschedule;

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
     * @return RELATIVESERIALNO null
     */
    public String getRelativeserialno() {
        return relativeserialno;
    }

    /**
     * null
     * @param relativeserialno null
     */
    public void setRelativeserialno(String relativeserialno) {
        this.relativeserialno = relativeserialno;
    }

    /**
     * null
     * @return QUERYPUTOUT null
     */
    public String getQueryputout() {
        return queryputout;
    }

    /**
     * null
     * @param queryputout null
     */
    public void setQueryputout(String queryputout) {
        this.queryputout = queryputout;
    }

    /**
     * null
     * @return CARDCHECK null
     */
    public String getCardcheck() {
        return cardcheck;
    }

    /**
     * null
     * @param cardcheck null
     */
    public void setCardcheck(String cardcheck) {
        this.cardcheck = cardcheck;
    }

    /**
     * null
     * @return SECONDACCOUNT null
     */
    public String getSecondaccount() {
        return secondaccount;
    }

    /**
     * null
     * @param secondaccount null
     */
    public void setSecondaccount(String secondaccount) {
        this.secondaccount = secondaccount;
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

    /**
     * null
     * @return PAYFEERULE null
     */
    public String getPayfeerule() {
        return payfeerule;
    }

    /**
     * null
     * @param payfeerule null
     */
    public void setPayfeerule(String payfeerule) {
        this.payfeerule = payfeerule;
    }

    /**
     * null
     * @return ISCREATESCHEDULE null
     */
    public String getIscreateschedule() {
        return iscreateschedule;
    }

    /**
     * null
     * @param iscreateschedule null
     */
    public void setIscreateschedule(String iscreateschedule) {
        this.iscreateschedule = iscreateschedule;
    }
}