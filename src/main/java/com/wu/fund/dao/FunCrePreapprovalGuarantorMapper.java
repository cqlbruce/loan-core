package com.wu.fund.dao;

import com.wu.fund.entity.FunCrePreapprovalGuarantorEntity;
import java.util.List;

public interface FunCrePreapprovalGuarantorMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunCrePreapprovalGuarantorEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FunCrePreapprovalGuarantorEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunCrePreapprovalGuarantorEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FunCrePreapprovalGuarantorEntity record);
}