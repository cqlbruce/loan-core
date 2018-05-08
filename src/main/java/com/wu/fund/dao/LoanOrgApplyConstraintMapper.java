package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgApplyConstraintEntity;
import java.util.List;


/**
 * @Author: wangying
 * @Description:授信约束
 * @Date: Created in 17:29 2018/5/8
 */
public interface LoanOrgApplyConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgApplyConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgApplyConstraintEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgApplyConstraintEntity> selectAll();
}