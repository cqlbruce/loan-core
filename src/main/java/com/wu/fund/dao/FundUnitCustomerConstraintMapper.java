package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitCustomerConstraintEntity;
import java.util.List;

public interface FundUnitCustomerConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitCustomerConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitCustomerConstraintEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitCustomerConstraintEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(FundUnitCustomerConstraintEntity record);
}