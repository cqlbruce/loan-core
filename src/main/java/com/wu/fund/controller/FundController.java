package com.wu.fund.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qianmi.ms.starter.rocketmq.core.RocketMQTemplate;
import com.wu.fund.common.RequestHeader;
import com.wu.fund.common.Resp;
import com.wu.fund.dao.FundunitBasicinfomationMapper;
import com.wu.fund.dto.OrderPaidEvent;
import com.wu.fund.entity.FundunitBasicinfomationEntity;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangying
 * @Description:资金单元配置
 * @Date: Created in 17:29 2018/5/8
 */
@RestController
public class FundController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("FundSerivce")
    public Resp fundService(@RequestParam("TransMessage") String TransMessage) {
        JSONObject mMessage = JSON.parseObject(TransMessage);
        String sRequestHeader = mMessage.get("requestHeader").toString();
        String sRequestBody = mMessage.get("requestBody").toString();
        RequestHeader requestHeader = JSON.parseObject(sRequestHeader, RequestHeader.class);
        return Resp.success("0000", requestHeader);
    }
    @GetMapping("mqtest")
    public Resp testRocketMq(){
        rocketMQTemplate.convertAndSend("test-topic-1", "Hello, World!");
        rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
//        rocketMQTemplate.convertAndSend("test-topic-2", new OrderPaidEvent("T_001", new BigDecimal("88.00")));
        return Resp.success("",null);
    }
}
