package com.wu.fund.service;

import com.wu.fund.dto.LoadApplyQueryRespDto;
import com.wu.fund.dto.LoadApplyReqDto;

/**
 * @Author: wangying
 * @Description:放款服务
 * @Date: Created in  2018/5/14
 */
public interface LoanService {
    /**
     *T30 申请放款
     * @param loadApplyReqDto
     */
    void createLoanApply(LoadApplyReqDto loadApplyReqDto);

    /**
     * T31.查询放款申请结果
     * @param lApplyNo
     * @return
     */
     LoadApplyQueryRespDto queryLoanApplyResult(String lApplyNo);
}
