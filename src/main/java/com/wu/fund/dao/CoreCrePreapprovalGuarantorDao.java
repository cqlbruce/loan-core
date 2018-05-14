package com.wu.fund.dao;

import com.wu.fund.entity.CoreCrePreapprovalGuarantorEntity;
import java.util.List;

public interface CoreCrePreapprovalGuarantorDao {
    /**
     *
     * @mbggenerated 2018-05-09
     */
    int deleteByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int insert(CoreCrePreapprovalGuarantorEntity record);
    int insertSelective(CoreCrePreapprovalGuarantorEntity record);
    /**
     *
     * @mbggenerated 2018-05-09
     */
    CoreCrePreapprovalGuarantorEntity selectByPrimaryKey(String serialNo);

    /**
     *
     * @mbggenerated 2018-05-09
     */
    List<CoreCrePreapprovalGuarantorEntity> selectAll();

    /**
     *
     * @mbggenerated 2018-05-09
     */
    int updateByPrimaryKey(CoreCrePreapprovalGuarantorEntity record);
    int updateByPrimaryKeySelective(CoreCrePreapprovalGuarantorEntity record);
}