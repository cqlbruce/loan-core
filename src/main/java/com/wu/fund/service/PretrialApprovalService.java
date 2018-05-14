package com.wu.fund.service;

import com.wu.fund.dto.FundPreapprovalCreditReqDto;
import com.wu.fund.dto.FundPretrialApprovalQueryRespDto;

/**
 * @Author: wangying
 * @Description:申请授信或预审批
 * @Date: Created in  2018/5/11
 */
public interface PretrialApprovalService {
    /**
     *T20.申请授信或预审批
     * @param creditDto
     */
    void  pretrialApproval(FundPreapprovalCreditReqDto creditDto);

    /**
     *
     * @param aApplyNo
     */
    FundPretrialApprovalQueryRespDto queryPretrialApprovalResult(String aApplyNo);
}
