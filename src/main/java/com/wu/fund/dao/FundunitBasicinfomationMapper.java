package com.wu.fund.dao;

import com.wu.fund.entity.FundunitBasicinfomationEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangying
 * @Description:资金单元配置
 * @Date: Created in 17:29 2018/5/8
 */
@Mapper
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
    int insert(FundunitBasicinfomationEntity record);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    FundunitBasicinfomationEntity selectByPrimaryKey(String serialno);

    /**
     *
     * @mbggenerated 2018-05-08
     */
    List<FundunitBasicinfomationEntity> selectAll();
}