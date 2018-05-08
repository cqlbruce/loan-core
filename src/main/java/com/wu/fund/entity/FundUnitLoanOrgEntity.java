package com.wu.fund.entity;

/**
 * @Author: wangying
 * @Description:贷款机构清单
 * @Date: Created in 17:29 2018/5/8
 */
public class FundUnitLoanOrgEntity {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 关联外键
     */
    private String relativeserialno;

    /**
     * 贷款机构类型
     */
    private String orgtype;

    /**
     * 贷款机构名称
     */
    private String orgname;

    /**
     * 贷款机构编码
     */
    private String orgcode;

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
     * @return ORGTYPE null
     */
    public String getOrgtype() {
        return orgtype;
    }

    /**
     * null
     * @param orgtype null
     */
    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    /**
     * null
     * @return ORGNAME null
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * null
     * @param orgname null
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    /**
     * null
     * @return ORGCODE null
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * null
     * @param orgcode null
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
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