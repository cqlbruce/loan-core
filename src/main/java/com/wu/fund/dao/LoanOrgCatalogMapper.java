package com.wu.fund.dao;

import com.wu.fund.entity.LoanOrgCatalogEntity;
import java.util.List;

public interface LoanOrgCatalogMapper {
    /**
     *
     * @mbggenerated 2018-05-08
     */
    int deleteByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    int insert(LoanOrgCatalogEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    LoanOrgCatalogEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<LoanOrgCatalogEntity> selectAll();
}