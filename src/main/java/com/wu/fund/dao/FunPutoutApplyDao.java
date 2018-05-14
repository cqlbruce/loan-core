package com.wu.fund.dao;

import com.wu.fund.entity.FunPutoutApplyEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FunPutoutApplyDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String lApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(FunPutoutApplyEntity record);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    FunPutoutApplyEntity selectByPrimaryKey(String lApplyNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<FunPutoutApplyEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(FunPutoutApplyEntity record);

    /**
     * 根据放款请求流水号lApplyNo查询 放款申请
     * @param lApplyNo
     * @return
     */
    FunPutoutApplyEntity selectByApplyNo(@Param("lApplyNo") String lApplyNo);
}