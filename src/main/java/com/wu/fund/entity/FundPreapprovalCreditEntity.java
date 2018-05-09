package com.wu.fund.entity;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * @Author: wangying
 * @Description:申请授信或预审批
 * @Date: Created in  2018/5/9
 */
public class FundPreapprovalCreditEntity implements Serializable {
    /**
     * 授信或预审批请求流水号
     */
    private String aApplyNo;

    /**
     * 世联金融业务流水号
     */
    private String aSlBusinessNo;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 客户手机号
     */
    private String custMobile;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 证件号码
     */
    private String certNo;

    /**
     * 影像资料文件包名
     */
    private String imagefileName;

    /**
     * 申请金额
     */
    private BigDecimal applyAmt;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 最高学历
     */
    private String education;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 家庭住址/通讯地址
     */
    private String homeAddress;

    /**
     * 房产地址
     */
    private String huoseAddress;

    /**
     * 房产产权人标志
     */
    private String housePropertyFlag;

    /**
     * 房产估值
     */
    private BigDecimal houseValue;

    /**
     * 职业类型
     */
    private String workType;

    /**
     * 单位性质
     */
    private String workProperty;

    /**
     * 企业主营
     */
    private String workField;

    /**
     * 单位地址
     */
    private String workAddress;

    /**
     * 单位电话
     */
    private String workPhone;

    /**
     * 公积金缴存基数
     */
    private BigDecimal houseFundBase;

    /**
     * 公积金缴存单位
     */
    private String houseFundUnit;

    /**
     * 当前单位公积金缴存月数
     */
    private String houseFundCurrentMonths;

    /**
     * 公积金缴存总月数
     */
    private String houseFundTotalMonths;

    /**
     * 联系人个数
     */
    private String contactsCnt;

    /**
     * 干系人个数
     */
    private String stakeholderCnt;

    /**
     * 认证ID
     */
    private String checkAppleId;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 银行卡类型1 借记卡
     * 2 贷记卡
     */
    private String bankCardType;

    /**
     * 银行卡开户行名
     */
    private String bankName;

    /**
     * 银行预留手机号
     */
    private String bankMobile;

    /**
     * 第三方机构代码01 通联02 中金 03 宝付
     */
    private String thirdOrgCode;

    /**
     * 认证状态01 认证通过
     * 02 认证未通过
     */
    private String validStatus;

    /**
     * 返回码
     */
    private String thirdOrgReturnCode;

    /**
     * 返回码信息
     */
    private String thirdOrgReturnMsg;

    /**
     * 申请日期时间
     */
    private String applyDatetime;

    /**
     * 结束日期时间
     */
    private String finishDatetime;

    /**
     * 授信或预审批受理流水号
     */
    private String aDealNo;

    /**
     * 授信或预审批资金方业务流水号
     */
    private String aCapitalBusinessNo;

    /**
     * 处理结果0000 成功
     * 9999 失败
     * 0010 无该笔申请记录
     * 0020 其它
     * 0030 处理中
     * 0040 影像或合同文件缺失
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 资金单元编号
     */
    private String fundunitno;

    /**
     * 贷款机构编号
     */
    private String loanorgcode;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 开始时间
     */
    private String begintime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * FUND_PREAPPROVAL_CREDIT
     */
    private static final long serialVersionUID = 1L;

    /**
     * null
     * @return A_APPLY_NO null
     */
    public String getaApplyNo() {
        return aApplyNo;
    }

    /**
     * null
     * @param aApplyNo null
     */
    public void setaApplyNo(String aApplyNo) {
        this.aApplyNo = aApplyNo;
    }

    /**
     * null
     * @return A_SL_BUSINESS_NO null
     */
    public String getaSlBusinessNo() {
        return aSlBusinessNo;
    }

    /**
     * null
     * @param aSlBusinessNo null
     */
    public void setaSlBusinessNo(String aSlBusinessNo) {
        this.aSlBusinessNo = aSlBusinessNo;
    }

    /**
     * null
     * @return CUST_NAME null
     */
    public String getCustName() {
        return custName;
    }

    /**
     * null
     * @param custName null
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * null
     * @return CUST_MOBILE null
     */
    public String getCustMobile() {
        return custMobile;
    }

    /**
     * null
     * @param custMobile null
     */
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    /**
     * null
     * @return CERT_TYPE null
     */
    public String getCertType() {
        return certType;
    }

    /**
     * null
     * @param certType null
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * null
     * @return CERT_NO null
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * null
     * @param certNo null
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * null
     * @return IMAGEFILE_NAME null
     */
    public String getImagefileName() {
        return imagefileName;
    }

    /**
     * null
     * @param imagefileName null
     */
    public void setImagefileName(String imagefileName) {
        this.imagefileName = imagefileName;
    }

