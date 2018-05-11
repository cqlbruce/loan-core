package com.wu.fund.enums;
/**
 * @Author: wangying
 * @Description:资金单元状态
 * @Date: Created in 17:29 2018/5/11
 */
public enum FundUnitStatus {


    WAITE_EFFECT("00", "待生效"),

    IS_EFFECT("01", "生效"),

    LOSE_EFFECT("02", "失效");


    private final String value;
    private final String message;

    FundUnitStatus(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return value.toString();
    }



}
