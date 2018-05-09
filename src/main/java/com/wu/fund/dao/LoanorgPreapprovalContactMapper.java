package com.wu.fund.dao;

import com.wu.fund.entity.LoanorgPreapprovalContactEntity;
import java.util.List;

public interface LoanorgPreapprovalContactMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(LoanorgPreapprovalContactEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    LoanorgPreapprovalContactEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<LoanorgPreapprovalContactEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(LoanorgPreapprovalContactEntity record);
}