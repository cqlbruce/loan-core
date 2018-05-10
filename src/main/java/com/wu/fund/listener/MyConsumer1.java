package com.wu.fund.listener;

import com.qianmi.ms.starter.rocketmq.annotation.RocketMQMessageListener;
import com.qianmi.ms.starter.rocketmq.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-consumer_test-topic-1")
public class MyConsumer1 implements RocketMQListener<String> {
    private final static Logger log=LoggerFactory.getLogger(MyConsumer1.class);
    public void onMessage(String message) {
        System.out.println(message);
        log.info("received message: {}", message);
    }
}