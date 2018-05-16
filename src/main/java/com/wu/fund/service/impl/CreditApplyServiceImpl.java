package com.wu.fund.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.wu.fund.dao.FundOrgLogZxDao;
import com.wu.fund.dto.CreditApplyReqDto;
import com.wu.fund.dto.CreditApplyRespDto;
import com.wu.fund.entity.FundOrgLogZxEntity;
import com.wu.fund.enums.RespStatus;
import com.wu.fund.service.CreditApplyAsyncService;
import com.wu.fund.service.CreditApplyService;
import com.wu.fund.util.DateUtil;

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
	
	@Autowired
	private CreditApplyAsyncService creditApplyAsyncService ; 
	
	public CreditApplyRespDto apply(CreditApplyReqDto reqDto) {
		
		
		//先查询本地库，存在15天内的成功记录，则直接返回
		Map<String,String> map = new HashMap<String,String>();
		map.put("certId", reqDto.getCertId());
		String time = DateUtil.addDays(new Date(), -Integer.parseInt(dates), DateUtil.FULL_DATETIME_FORMAT);
		map.put("applyTime", time);
		map.put("dealStatus", RespStatus.SUCCESS.getCode());
		List<FundOrgLogZxEntity> list = fundOrgLogZxDao.queryByCertIdAndApplyTime(map);
		CreditApplyRespDto respDto = new CreditApplyRespDto();
		if(CollectionUtils.isNotEmpty(list)) {
			FundOrgLogZxEntity entity = list.get(0);
			respDto.setApplyNo(entity.getCApplyNo());
			return respDto ; 
		}
		 
		//数据落地
		FundOrgLogZxEntity entity = setValue(reqDto);
		fundOrgLogZxDao.insert(entity);
//		log.info("main thread name is {}" , Thread.currentThread().getName());
//		creditApply(reqDto);
		creditApplyAsyncService.async(reqDto);
		respDto.setApplyNo(reqDto.getApplyNo());
		return respDto ;
	}
	
	
	public FundOrgLogZxEntity setValue(CreditApplyReqDto reqDto) {
		FundOrgLogZxEntity entity = new FundOrgLogZxEntity();
		entity.setCApplyNo(reqDto.getApplyNo());
		entity.setcBusiNo("");//TODO 业务流水号
		entity.setStatus("1");// TODO 待发送
		entity.setCertId(reqDto.getCertId());
		entity.setDealStatus(RespStatus.DOING.getCode());
		entity.setCertType(reqDto.getCertType());
		entity.setCustomerName(reqDto.getCustName());
		entity.setIdcardPicture(reqDto.getCreditPicPositive());//TODO 搞清楚安硕方正反面
		entity.setIdcardKey(reqDto.getCreditPicReverse());//TODO 搞清楚安硕方正反面
		entity.setPbAttorneyLetterPicture(reqDto.getAttorneyPicReverse());
		entity.setPbAttorneyLetterkey(reqDto.getAttorneyPicPositive());
		entity.setSerialNo("asdfasdfasdfa");//生成唯一流水号
//		newBo.setAttributeValue("SERIALNO", DBKeyHelp.getSerialNo("FUND_ORG_LOG_ZX", "SerialNo", ""));
		return entity ; 
	}
	
	
	
	
	
}