    /**
     * null
     * @return APPLY_AMT null
     */
    public BigDecimal getApplyAmt() {
        return applyAmt;
    }

    /**
     * null
     * @param applyAmt null
     */
    public void setApplyAmt(BigDecimal applyAmt) {
        this.applyAmt = applyAmt;
    }

    /**
     * null
     * @return SEX null
     */
    public String getSex() {
        return sex;
    }

    /**
     * null
     * @param sex null
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * null
     * @return BIRTHDAY null
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * null
     * @param birthday null
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * null
     * @return EDUCATION null
     */
    public String getEducation() {
        return education;
    }

    /**
     * null
     * @param education null
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * null
     * @return MARITAL_STATUS null
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * null
     * @param maritalStatus null
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * null
     * @return HOME_ADDRESS null
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * null
     * @param homeAddress null
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * null
     * @return HUOSE_ADDRESS null
     */
    public String getHuoseAddress() {
        return huoseAddress;
    }

    /**
     * null
     * @param huoseAddress null
     */
    public void setHuoseAddress(String huoseAddress) {
        this.huoseAddress = huoseAddress;
    }

    /**
     * null
     * @return HOUSE_PROPERTY_FLAG null
     */
    public String getHousePropertyFlag() {
        return housePropertyFlag;
    }

    /**
     * null
     * @param housePropertyFlag null
     */
    public void setHousePropertyFlag(String housePropertyFlag) {
        this.housePropertyFlag = housePropertyFlag;
    }

    /**
     * null
     * @return HOUSE_VALUE null
     */
    public BigDecimal getHouseValue() {
        return houseValue;
    }

    /**
     * null
     * @param houseValue null
     */
    public void setHouseValue(BigDecimal houseValue) {
        this.houseValue = houseValue;
    }

    /**
     * null
     * @return WORK_TYPE null
     */
    public String getWorkType() {
        return workType;
    }

    /**
     * null
     * @param workType null
     */
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    /**
     * null
     * @return WORK_PROPERTY null
     */
    public String getWorkProperty() {
        return workProperty;
    }

    /**
     * null
     * @param workProperty null
     */
    public void setWorkProperty(String workProperty) {
        this.workProperty = workProperty;
    }

    /**
     * null
     * @return WORK_FIELD null
     */
    public String getWorkField() {
        return workField;
    }

    /**
     * null
     * @param workField null
     */
    public void setWorkField(String workField) {
        this.workField = workField;
    }

    /**
     * null
     * @return WORK_ADDRESS null
     */
    public String getWorkAddress() {
        return workAddress;
    }

    /**
     * null
     * @param workAddress null
     */
    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    /**
     * null
     * @return WORK_PHONE null
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * null
     * @param workPhone null
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     * null
     * @return HOUSE_FUND_BASE null
     */
    public BigDecimal getHouseFundBase() {
        return houseFundBase;
    }

    /**
     * null
     * @param houseFundBase null
     */
    public void setHouseFundBase(BigDecimal houseFundBase) {
        this.houseFundBase = houseFundBase;
    }

    /**
     * null
     * @return HOUSE_FUND_UNIT null
     */
    public String getHouseFundUnit() {
        return houseFundUnit;
    }

    /**
     * null
     * @param houseFundUnit null
     */
    public void setHouseFundUnit(String houseFundUnit) {
        this.houseFundUnit = houseFundUnit;
    }

    /**
     * null
     * @return HOUSE_FUND_CURRENT_MONTHS null
     */
    public String getHouseFundCurrentMonths() {
        return houseFundCurrentMonths;
    }

    /**
     * null
     * @param houseFundCurrentMonths null
     */
    public void setHouseFundCurrentMonths(String houseFundCurrentMonths) {
        this.houseFundCurrentMonths = houseFundCurrentMonths;
    }

    /**
     * null
     * @return HOUSE_FUND_TOTAL_MONTHS null
     */
    public String getHouseFundTotalMonths() {
        return houseFundTotalMonths;
    }

    /**
     * null
     * @param houseFundTotalMonths null
     */
    public void setHouseFundTotalMonths(String houseFundTotalMonths) {
        this.houseFundTotalMonths = houseFundTotalMonths;
    }

    /**
     * null
     * @return CONTACTS_CNT null
     */
    public String getContactsCnt() {
        return contactsCnt;
    }

    /**
     * null
     * @param contactsCnt null
     */
    public void setContactsCnt(String contactsCnt) {
        this.contactsCnt = contactsCnt;
    }

    /**
     * null
     * @return STAKEHOLDER_CNT null
     */
    public String getStakeholderCnt() {
        return stakeholderCnt;
    }

    /**
     * null
     * @param stakeholderCnt null
     */
    public void setStakeholderCnt(String stakeholderCnt) {
        this.stakeholderCnt = stakeholderCnt;
    }

