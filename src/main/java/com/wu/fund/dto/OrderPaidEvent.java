package com.wu.fund.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class OrderPaidEvent implements Serializable {
    private String orderId;

    private BigDecimal paidMoney;

    public OrderPaidEvent(String orderId, BigDecimal paidMoney) {
        this.orderId = orderId;
        this.paidMoney = paidMoney;
    }
}