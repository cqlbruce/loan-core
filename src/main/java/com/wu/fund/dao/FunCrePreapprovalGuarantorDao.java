package com.wu.fund.dao;

import com.wu.fund.entity.FunCrePreapprovalContactEntity;
import com.wu.fund.entity.FunCrePreapprovalGuarantorEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FunCrePreapprovalGuarantorDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunCrePreapprovalGuarantorEntity record);
    int insertSelective(FunCrePreapprovalGuarantorEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FunCrePreapprovalGuarantorEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunCrePreapprovalGuarantorEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FunCrePreapprovalGuarantorEntity record);
    int updateByPrimaryKeySelective(FunCrePreapprovalGuarantorEntity record);
    /**
     * -根据授信或预审批请求流水号查询担保人
     * @param aApplyNo
     * @return
     */

    List<FunCrePreapprovalGuarantorEntity> selectGuarantorByApplyNo(@Param("aApplyNo")String aApplyNo);
}