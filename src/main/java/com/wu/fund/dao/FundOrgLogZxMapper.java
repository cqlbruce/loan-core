package com.wu.fund.dao;

import com.wu.fund.entity.FundOrgLogZxEntity;

import java.util.List;

public interface FundOrgLogZxMapper {
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
}