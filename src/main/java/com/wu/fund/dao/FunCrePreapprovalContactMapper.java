package com.wu.fund.dao;

import com.wu.fund.entity.FunCrePreapprovalContactEntity;
import java.util.List;

public interface FunCrePreapprovalContactMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunCrePreapprovalContactEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FunCrePreapprovalContactEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunCrePreapprovalContactEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FunCrePreapprovalContactEntity record);
}