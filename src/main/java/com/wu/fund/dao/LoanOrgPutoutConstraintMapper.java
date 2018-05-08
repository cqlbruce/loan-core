package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgPutoutConstraintEntity;
import java.util.List;

public interface LoanOrgPutoutConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgPutoutConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgPutoutConstraintEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgPutoutConstraintEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(LoanOrgPutoutConstraintEntity record);
}