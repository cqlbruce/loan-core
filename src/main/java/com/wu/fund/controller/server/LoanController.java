package com.wu.fund.controller.server;

import com.wu.fund.common.req.Req;
import com.wu.fund.common.resp.Resp;
import com.wu.fund.dto.FundPretrialApprovalQueryReqDto;
import com.wu.fund.dto.FundPretrialApprovalQueryRespDto;
import com.wu.fund.dto.LoadApplyQueryReqDto;
import com.wu.fund.dto.LoadApplyQueryRespDto;
import com.wu.fund.service.LoanService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangying
 * @Description:放款API
 * @Date: Created in  2018/5/14
 */
@RestController
@RefreshScope
@RequestMapping("loan")
@Api(description = "放款API")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("qurey")
    @ApiOperation(value = "放款查询", notes = "")
    public Resp<LoadApplyQueryRespDto> queryLoanApplyResult(@RequestBody Req<LoadApplyQueryReqDto> req) {

        LoadApplyQueryRespDto respDto = loanService.queryLoanApplyResult(req.getApplyNo());
        return Resp.success("放款查询成功", respDto);

    }
}
