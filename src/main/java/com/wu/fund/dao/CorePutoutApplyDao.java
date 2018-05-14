package com.wu.fund.dao;

import com.wu.fund.entity.CorePutoutApplyEntity;
import java.util.List;

public interface CorePutoutApplyDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String lApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(CorePutoutApplyEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    CorePutoutApplyEntity selectByPrimaryKey(String lApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<CorePutoutApplyEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(CorePutoutApplyEntity record);
}