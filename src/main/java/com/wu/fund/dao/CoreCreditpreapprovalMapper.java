package com.wu.fund.dao;

import com.wu.fund.entity.CoreCreditpreapprovalEntity;
import java.util.List;

public interface CoreCreditpreapprovalMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(CoreCreditpreapprovalEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    CoreCreditpreapprovalEntity selectByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<CoreCreditpreapprovalEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(CoreCreditpreapprovalEntity record);
}