package com.wu.fund.service.impl;

import com.wu.fund.dao.FunCrePreapprovalContactDao;
import com.wu.fund.dao.FunCrePreapprovalGuarantorDao;
import com.wu.fund.dao.FundPreapprovalCreditDao;
import com.wu.fund.dto.FundPreapprovalCreditReqDto;
import com.wu.fund.dto.FundPretrialApprovalQueryRespDto;
import com.wu.fund.entity.FunCrePreapprovalContactEntity;
import com.wu.fund.entity.FunCrePreapprovalGuarantorEntity;
import com.wu.fund.entity.FundPreapprovalCreditEntity;

import com.wu.fund.service.PretrialApprovalService;
import com.wu.fund.util.BeanCopierUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangying
 * @Description:
 * @Date: Created in  2018/5/11
 */
@Service
public class PretrialApprovalServiceImpl implements PretrialApprovalService {

    @Autowired
    private FundPreapprovalCreditDao creditMapper;

    @Autowired
    private FunCrePreapprovalContactDao crePreapprovalContactMapper;
    @Autowired
    private FunCrePreapprovalGuarantorDao crePreapprovalGuarantorMapper;

    /**
     *T20.申请授信或预审批
     * @param creditDto
     */
    @Override
    public void pretrialApproval(FundPreapprovalCreditReqDto creditDto) {
        //预审批主表
        FundPreapprovalCreditEntity creditEntity= creditMapper.selectByBusiNo(creditDto.getaBusiNo(),"3");
        if (creditEntity!=null){
            return;
        }
        creditEntity=BeanCopierUtils.copy(creditDto,FundPreapprovalCreditEntity.class);
        creditEntity.setStatus("0");
        creditMapper.insert(creditEntity);
        //联系人
        List<FunCrePreapprovalContactEntity> contactList =crePreapprovalContactMapper.selectContactByApplyNo(creditDto.getaApplyNo());
        if (contactList.size()==0){
            contactList=BeanCopierUtils.copyList(creditDto.getContactList(),FunCrePreapprovalContactEntity.class);
            contactList.forEach(contact-> {
                contact.setaApplyNo(creditDto.getaApplyNo());
                crePreapprovalContactMapper.insert(contact);});
        }
        //担保人
        List<FunCrePreapprovalGuarantorEntity> guarantorList=crePreapprovalGuarantorMapper.selectGuarantorByApplyNo(creditDto.getaApplyNo());
        if (guarantorList.size()==0){
            guarantorList=BeanCopierUtils.copyList(creditDto.getGuarantorList(),FunCrePreapprovalGuarantorEntity.class);
            guarantorList.forEach(guarantor-> {
                guarantor.setaApplyNo(creditDto.getaApplyNo());
                crePreapprovalGuarantorMapper.insert(guarantor);});
        }
    }

    @Override
    public FundPretrialApprovalQueryRespDto queryPretrialApprovalResult(String aApplyNo) {

        FundPreapprovalCreditEntity creditEntity=creditMapper.selectByApplyNo(aApplyNo);
        FundPretrialApprovalQueryRespDto respDto=new FundPretrialApprovalQueryRespDto();
        if (creditEntity!=null){
//           respDto.setaApplyNo(creditEntity.getaApplyNo());
//           respDto.setaCapitalBusiNo(creditEntity.getaCapitalBusiNo());
//           respDto.setaDealNo(creditEntity.getaDealNo());
//           respDto.setDealDesc(creditEntity.getDealDesc());
//           respDto.setDealStatus(creditEntity.getDealStatus());
//           respDto.setStatus(creditEntity.getStatus());
            respDto=BeanCopierUtils.copy(creditEntity,respDto);
        }

        return respDto;

    }
}
