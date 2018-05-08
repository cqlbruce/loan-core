package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitPutoutConstraintEntity;
import java.util.List;


/**
 * @Author: wangying
 * @Description:资金单元当客限额约束
 * @Date: Created in 17:29 2018/5/8
 */
public interface FundUnitPutoutConstraintMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitPutoutConstraintEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitPutoutConstraintEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitPutoutConstraintEntity> selectAll();
}