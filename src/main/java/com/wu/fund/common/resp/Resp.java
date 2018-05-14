package com.wu.fund.common.resp;

import com.wu.fund.util.DateUtil;

import java.io.Serializable;

/**
 * @Author: wangying
 * @Description:新接口返回
 * @Date: Created in  2018/5/14
 */
public class Resp <T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public final static String SUCCESS_CODE = "0000";
    public final static String FAIL_CODE = "0000";
    /**
     * 返回状态码
     */
    private RespHeader respHeader;



    /**
     * 返回内容
     */
    private T respBody;

    public Resp(String code, String msg, T responseBody) {
        RespHeader  responseHeader =new RespHeader();

        responseHeader.setRespCode(code);
        responseHeader.setRespMsg(msg);
        this.respHeader = responseHeader;
        this.respBody = responseBody;
    }

    public RespHeader getRespHeader() {
        return respHeader;
    }

    public void setRespHeader(RespHeader respHeader) {
        this.respHeader = respHeader;
    }

    public T getRespBody() {
        return respBody;
    }

    public void setRespBody(T respBody) {
        this.respBody = respBody;
    }

    public static <T>Resp success(String msg, T responseBody){

        return new Resp<T>(SUCCESS_CODE,msg,responseBody);
    }

    //快速返回失败状态
    public static <T>Resp fail(String msg){
        return new Resp<T>(FAIL_CODE,msg,null);
    }
    //快速返回失败状态
    public static <T>Resp fail(String code,String msg){
        return new Resp<T>(code,msg,null);
    }
}