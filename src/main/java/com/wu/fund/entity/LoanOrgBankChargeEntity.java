package com.wu.fund.entity;

/**
 * @Author: wangying
 * @Description:人行收费标准记录
 * @Date: Created in 17:29 2018/5/8
 */
public class LoanOrgBankChargeEntity {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 关联人行约束流水号
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
     * 档次笔数下限
     */
    private String lowlimit;

    /**
     * 档次笔数上限
     */
    private String uplimit;

    /**
     * 单笔收费金额
     */
    private String singlesum;

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
     * @return LOWLIMIT null
     */
    public String getLowlimit() {
        return lowlimit;
    }

    /**
     * null
     * @param lowlimit null
     */
    public void setLowlimit(String lowlimit) {
        this.lowlimit = lowlimit;
    }

    /**
     * null
     * @return UPLIMIT null
     */
    public String getUplimit() {
        return uplimit;
    }

    /**
     * null
     * @param uplimit null
     */
    public void setUplimit(String uplimit) {
        this.uplimit = uplimit;
    }

    /**
     * null
     * @return SINGLESUM null
     */
    public String getSinglesum() {
        return singlesum;
    }

    /**
     * null
     * @param singlesum null
     */
    public void setSinglesum(String singlesum) {
        this.singlesum = singlesum;
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