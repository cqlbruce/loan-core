package com.wu.fund.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.wu.fund.dto.CreditApplyReqDto;
import com.wu.fund.service.CreditApplyAsyncService;

@Service
public class CreditApplyAsyncServiceImpl implements CreditApplyAsyncService{

	@Override
	@Async("asyncServiceExecutor")
	public void async(CreditApplyReqDto reqDto) {
		
		//调用规则引擎
		
		
		//检查可用次数 
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
