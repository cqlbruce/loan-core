package com.wu.fund.dao;

import com.wu.fund.entity.AssetAllocationListEntity;
import java.util.List;

public interface AssetAllocationListDao {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(AssetAllocationListEntity record);
    int insertSelective(AssetAllocationListEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    AssetAllocationListEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<AssetAllocationListEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(AssetAllocationListEntity record);
    int updateByPrimaryKeySelective(AssetAllocationListEntity record);
}