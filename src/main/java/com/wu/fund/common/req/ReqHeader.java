package com.wu.fund.common.req;

/**
 * @Author: wangying
 * @Description:接受的请求头
 * @Date: Created in  2018/5/14
 */
public class ReqHeader {
    /**
     * 通道
     */
    private String channelNo;

    /**
     * 授信或预审批请求流水号
     */
    private String applyNo;

    /**
     * 业务流水号
     */
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
