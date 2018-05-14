package com.wu.fund.dao;

import com.wu.fund.entity.LoanorgPreapprovalGuarantorEntity;
import java.util.List;

public interface LoanorgPreapprovalGuarantorDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(LoanorgPreapprovalGuarantorEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    LoanorgPreapprovalGuarantorEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<LoanorgPreapprovalGuarantorEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(LoanorgPreapprovalGuarantorEntity record);
}