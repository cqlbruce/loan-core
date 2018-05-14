package com.wu.fund.service.impl;

import com.wu.fund.dao.FunPutoutApplyDao;
import com.wu.fund.dao.FundPreapprovalCreditDao;
import com.wu.fund.dto.LoadApplyQueryRespDto;
import com.wu.fund.dto.LoadApplyReqDto;
import com.wu.fund.entity.FunPutoutApplyEntity;
import com.wu.fund.entity.FundPreapprovalCreditEntity;
import com.wu.fund.service.LoanService;
import com.wu.fund.util.BeanCopierUtils;
import com.wu.fund.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wangying
 * @Description:放款服务
 * @Date: Created in  2018/5/14
 */
@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private FunPutoutApplyDao putoutApplyDao;

    @Autowired
    private FundPreapprovalCreditDao preapprovalCreditDao;
    /**
     * 申请放款
     * @param loadApplyReqDto
     */
    @Override
    @Transactional
    public void createLoanApply(LoadApplyReqDto loadApplyReqDto) {

        //申请放款落地
        FunPutoutApplyEntity putoutApplyEntity=putoutApplyDao.selectByApplyNo(loadApplyReqDto.getlApplyNo());
        if (putoutApplyEntity!=null){
            return;
        }
        putoutApplyEntity=BeanCopierUtils.copy(loadApplyReqDto,FunPutoutApplyEntity.class);
        putoutApplyEntity.setDealTime(DateUtil.getToday("yyyyMMddHHmmssSSS"));
        putoutApplyDao.insert(putoutApplyEntity);
        //预审批状态修改
        FundPreapprovalCreditEntity creditEntity= preapprovalCreditDao.selectByBusiNo(loadApplyReqDto.getlBusiNo(),"0");
        if (creditEntity!=null){
         creditEntity.setStatus("1");
         preapprovalCreditDao.updateByPrimaryKey(creditEntity);
        }
    }

    /**
     * T31.查询放款申请结果
     * @param lApplyNo
     * @return
     */
    @Override
    public LoadApplyQueryRespDto queryLoanApplyResult(String lApplyNo) {

        FunPutoutApplyEntity putoutApplyEntity=putoutApplyDao.selectByApplyNo(lApplyNo);
        LoadApplyQueryRespDto loadApplyQueryRespDto=new LoadApplyQueryRespDto();
        if (putoutApplyEntity!=null){
//            loadApplyQueryRespDto.setaDealNo(putoutApplyEntity.getaDealNo());
//            loadApplyQueryRespDto.setaCapitalBusiNo(putoutApplyEntity.getaCapitalBusiNo());
//            loadApplyQueryRespDto.setClearDate(putoutApplyEntity.getClearDate());
//            loadApplyQueryRespDto.setDealStatus(putoutApplyEntity.getDealStatus());
//            loadApplyQueryRespDto.setDealDesc(putoutApplyEntity.getDealDesc());
//            loadApplyQueryRespDto.setlApplyNo(putoutApplyEntity.getlApplyNo());
//            loadApplyQueryRespDto.setTransDate(putoutApplyEntity.getTransDate());
            loadApplyQueryRespDto=BeanCopierUtils.copy(putoutApplyEntity,loadApplyQueryRespDto);
        }
        return loadApplyQueryRespDto;
    }
}
