package com.wu.fund.entity;

import java.io.Serializable;


/**
 * @Author: wangying
 * @Description:贷款机构配置功能约束
 * @Date: Created in  2018/5/9
 */
public class LoanOrgFunctionConstraintEntity implements Serializable {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeserialno;

    /**
     * 超时时间
     */
    private String overtime;

    /**
     * 申请频率
     */
    private String applyfrequency;

    /**
     * 功能类型
     */
    private String functiontype;

    /**
     * 子流程定义-上传影响协议
     */
    private String subuploadimage;

    /**
     * 子流程定义-申请前置
     */
    private String subapplyfront;

    /**
     * 子流程定义-申请
     */
    private String subapply;

    /**
     * 子流程定义-等待结果通知
     */
    private String subwaitresult;

    /**
     * 子流程定义-主动查询结果
     */
    private String subqueryresult;

    /**
     * 子流程定义-申请后置
     */
    private String subapplypost;

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
     * 功能名称
     */
    private String functionname;

    /**
     * 功能开关
     */
    private String functiononoff;

    /**
     * 关联类型
     */
    private String relativetype;

    /**
     * LOAN_ORG_FUNCTION_CONSTRAINT
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
     * @return OVERTIME null
     */
    public String getOvertime() {
        return overtime;
    }

    /**
     * null
     * @param overtime null
     */
    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    /**
     * null
     * @return APPLYFREQUENCY null
     */
    public String getApplyfrequency() {
        return applyfrequency;
    }

    /**
     * null
     * @param applyfrequency null
     */
    public void setApplyfrequency(String applyfrequency) {
        this.applyfrequency = applyfrequency;
    }

    /**
     * null
     * @return FUNCTIONTYPE null
     */
    public String getFunctiontype() {
        return functiontype;
    }

    /**
     * null
     * @param functiontype null
     */
    public void setFunctiontype(String functiontype) {
        this.functiontype = functiontype;
    }

    /**
     * null
     * @return SUBUPLOADIMAGE null
     */
    public String getSubuploadimage() {
        return subuploadimage;
    }

    /**
     * null
     * @param subuploadimage null
     */
    public void setSubuploadimage(String subuploadimage) {
        this.subuploadimage = subuploadimage;
    }

    /**
     * null
     * @return SUBAPPLYFRONT null
     */
    public String getSubapplyfront() {
        return subapplyfront;
    }

    /**
     * null
     * @param subapplyfront null
     */
    public void setSubapplyfront(String subapplyfront) {
        this.subapplyfront = subapplyfront;
    }

    /**
     * null
     * @return SUBAPPLY null
     */
    public String getSubapply() {
        return subapply;
    }

    /**
     * null
     * @param subapply null
     */
    public void setSubapply(String subapply) {
        this.subapply = subapply;
    }

    /**
     * null
     * @return SUBWAITRESULT null
     */
    public String getSubwaitresult() {
        return subwaitresult;
    }

    /**
     * null
     * @param subwaitresult null
     */
    public void setSubwaitresult(String subwaitresult) {
        this.subwaitresult = subwaitresult;
    }

    /**
     * null
     * @return SUBQUERYRESULT null
     */
    public String getSubqueryresult() {
        return subqueryresult;
    }

    /**
     * null
     * @param subqueryresult null
     */
    public void setSubqueryresult(String subqueryresult) {
        this.subqueryresult = subqueryresult;
    }

    /**
     * null
     * @return SUBAPPLYPOST null
     */
    public String getSubapplypost() {
        return subapplypost;
    }

    /**
     * null
     * @param subapplypost null
     */
    public void setSubapplypost(String subapplypost) {
        this.subapplypost = subapplypost;
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
     * @return FUNCTIONNAME null
     */
    public String getFunctionname() {
        return functionname;
    }

    /**
     * null
     * @param functionname null
     */
    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    /**
     * null
     * @return FUNCTIONONOFF null
     */
    public String getFunctiononoff() {
        return functiononoff;
    }

    /**
     * null
     * @param functiononoff null
     */
    public void setFunctiononoff(String functiononoff) {
        this.functiononoff = functiononoff;
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