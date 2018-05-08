package com.wu.fund.controller;

import com.wu.fund.dao.FundunitBasicinfomationMapper;
import com.wu.fund.entity.FundunitBasicinfomationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wangying
 * @Description:资金单元配置
 * @Date: Created in 17:29 2018/5/8
 */
@RestController
public class FundController {

    @Autowired
    FundunitBasicinfomationMapper fundunitBasicinfomationMapper;
    @GetMapping("test")
    private List<FundunitBasicinfomationEntity> test(){
      return   fundunitBasicinfomationMapper.selectAll();
    }
}
