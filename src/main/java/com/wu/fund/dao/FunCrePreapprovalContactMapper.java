package com.wu.fund.dao;

import com.wu.fund.entity.FunCrePreapprovalContactEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FunCrePreapprovalContactMapper {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunCrePreapprovalContactEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FunCrePreapprovalContactEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunCrePreapprovalContactEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FunCrePreapprovalContactEntity record);

    /**
     * -根据授信或预审批请求流水号查询联系人
     * @param aApplyNo
     * @return
     */

    List<FunCrePreapprovalContactEntity> selectContactByApplyNo(@Param("aApplyNo")String aApplyNo);
}