package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitLoanChannelEntity;
import java.util.List;

public interface FundUnitLoanChannelDao {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitLoanChannelEntity record);
    int insertSelective(FundUnitLoanChannelEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitLoanChannelEntity> selectAll();
}