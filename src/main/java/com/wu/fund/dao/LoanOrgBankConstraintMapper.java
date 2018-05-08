package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgBankConstraintEntity;
import java.util.List;

public interface LoanOrgBankConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgBankConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgBankConstraintEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgBankConstraintEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(LoanOrgBankConstraintEntity record);
}