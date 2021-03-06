package com.wu.fund.service;

import com.wu.fund.dto.CreditApplyReqDto;
import com.wu.fund.dto.CreditApplyRespDto;

/**
 * @Description: 征信申请服务
 * @author cql
 * @date:   2018年5月14日 
 */
public interface CreditApplyService {

	/**  
	* @Title: apply  
	* @Description: 征信申请
	* @param reqDto    
	* @return void    返回类型  
	* @throws  
	*/  
	CreditApplyRespDto apply(CreditApplyReqDto reqDto) ;
	
	

}
