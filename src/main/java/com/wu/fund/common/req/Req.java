package com.wu.fund.common.req;

import java.io.Serializable;

/**
 * @Author: wangying
 * @Description:接受的请求
 * @Date: Created in  2018/5/14
 */
public class Req<T> implements Serializable {

    /**
     * 请求头
     */
    private ReqHeader reqHeader;

    /**
     * 请求内容
     */
    private T reqBody;


    public ReqHeader getReqHeader() {
        return reqHeader;
    }

    public void setReqHeader(ReqHeader reqHeader) {
        this.reqHeader = reqHeader;
    }

    public T getReqBody() {
        return reqBody;
    }

    public void setReqBody(T reqBody) {
        this.reqBody = reqBody;
    }

    public  String getApplyNo(){

        return reqHeader.getApplyNo();
    }

    public  String getBusiNo(){

        return reqHeader.getBusiNo();
    }
}
