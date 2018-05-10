package com.wu.fund;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.wu.fund.dao")
@ComponentScan("com.wu.fund")
public class FundApplication  {

    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class, args);
    }
}
