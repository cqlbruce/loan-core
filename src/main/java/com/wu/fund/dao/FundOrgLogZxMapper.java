package com.wu.fund.dao;

import com.wu.fund.entity.FundOrgLogZxEntity;
import java.util.List;

public interface FundOrgLogZxMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundOrgLogZxEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundOrgLogZxEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundOrgLogZxEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(FundOrgLogZxEntity record);
}