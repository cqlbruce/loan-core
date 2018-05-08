package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgBankConstraintEntity;
import java.util.List;


/**
 * @Author: wangying
 * @Description:贷款机构人行约束
 * @Date: Created in 17:29 2018/5/8
 */
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
}