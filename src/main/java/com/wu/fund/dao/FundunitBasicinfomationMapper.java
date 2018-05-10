package com.wu.fund.dao;

import com.wu.fund.entity.FundunitBasicinfomationEntity;
import java.util.List;

public interface FundunitBasicinfomationMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundunitBasicinfomationEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundunitBasicinfomationEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundunitBasicinfomationEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(FundunitBasicinfomationEntity record);
}