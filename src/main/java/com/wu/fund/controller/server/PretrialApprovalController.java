package com.wu.fund.controller.server;

import com.wu.fund.common.req.Req;
import com.wu.fund.common.resp.Resp;
import com.wu.fund.dto.FundPretrialApprovalQueryReqDto;
import com.wu.fund.dto.FundPretrialApprovalQueryRespDto;
import com.wu.fund.service.PretrialApprovalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: wangying
 * @Description:申请授信或预审批
 * @Date: Created in  2018/5/14
 */
@RestController
@RefreshScope
@RequestMapping("pretrial")
@Api(description = "授信或预审批API")
public class PretrialApprovalController {
    @Autowired
    private PretrialApprovalService pretrialApprovalService;

    @PostMapping("qurey")
    @ApiOperation(value = "申请授信或预审批查询", notes = "")
  //  @ApiImplicitParam(name = "req", value = "申请授信或预审批查询请求参数", required = true, dataType = "Req", paramType = "body")
    public Resp<FundPretrialApprovalQueryRespDto> queryPretrialApprovalResult(@RequestBody Req<FundPretrialApprovalQueryReqDto> req) {

        FundPretrialApprovalQueryRespDto respDto = pretrialApprovalService.queryPretrialApprovalResult(req.getApplyNo());
        return Resp.success("申请授信或预审批查询成功", respDto);

    }
}
