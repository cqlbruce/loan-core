package com.wu.fund.dao;

import java.util.List;
import java.util.Map;

import com.wu.fund.entity.FundOrgLogZxEntity;

public interface FundOrgLogZxDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FundOrgLogZxEntity record);
    int insertSelective(FundOrgLogZxEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FundOrgLogZxEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FundOrgLogZxEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FundOrgLogZxEntity record);
    int updateByPrimaryKeySelective(FundOrgLogZxEntity record);
    
    
    List<FundOrgLogZxEntity> queryByCertIdAndApplyTime(Map<String, String> map);
    
}