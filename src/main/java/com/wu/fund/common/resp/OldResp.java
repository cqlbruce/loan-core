package com.wu.fund.common.resp;




import com.wu.fund.util.DateUtil;

import java.io.Serializable;

/**
 * @Author: wangying
 * @Description: Json统一响应对象封装，必须实现序列化
 * @Date: Created in 9:39 2018/5/10
 */
public class OldResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public final static String SUCCESS_CODE = "0000";
    public final static String FAIL_CODE = "0000";
    /**
     * 返回状态码
     */
    private OldResponseHeader responseHeader;



    /**
     * 返回内容
     */
    private T responseBody;

    public OldResp(String code, String msg, T responseBody) {
        OldResponseHeader responseHeader =new OldResponseHeader();
        responseHeader.setClr_date(DateUtil.getToday("yyyyMMdd"));
        responseHeader.setRes_time( DateUtil.getToday("yyyy-MM-dd") + " " + DateUtil.getNowTime("HH:mm:ss"));
        responseHeader.setRes_code(code);
        responseHeader.setRes_message(msg);
        this.responseHeader = responseHeader;
        this.responseBody = responseBody;
    }

    public OldResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(OldResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(T responseBody) {
        this.responseBody = responseBody;
    }

    public static <T>OldResp success(String msg, T responseBody){

        return new OldResp<T>(SUCCESS_CODE,msg,responseBody);
    }

    //快速返回失败状态
    public static <T>OldResp fail(String msg){
        return new OldResp<T>(FAIL_CODE,msg,null);
    }
}
