package com.wu.fund.dao;

import com.wu.fund.entity.FundunitBasicinfomation;
import java.util.List;

public interface FundunitBasicinfomationMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(FundunitBasicinfomation record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundunitBasicinfomation selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundunitBasicinfomation> selectAll();
}