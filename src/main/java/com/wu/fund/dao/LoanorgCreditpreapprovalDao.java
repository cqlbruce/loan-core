package com.wu.fund.dao;

import com.wu.fund.entity.LoanorgCreditpreapprovalEntity;
import java.util.List;

public interface LoanorgCreditpreapprovalDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(LoanorgCreditpreapprovalEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    LoanorgCreditpreapprovalEntity selectByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<LoanorgCreditpreapprovalEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(LoanorgCreditpreapprovalEntity record);
}