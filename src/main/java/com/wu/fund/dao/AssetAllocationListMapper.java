package com.wu.fund.dao;

import com.wu.fund.entity.AssetAllocationListEntity;
import java.util.List;

/**
 * @Author: wangying
 * @Description:资产配置清单
 * @Date: Created in 17:29 2018/5/8
 */
public interface AssetAllocationListMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(AssetAllocationListEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    AssetAllocationListEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<AssetAllocationListEntity> selectAll();
}