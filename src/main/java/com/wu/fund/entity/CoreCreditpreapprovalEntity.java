package com.wu.fund.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: wangying
 * @Description:核心授信预审批
 * @Date: Created in  2018/5/9
 */

public class CoreCreditpreapprovalEntity implements Serializable {
    /**
     * 授信或预审批请求流水号
     */
    private String aApplyNo;

    /**
     * 世联金融业务流水号
     */
    private String aBusiNo;

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
    private String imageFileName;

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
    private String cardNo;

    /**
     * 银行卡类型1借记卡
     * 2贷记卡
     */
    private String cardType;

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
     * 认证状态01 认证通过02 认证未通过
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
    private String aCapitalBusiNo;

    /**
     * 处理结果0000 成功9999 失败0010 无该笔申请记录0020 其它0030 处理中0040 影像或合同文件缺失
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 资金单元编号
     */
    private String fundUnitNo;

    /**
     * 贷款机构编号
     */
    private String loanOrgCode;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * CORE_CREDITPREAPPROVAL
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
    public String getaBusiNo() {
        return aBusiNo;
    }

    /**
     * null
     * @param aBusiNo null
     */
    public void setaBusiNo(String aBusiNo) {
        this.aBusiNo = aBusiNo;
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
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     * null
     * @param imageFileName null
     */
    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
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
        return cardNo;
    }

    /**
     * null
     * @param cardNo null
     */
    public void setBankCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * null
     * @return BANK_CARD_TYPE null
     */
    public String getBankCardType() {
        return cardType;
    }

    /**
     * null
     * @param cardType null
     */
    public void setBankCardType(String cardType) {
        this.cardType = cardType;
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
    public String getaCapitalBusiNo() {
        return aCapitalBusiNo;
    }

    /**
     * null
     * @param aCapitalBusiNo null
     */
    public void setaCapitalBusiNo(String aCapitalBusiNo) {
        this.aCapitalBusiNo = aCapitalBusiNo;
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

    public String getFundUnitNo() {
        return fundUnitNo;
    }

    public void setFundUnitNo(String fundUnitNo) {
        this.fundUnitNo = fundUnitNo;
    }

    public String getLoanOrgCode() {
        return loanOrgCode;
    }

    public void setLoanOrgCode(String loanOrgCode) {
        this.loanOrgCode = loanOrgCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

   
}