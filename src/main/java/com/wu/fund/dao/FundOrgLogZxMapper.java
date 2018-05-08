package com.wu.fund.dao;

import com.wu.fund.entity.FundOrgLogZxEntity;
import java.util.List;


/**
 * @Author: wangying
 * @Description:资金平台-人行征信查询结果
 * @Date: Created in 17:29 2018/5/8
 */
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
}