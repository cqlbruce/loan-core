package com.wu.fund.entity;




/**
 * @Author: wangying
 * @Description:授信约束
 * @Date: Created in 17:29 2018/5/8
 */
public class LoanOrgApplyConstraintEntity {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeserialno;

    /**
     * 授信月限次控制方式
     */
    private String controltype;

    /**
     * 授信固定月限次
     */
    private String monthlimit;

    /**
     * 授信月限次放款倍数
     */
    private String putoutmultiple;

    /**
     * 授信日限次
     */
    private String daylimit;

    /**
     * 授信通过有效期限
     */
    private String approveterm;

    /**
     * 授信拒绝限制期限
     */
    private String refuseterm;

    /**
     * 授信自主查询征信
     */
    private String querycredit;

    /**
     * 授信自主绑卡验证
     */
    private String cardcheck;

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
     * 身份验证收费标准
     */
    private String chargetype;

    /**
     * 关联类型
     */
    private String relativetype;

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
     * @return CONTROLTYPE null
     */
    public String getControltype() {
        return controltype;
    }

    /**
     * null
     * @param controltype null
     */
    public void setControltype(String controltype) {
        this.controltype = controltype;
    }

    /**
     * null
     * @return MONTHLIMIT null
     */
    public String getMonthlimit() {
        return monthlimit;
    }

    /**
     * null
     * @param monthlimit null
     */
    public void setMonthlimit(String monthlimit) {
        this.monthlimit = monthlimit;
    }

    /**
     * null
     * @return PUTOUTMULTIPLE null
     */
    public String getPutoutmultiple() {
        return putoutmultiple;
    }

    /**
     * null
     * @param putoutmultiple null
     */
    public void setPutoutmultiple(String putoutmultiple) {
        this.putoutmultiple = putoutmultiple;
    }

    /**
     * null
     * @return DAYLIMIT null
     */
    public String getDaylimit() {
        return daylimit;
    }

    /**
     * null
     * @param daylimit null
     */
    public void setDaylimit(String daylimit) {
        this.daylimit = daylimit;
    }

    /**
     * null
     * @return APPROVETERM null
     */
    public String getApproveterm() {
        return approveterm;
    }

    /**
     * null
     * @param approveterm null
     */
    public void setApproveterm(String approveterm) {
        this.approveterm = approveterm;
    }

    /**
     * null
     * @return REFUSETERM null
     */
    public String getRefuseterm() {
        return refuseterm;
    }

    /**
     * null
     * @param refuseterm null
     */
    public void setRefuseterm(String refuseterm) {
        this.refuseterm = refuseterm;
    }

    /**
     * null
     * @return QUERYCREDIT null
     */
    public String getQuerycredit() {
        return querycredit;
    }

    /**
     * null
     * @param querycredit null
     */
    public void setQuerycredit(String querycredit) {
        this.querycredit = querycredit;
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
     * @return CHARGETYPE null
     */
    public String getChargetype() {
        return chargetype;
    }

    /**
     * null
     * @param chargetype null
     */
    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }

    /**
     * null
     * @return RELATIVETYPE null
     */
    public String getRelativetype() {
        return relativetype;
    }

    /**
     * null
     * @param relativetype null
     */
    public void setRelativetype(String relativetype) {
        this.relativetype = relativetype;
    }
}