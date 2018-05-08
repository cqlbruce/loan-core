package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitLoanOrgEntity;
import java.util.List;


/**
 * @Author: wangying
 * @Description:贷款机构清单
 * @Date: Created in 17:29 2018/5/8
 */
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
}