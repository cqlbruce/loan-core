package com.wu.fund;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.wu.fund.dao")
@ComponentScan("com.wu.fund")
@EnableFeignClients
//@EnableHystrixDashboard
//@EnableTurbine
//@EnableCircuitBreaker
public class FundApplication  {

    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        //用于调用"提供者"的方法
        return new RestTemplate();
    }

}
