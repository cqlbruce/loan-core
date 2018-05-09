package com.wu.fund.entity;

import java.io.Serializable;


/**
 * @Author: wangying
 * @Description:贷款机构配置功能约束黑暗期
 * @Date: Created in  2018/5/9
 */
public class FunctionDarkPeriodEntity implements Serializable {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 关联外键
     */
    private String relativeserialno;

    /**
     * 开始时间
     */
    private String begintime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * 生效时间
     */
    private String validtime;

    /**
     * 失效时间
     */
    private String invalidtime;

    /**
     * 银行行号
     */
    private String bankno;

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
     * 关联类型
     */
    private String relativetype;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * FUNCTION_DARK_PERIOD
     */
    private static final long serialVersionUID = 1L;

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
     * @return BEGINTIME null
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * null
     * @param begintime null
     */
    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    /**
     * null
     * @return ENDTIME null
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * null
     * @param endtime null
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * null
     * @return VALIDTIME null
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * null
     * @param validtime null
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    /**
     * null
     * @return INVALIDTIME null
     */
    public String getInvalidtime() {
        return invalidtime;
    }

    /**
     * null
     * @param invalidtime null
     */
    public void setInvalidtime(String invalidtime) {
        this.invalidtime = invalidtime;
    }

    /**
     * null
     * @return BANKNO null
     */
    public String getBankno() {
        return bankno;
    }

    /**
     * null
     * @param bankno null
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
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

    /**
     * null
     * @return BANKNAME null
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * null
     * @param bankname null
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}