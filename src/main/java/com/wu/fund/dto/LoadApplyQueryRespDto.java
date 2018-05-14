package com.wu.fund.dto;

import java.math.BigDecimal;

/**
 * @Author: wangying
 * @Description:申请放款查询返回参数
 * @Date: Created in  2018/5/14
 */
public class LoadApplyQueryRespDto {

    /**
     * 放款请求流水号
     */
    private String lApplyNo;

    /**
     * 授信或预审批受理编号
     */
    private String aDealNo;

    /**
     * 授信或预审批资金方业务流水号
     */
    private String aCapitalBusiNo;

    /**
     * 处理结果
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 起息日
     */
    private String transDate;

    /**
     * 对账日期
     */
    private String clearDate;


    public String getlApplyNo() {
        return lApplyNo;
    }

    public void setlApplyNo(String lApplyNo) {
        this.lApplyNo = lApplyNo;
    }

    public String getaDealNo() {
        return aDealNo;
    }

    public void setaDealNo(String aDealNo) {
        this.aDealNo = aDealNo;
    }

    public String getaCapitalBusiNo() {
        return aCapitalBusiNo;
    }

    public void setaCapitalBusiNo(String aCapitalBusiNo) {
        this.aCapitalBusiNo = aCapitalBusiNo;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }
}
