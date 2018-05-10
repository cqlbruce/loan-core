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
    private String serialNo;

    /**
     * 关联贷款机构配置流水号
     */
    private String relativeSerialNo;

    /**
     * 超时时间
     */
    private String overtime;

    /**
     * 申请频率
     */
    private String applyFrequency;

    /**
     * 功能类型
     */
    private String functionType;

    /**
     * 子流程定义-上传影响协议
     */
    private String subUploadImage;

    /**
     * 子流程定义-申请前置
     */
    private String subApplyFront;

    /**
     * 子流程定义-申请
     */
    private String subApply;

    /**
     * 子流程定义-等待结果通知
     */
    private String subWaitResult;

    /**
     * 子流程定义-主动查询结果
     */
    private String subQueryResult;

    /**
     * 子流程定义-申请后置
     */
    private String subApplyPost;

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
     * 功能名称
     */
    private String functionName;

    /**
     * 功能开关
     */
    private String functionOnOff;

    /**
     * 关联类型
     */
    private String relativeType;

    /**
     * LOAN_ORG_FUNCTION_CONSTRAINT
     */
    private static final long serialVersionUID = 1L;

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

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public String getApplyFrequency() {
        return applyFrequency;
    }

    public void setApplyFrequency(String applyFrequency) {
        this.applyFrequency = applyFrequency;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public String getSubUploadImage() {
        return subUploadImage;
    }

    public void setSubUploadImage(String subUploadImage) {
        this.subUploadImage = subUploadImage;
    }

    public String getSubApplyFront() {
        return subApplyFront;
    }

    public void setSubApplyFront(String subApplyFront) {
        this.subApplyFront = subApplyFront;
    }

    public String getSubApply() {
        return subApply;
    }

    public void setSubApply(String subApply) {
        this.subApply = subApply;
    }

    public String getSubWaitResult() {
        return subWaitResult;
    }

    public void setSubWaitResult(String subWaitResult) {
        this.subWaitResult = subWaitResult;
    }

    public String getSubQueryResult() {
        return subQueryResult;
    }

    public void setSubQueryResult(String subQueryResult) {
        this.subQueryResult = subQueryResult;
    }

    public String getSubApplyPost() {
        return subApplyPost;
    }

    public void setSubApplyPost(String subApplyPost) {
        this.subApplyPost = subApplyPost;
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

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionOnOff() {
        return functionOnOff;
    }

    public void setFunctionOnOff(String functionOnOff) {
        this.functionOnOff = functionOnOff;
    }

    public String getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(String relativeType) {
        this.relativeType = relativeType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}