package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgCatalogEntity;
import java.util.List;

public interface LoanOrgCatalogDao {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgCatalogEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgCatalogEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgCatalogEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int updateByPrimaryKey(LoanOrgCatalogEntity record);
}