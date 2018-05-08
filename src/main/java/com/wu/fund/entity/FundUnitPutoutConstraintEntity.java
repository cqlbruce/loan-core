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
    private String serialno;

    /**
     * 关联资金单元编号
     */
    private String relativeserialno;

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
     * 收益计算方式
     */
    private String incomecalcumethod;

    /**
     * 放款一次性回佣比例
     */
    private String onetimeloanrebates;

    /**
     * 还款息费分佣比例
     */
    private String reimbursementrate;

    /**
     * 放款一次性回佣金额
     */
    private String onetimeloansum;

    /**
     * 综合资金成本（年化利率）
     */
    private String annualinterestrate;

    /**
     * 放款优先级
     */
    private String lendingpriority;

    /**
     * 放款权重
     */
    private String lendingweight;

    /**
     * 允许超限放款
     */
    private String allowableoverlimit;

    /**
     * 总额度（元）
     */
    private String totalsum;

    /**
     * 单客限额（元）
     */
    private String singlecustlimit;

    /**
     * 单笔最低限额（元）
     */
    private String singleminamount;

    /**
     * 单笔最高限额（元）
     */
    private String singlemaxamount;

    /**
     * 日限额（元）
     */
    private String dailylimit;

    /**
     * 月限额（元）
     */
    private String monthlylimit;

    /**
     * 月限额剩余次数
     */
    private String remainmonthlimit;

    /**
     * 日限额剩余次数
     */
    private String remaindaylimit;

    /**
     * 剩余总额度
     */
    private String remaintotalsum;

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
     * @return INCOMECALCUMETHOD null
     */
    public String getIncomecalcumethod() {
        return incomecalcumethod;
    }

    /**
     * null
     * @param incomecalcumethod null
     */
    public void setIncomecalcumethod(String incomecalcumethod) {
        this.incomecalcumethod = incomecalcumethod;
    }

    /**
     * null
     * @return ONETIMELOANREBATES null
     */
    public String getOnetimeloanrebates() {
        return onetimeloanrebates;
    }

    /**
     * null
     * @param onetimeloanrebates null
     */
    public void setOnetimeloanrebates(String onetimeloanrebates) {
        this.onetimeloanrebates = onetimeloanrebates;
    }

    /**
     * null
     * @return REIMBURSEMENTRATE null
     */
    public String getReimbursementrate() {
        return reimbursementrate;
    }

    /**
     * null
     * @param reimbursementrate null
     */
    public void setReimbursementrate(String reimbursementrate) {
        this.reimbursementrate = reimbursementrate;
    }

    /**
     * null
     * @return ONETIMELOANSUM null
     */
    public String getOnetimeloansum() {
        return onetimeloansum;
    }

    /**
     * null
     * @param onetimeloansum null
     */
    public void setOnetimeloansum(String onetimeloansum) {
        this.onetimeloansum = onetimeloansum;
    }

    /**
     * null
     * @return ANNUALINTERESTRATE null
     */
    public String getAnnualinterestrate() {
        return annualinterestrate;
    }

    /**
     * null
     * @param annualinterestrate null
     */
    public void setAnnualinterestrate(String annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }

    /**
     * null
     * @return LENDINGPRIORITY null
     */
    public String getLendingpriority() {
        return lendingpriority;
    }

    /**
     * null
     * @param lendingpriority null
     */
    public void setLendingpriority(String lendingpriority) {
        this.lendingpriority = lendingpriority;
    }

    /**
     * null
     * @return LENDINGWEIGHT null
     */
    public String getLendingweight() {
        return lendingweight;
    }

    /**
     * null
     * @param lendingweight null
     */
    public void setLendingweight(String lendingweight) {
        this.lendingweight = lendingweight;
    }

    /**
     * null
     * @return ALLOWABLEOVERLIMIT null
     */
    public String getAllowableoverlimit() {
        return allowableoverlimit;
    }

    /**
     * null
     * @param allowableoverlimit null
     */
    public void setAllowableoverlimit(String allowableoverlimit) {
        this.allowableoverlimit = allowableoverlimit;
    }

    /**
     * null
     * @return TOTALSUM null
     */
    public String getTotalsum() {
        return totalsum;
    }

    /**
     * null
     * @param totalsum null
     */
    public void setTotalsum(String totalsum) {
        this.totalsum = totalsum;
    }

    /**
     * null
     * @return SINGLECUSTLIMIT null
     */
    public String getSinglecustlimit() {
        return singlecustlimit;
    }

    /**
     * null
     * @param singlecustlimit null
     */
    public void setSinglecustlimit(String singlecustlimit) {
        this.singlecustlimit = singlecustlimit;
    }

    /**
     * null
     * @return SINGLEMINAMOUNT null
     */
    public String getSingleminamount() {
        return singleminamount;
    }

    /**
     * null
     * @param singleminamount null
     */
    public void setSingleminamount(String singleminamount) {
        this.singleminamount = singleminamount;
    }

    /**
     * null
     * @return SINGLEMAXAMOUNT null
     */
    public String getSinglemaxamount() {
        return singlemaxamount;
    }

    /**
     * null
     * @param singlemaxamount null
     */
    public void setSinglemaxamount(String singlemaxamount) {
        this.singlemaxamount = singlemaxamount;
    }

    /**
     * null
     * @return DAILYLIMIT null
     */
    public String getDailylimit() {
        return dailylimit;
    }

    /**
     * null
     * @param dailylimit null
     */
    public void setDailylimit(String dailylimit) {
        this.dailylimit = dailylimit;
    }

    /**
     * null
     * @return MONTHLYLIMIT null
     */
    public String getMonthlylimit() {
        return monthlylimit;
    }

    /**
     * null
     * @param monthlylimit null
     */
    public void setMonthlylimit(String monthlylimit) {
        this.monthlylimit = monthlylimit;
    }

    /**
     * null
     * @return REMAINMONTHLIMIT null
     */
    public String getRemainmonthlimit() {
        return remainmonthlimit;
    }

    /**
     * null
     * @param remainmonthlimit null
     */
    public void setRemainmonthlimit(String remainmonthlimit) {
        this.remainmonthlimit = remainmonthlimit;
    }

    /**
     * null
     * @return REMAINDAYLIMIT null
     */
    public String getRemaindaylimit() {
        return remaindaylimit;
    }

    /**
     * null
     * @param remaindaylimit null
     */
    public void setRemaindaylimit(String remaindaylimit) {
        this.remaindaylimit = remaindaylimit;
    }

    /**
     * null
     * @return REMAINTOTALSUM null
     */
    public String getRemaintotalsum() {
        return remaintotalsum;
    }

    /**
     * null
     * @param remaintotalsum null
     */
    public void setRemaintotalsum(String remaintotalsum) {
        this.remaintotalsum = remaintotalsum;
    }
}