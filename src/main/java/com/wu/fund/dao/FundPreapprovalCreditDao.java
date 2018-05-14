package com.wu.fund.dao;

import com.wu.fund.entity.FundPreapprovalCreditEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: wangying
 * @Description:申请授信或预审批
 * @Date: Created in  2018/5/9
 */
@Component
public interface FundPreapprovalCreditDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FundPreapprovalCreditEntity record);
    int insertSelective(FundPreapprovalCreditEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FundPreapprovalCreditEntity selectByPrimaryKey(String aApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FundPreapprovalCreditEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FundPreapprovalCreditEntity record);
    int updateByPrimaryKeySelective(FundPreapprovalCreditEntity record);

    /**
     * 根据aBusiNo查询申请授信或预审批
     * @param aBusiNo
     * @param status
     * @return
     */
    FundPreapprovalCreditEntity selectByBusiNo(@Param("aBusiNo")String aBusiNo,@Param("status") String status);

    /**
     * 根据请求流水号aApplyNo查询申请授信或预审批
     * @param aApplyNo
     * @return
     */
    FundPreapprovalCreditEntity  selectByApplyNo(@Param("aApplyNo")String aApplyNo);
}