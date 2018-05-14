package com.wu.fund.common.resp;

import java.io.Serializable;

/**
 * @Author: wangying
 * @Description:响应头对象封装
 * @Date: Created in  2018/5/14
 */
public class RespHeader implements Serializable {

    private String respCode;


    private String respMsg;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
}
