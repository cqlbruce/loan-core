package com.wu.fund.dao;

import com.wu.fund.entity.LoanorgPreapprovalContactEntity;
import java.util.List;

public interface LoanorgPreapprovalContactDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(LoanorgPreapprovalContactEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    LoanorgPreapprovalContactEntity selectByPrimaryKey(String serialNo);

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