    /**
     * null
     * @return CHECK_APPLE_ID null
     */
    public String getCheckAppleId() {
        return checkAppleId;
    }

    /**
     * null
     * @param checkAppleId null
     */
    public void setCheckAppleId(String checkAppleId) {
        this.checkAppleId = checkAppleId;
    }

    /**
     * null
     * @return BANK_CARD_NO null
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * null
     * @param bankCardNo null
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * null
     * @return BANK_CARD_TYPE null
     */
    public String getBankCardType() {
        return bankCardType;
    }

    /**
     * null
     * @param bankCardType null
     */
    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
    }

    /**
     * null
     * @return BANK_NAME null
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * null
     * @param bankName null
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * null
     * @return BANK_MOBILE null
     */
    public String getBankMobile() {
        return bankMobile;
    }

    /**
     * null
     * @param bankMobile null
     */
    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    /**
     * null
     * @return THIRD_ORG_CODE null
     */
    public String getThirdOrgCode() {
        return thirdOrgCode;
    }

    /**
     * null
     * @param thirdOrgCode null
     */
    public void setThirdOrgCode(String thirdOrgCode) {
        this.thirdOrgCode = thirdOrgCode;
    }

    /**
     * null
     * @return VALID_STATUS null
     */
    public String getValidStatus() {
        return validStatus;
    }

    /**
     * null
     * @param validStatus null
     */
    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * null
     * @return THIRD_ORG_RETURN_CODE null
     */
    public String getThirdOrgReturnCode() {
        return thirdOrgReturnCode;
    }

    /**
     * null
     * @param thirdOrgReturnCode null
     */
    public void setThirdOrgReturnCode(String thirdOrgReturnCode) {
        this.thirdOrgReturnCode = thirdOrgReturnCode;
    }

    /**
     * null
     * @return THIRD_ORG_RETURN_MSG null
     */
    public String getThirdOrgReturnMsg() {
        return thirdOrgReturnMsg;
    }

    /**
     * null
     * @param thirdOrgReturnMsg null
     */
    public void setThirdOrgReturnMsg(String thirdOrgReturnMsg) {
        this.thirdOrgReturnMsg = thirdOrgReturnMsg;
    }

    /**
     * null
     * @return APPLY_DATETIME null
     */
    public String getApplyDatetime() {
        return applyDatetime;
    }

    /**
     * null
     * @param applyDatetime null
     */
    public void setApplyDatetime(String applyDatetime) {
        this.applyDatetime = applyDatetime;
    }

    /**
     * null
     * @return FINISH_DATETIME null
     */
    public String getFinishDatetime() {
        return finishDatetime;
    }

    /**
     * null
     * @param finishDatetime null
     */
    public void setFinishDatetime(String finishDatetime) {
        this.finishDatetime = finishDatetime;
    }

    /**
     * null
     * @return A_DEAL_NO null
     */
    public String getaDealNo() {
        return aDealNo;
    }

    /**
     * null
     * @param aDealNo null
     */
    public void setaDealNo(String aDealNo) {
        this.aDealNo = aDealNo;
    }

    /**
     * null
     * @return A_CAPITAL_BUSINESS_NO null
     */
    public String getaCapitalBusinessNo() {
        return aCapitalBusinessNo;
    }

    /**
     * null
     * @param aCapitalBusinessNo null
     */
    public void setaCapitalBusinessNo(String aCapitalBusinessNo) {
        this.aCapitalBusinessNo = aCapitalBusinessNo;
    }

    /**
     * null
     * @return DEAL_STATUS null
     */
    public String getDealStatus() {
        return dealStatus;
    }

    /**
     * null
     * @param dealStatus null
     */
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    /**
     * null
     * @return DEAL_DESC null
     */
    public String getDealDesc() {
        return dealDesc;
    }

    /**
     * null
     * @param dealDesc null
     */
    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }

    /**
     * null
     * @return FUNDUNITNO null
     */
    public String getFundunitno() {
        return fundunitno;
    }

    /**
     * null
     * @param fundunitno null
     */
    public void setFundunitno(String fundunitno) {
        this.fundunitno = fundunitno;
    }

    /**
     * null
     * @return LOANORGCODE null
     */
    public String getLoanorgcode() {
        return loanorgcode;
    }

    /**
     * null
     * @param loanorgcode null
     */
    public void setLoanorgcode(String loanorgcode) {
        this.loanorgcode = loanorgcode;
    }

    /**
     * null
     * @return STATUS null
     */
    public String getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * null
     * @return BEGINTIME null
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * null
     * @param begintime null
     */
    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    /**
     * null
     * @return ENDTIME null
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * null
     * @param endtime null
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}