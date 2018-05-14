package com.wu.fund.dto;

/**
 * @Author: wangying
 * @Description:查询授信或预审批结果
 * @Date: Created in  2018/5/14
 */
public class FundPretrialApprovalQueryRespDto {

    /**
     * 授信或预审批请求流水号
     */
    private String aApplyNo;

    /**
     * 授信或预审批受理流水号
     */
    private String aDealNo;

    /**
     * 授信或预审批资金方业务流水号
     */
    private String aCapitalBusiNo;

    /**
     * 处理结果0000 成功
     * 9999 失败
     * 0010 无该笔申请记录
     * 0020 其它
     * 0030 处理中
     * 0040 影像或合同文件缺失
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 交易状态
     */
    private String status;


    public String getaApplyNo() {
        return aApplyNo;
    }

    public void setaApplyNo(String aApplyNo) {
        this.aApplyNo = aApplyNo;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
