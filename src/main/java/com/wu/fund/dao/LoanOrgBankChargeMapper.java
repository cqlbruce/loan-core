package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgBankChargeEntity;
import java.util.List;

public interface LoanOrgBankChargeMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgBankChargeEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgBankChargeEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgBankChargeEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(LoanOrgBankChargeEntity record);
}