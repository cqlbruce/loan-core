package com.wu.fund.dao;

import com.wu.fund.entity.FundPreapprovalCreditEntity;
import java.util.List;

public interface FundPreapprovalCreditMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FundPreapprovalCreditEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FundPreapprovalCreditEntity selectByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FundPreapprovalCreditEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FundPreapprovalCreditEntity record);
}