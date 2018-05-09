package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgFunctionConstraintEntity;
import java.util.List;

public interface LoanOrgFunctionConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(LoanOrgFunctionConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    LoanOrgFunctionConstraintEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<LoanOrgFunctionConstraintEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(LoanOrgFunctionConstraintEntity record);
}