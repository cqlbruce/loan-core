package com.wu.fund.common;




import com.wu.fund.util.DateUtil;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author: wangying
 * @Description: Json统一响应对象封装，必须实现序列化
 * @Date: Created in 9:39 2018/5/10
 */
public class Resp<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public final static String SUCCESS_CODE = "0000";
    public final static String FAIL_CODE = "0000";
    /**
     * 返回状态码
     */
    private ResponseHeader responseHeader;



    /**
     * 返回内容
     */
    private T responseBody;

    public Resp(String code,String msg, T responseBody) {
        ResponseHeader responseHeader =new ResponseHeader();
        responseHeader.setClr_date(DateUtil.getToday("yyyyMMdd"));
        responseHeader.setRes_time( DateUtil.getToday("yyyy-MM-dd") + " " + DateUtil.getNowTime("HH:mm:ss"));
        responseHeader.setRes_code(code);
        responseHeader.setRes_message(msg);
        this.responseHeader = responseHeader;
        this.responseBody = responseBody;
    }

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(T responseBody) {
        this.responseBody = responseBody;
    }

    public static <T>Resp success(String msg, T responseBody){

        return new Resp<T>(SUCCESS_CODE,msg,responseBody);
    }

    //快速返回失败状态
    public static <T>Resp fail(String msg){
        return new Resp<T>(FAIL_CODE,msg,null);
    }
}
