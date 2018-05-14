package com.wu.fund.common.req;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: wangying
 * @Description:接受的请求头
 * @Date: Created in  2018/5/14
 */
public class ReqHeader {
    /**
     * 通道
     */
    @ApiModelProperty(value = "通道")
    private String channelNo;

    /**
     * 请求流水号
     */
    @ApiModelProperty(value = "请求流水号", required = true)
    private String applyNo;

    /**
     * 业务流水号
     */
    @ApiModelProperty(value = "业务流水号")
    private String busiNo;


    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo;
    }
}
