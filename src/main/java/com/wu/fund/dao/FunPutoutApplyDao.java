package com.wu.fund.dao;

import com.wu.fund.entity.FunPutoutApplyEntity;
import java.util.List;

public interface FunPutoutApplyDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String lApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunPutoutApplyEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FunPutoutApplyEntity selectByPrimaryKey(String lApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunPutoutApplyEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FunPutoutApplyEntity record);
}