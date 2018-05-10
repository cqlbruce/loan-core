package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitContributionOrgEntity;
import java.util.List;

public interface FundUnitContributionOrgMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitContributionOrgEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitContributionOrgEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitContributionOrgEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(FundUnitContributionOrgEntity record);
}