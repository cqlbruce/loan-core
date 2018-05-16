package com.wu.fund.service;

import com.wu.fund.dto.CreditApplyReqDto;

public interface CreditApplyAsyncService {
	
	void async(CreditApplyReqDto reqDto);

}
