package com.wu.fund.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qianmi.ms.starter.rocketmq.core.RocketMQTemplate;
import com.wu.fund.common.req.OldRequestHeader;
import com.wu.fund.common.resp.OldResp;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    public OldResp fundService(@RequestParam("TransMessage") String TransMessage) {
        JSONObject mMessage = JSON.parseObject(TransMessage);
        String sRequestHeader = mMessage.get("requestHeader").toString();
        String sRequestBody = mMessage.get("requestBody").toString();
        OldRequestHeader requestHeader = JSON.parseObject(sRequestHeader, OldRequestHeader.class);
        return OldResp.success("0000", requestHeader);
    }
    @GetMapping("mqtest")
    public OldResp testRocketMq(){
        rocketMQTemplate.convertAndSend("test-topic-1", "Hello, World!");
        rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
//        rocketMQTemplate.convertAndSend("test-topic-2", new OrderPaidEvent("T_001", new BigDecimal("88.00")));
        return OldResp.success("",null);
    }
}
