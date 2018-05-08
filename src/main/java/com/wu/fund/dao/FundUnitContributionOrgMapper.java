package com.wu.fund.dao;

import com.wu.fund.entity.FundUnitContributionOrgEntity;
import java.util.List;
/**
 * @Author: wangying
 * @Description:出资机构清单
 * @Date: Created in 17:29 2018/5/8
 */
public interface FundUnitContributionOrgMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundUnitContributionOrgEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundUnitContributionOrgEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundUnitContributionOrgEntity> selectAll();
}