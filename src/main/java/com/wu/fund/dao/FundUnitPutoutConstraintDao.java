package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitPutoutConstraintEntity;
import java.util.List;

public interface FundUnitPutoutConstraintDao {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitPutoutConstraintEntity record);
    int insertSelective(FundUnitPutoutConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitPutoutConstraintEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitPutoutConstraintEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(FundUnitPutoutConstraintEntity record);
    int updateByPrimaryKeySelective(FundUnitPutoutConstraintEntity record);
}