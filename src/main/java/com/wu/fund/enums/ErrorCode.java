package com.wu.fund.enums;

/**
 * @Author: wangying
 * @Description:
 * @Date: Created in  2018/5/15
 */
public enum ErrorCode {

    SYSTEM_ERROR(500, "系统错误", "系统错误");

    private final Integer value;
    private final String message;
    private final String details;

    ErrorCode(int value, String message, String details) {
        this.value = value;
        this.message = message;
        this.details = details;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public String getCode() {
        return value.toString();
    }

    public static ErrorCode getByCode(Integer value) {
        for (ErrorCode _enum : values()) {
            if (_enum.getValue() == value) {
                return _enum;
            }
        }
        return null;
    }
}
