package com.wu.fund.credit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wu.fund.dto.CreditApplyReqDto;
import com.wu.fund.service.CreditApplyService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditApplyTest {

	@Autowired
	private CreditApplyService creditApplyService ; 
	
	@Test
	public void test() {
		
		CreditApplyReqDto dto = new CreditApplyReqDto();
		dto.setApplyNo("asdfasdf");
		dto.setAttorneyPicPositive("asdf");
		dto.setBusiNo("asdfasdf");
		dto.setCertId("123123");
		creditApplyService.apply(dto);
		
		
	}

}
