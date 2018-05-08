package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitCustomerConstraintEntity;
import java.util.List;

/**
 * @Author: wangying
 * @Description:资金单元放款约束
 * @Date: Created in 17:29 2018/5/8
 */
public interface FundUnitCustomerConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitCustomerConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitCustomerConstraintEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitCustomerConstraintEntity> selectAll();
}