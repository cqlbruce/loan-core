package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgApplyConstraintEntity;
import java.util.List;

public interface LoanOrgApplyConstraintDao {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgApplyConstraintEntity record);
    int insertSelective(LoanOrgApplyConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgApplyConstraintEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgApplyConstraintEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(LoanOrgApplyConstraintEntity record);
    int updateByPrimaryKeySelective(LoanOrgApplyConstraintEntity record);
}