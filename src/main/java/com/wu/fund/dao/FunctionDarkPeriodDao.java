package com.wu.fund.dao;

import com.wu.fund.entity.FunctionDarkPeriodEntity;
import java.util.List;

public interface FunctionDarkPeriodDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunctionDarkPeriodEntity record);
    int insertSelective(FunctionDarkPeriodEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunctionDarkPeriodEntity> selectAll();
}