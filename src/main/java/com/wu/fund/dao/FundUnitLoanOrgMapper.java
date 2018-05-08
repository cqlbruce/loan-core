package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitLoanOrgEntity;
import java.util.List;

public interface FundUnitLoanOrgMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitLoanOrgEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitLoanOrgEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitLoanOrgEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(FundUnitLoanOrgEntity record);
}