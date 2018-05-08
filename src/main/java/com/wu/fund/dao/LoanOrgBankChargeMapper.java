package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgBankChargeEntity;
import java.util.List;

/**
 * @Author: wangying
 * @Description:人行收费标准记录
 * @Date: Created in 17:29 2018/5/8
 */
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
}