package com.wu.fund.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.wu.fund.dao.FundOrgLogZxDao;
import com.wu.fund.dto.CreditApplyReqDto;
import com.wu.fund.entity.FundOrgLogZxEntity;
import com.wu.fund.service.CreditApplyService;

/**
 * @Description:征信申请服务
 * @author cql
 * @date:   2018年5月14日 
 */

@Service
public class CreditApplyServiceImpl implements CreditApplyService{
	
    private static final Logger log = LoggerFactory.getLogger(CreditApplyServiceImpl.class);
	
	@Autowired
	private FundOrgLogZxDao fundOrgLogZxDao ; 
	
	@Value("${credit.dates}")
	private String dates ; 
	
	public void apply(CreditApplyReqDto reqDto) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("certId", reqDto.getCertId());
		map.put("applyTime", "");
		log.info("dates============="+dates);
		map.put("certId", "440101198001010252");
		map.put("applyTime", "2018/05/10 15:21:31");		
		List<FundOrgLogZxEntity> list = fundOrgLogZxDao.queryByCertIdAndApplyTime(map);
		log.info("list.size===={}" , list.size());
		log.info("list.size===={}" , JSON.toJSON(list.get(0)));
		
	}
	
	
}
