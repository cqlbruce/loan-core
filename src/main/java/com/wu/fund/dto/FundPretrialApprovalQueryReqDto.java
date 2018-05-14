package com.wu.fund.dto;

/**
 * @Author: wangying
 * @Description:查询授信或预审批结果
 * @Date: Created in  2018/5/14
 */
public class FundPretrialApprovalQueryReqDto {

    /**
     *  授信或预审批请求流水号
     */
    private String applyNo ;



    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }
}
