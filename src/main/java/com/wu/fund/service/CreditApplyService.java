package com.wu.fund.service;

import com.wu.fund.dto.FundPreapprovalCreditReqDto;

/**
 * @Author: wangying
 * @Description:申请授信或预审批
 * @Date: Created in  2018/5/11
 */
public interface CreditApplyService {
    /**
     *T20.申请授信或预审批
     * @param creditDto
     */
    void  creditApply(FundPreapprovalCreditReqDto creditDto);
}
