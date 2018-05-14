package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgBankConstraintEntity;
import java.util.List;

public interface LoanOrgBankConstraintDao {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgBankConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgBankConstraintEntity selectByPrimaryKey(String serialNo);

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