package com.wu.fund.dao;

import com.wu.fund.entity.CoreCrePreapprovalContactEntity;
import java.util.List;

public interface CoreCrePreapprovalContactDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(CoreCrePreapprovalContactEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    CoreCrePreapprovalContactEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<CoreCrePreapprovalContactEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(CoreCrePreapprovalContactEntity record);
}