package com.wu.fund.common;

import java.io.Serializable;



/**
 * @Author: wangying
 * @Description: Json统一响应头对象封装，必须实现序列化
 * @Date: Created in 9:39 2018/5/10
 */
public class ResponseHeader implements Serializable {
    /**
     *响应日期
     */
    private String clr_date;
    /**
     * 响应码
     */

    private String res_code;
    /**
     * 响应消息
     */
    private String res_message;
    /**
     * 响应时间
     */
    private String res_time;


    public String getClr_date() {
        return clr_date;
    }

    public void setClr_date(String clr_date) {
        this.clr_date = clr_date;
    }

    public String getRes_code() {
        return res_code;
    }

    public void setRes_code(String res_code) {
        this.res_code = res_code;
    }

    public String getRes_message() {
        return res_message;
    }

    public void setRes_message(String res_message) {
        this.res_message = res_message;
    }

    public String getRes_time() {
        return res_time;
    }

    public void setRes_time(String res_time) {
        this.res_time = res_time;
    }
}
