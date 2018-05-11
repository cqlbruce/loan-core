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
     * 银行卡类型1 借记卡
     * 2 贷记卡
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
    private String aCapitalBusiNo;

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
     * FUND_PREAPPROVAL_CREDIT
     */
    private static final long serialVersionUID = 1L;

    public String getaApplyNo() {
        return aApplyNo;
    }

    public void setaApplyNo(String aApplyNo) {
        this.aApplyNo = aApplyNo;
    }

    public String getaBusiNo() {
        return aBusiNo;
    }

    public void setaBusiNo(String aBusiNo) {
        this.aBusiNo = aBusiNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public BigDecimal getApplyAmt() {
        return applyAmt;
    }

    public void setApplyAmt(BigDecimal applyAmt) {
        this.applyAmt = applyAmt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHuoseAddress() {
        return huoseAddress;
    }

    public void setHuoseAddress(String huoseAddress) {
        this.huoseAddress = huoseAddress;
    }

    public String getHousePropertyFlag() {
        return housePropertyFlag;
    }

    public void setHousePropertyFlag(String housePropertyFlag) {
        this.housePropertyFlag = housePropertyFlag;
    }

    public BigDecimal getHouseValue() {
        return houseValue;
    }

    public void setHouseValue(BigDecimal houseValue) {
        this.houseValue = houseValue;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkProperty() {
        return workProperty;
    }

    public void setWorkProperty(String workProperty) {
        this.workProperty = workProperty;
    }

    public String getWorkField() {
        return workField;
    }

    public void setWorkField(String workField) {
        this.workField = workField;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public BigDecimal getHouseFundBase() {
        return houseFundBase;
    }

    public void setHouseFundBase(BigDecimal houseFundBase) {
        this.houseFundBase = houseFundBase;
    }

    public String getHouseFundUnit() {
        return houseFundUnit;
    }

    public void setHouseFundUnit(String houseFundUnit) {
        this.houseFundUnit = houseFundUnit;
    }

    public String getHouseFundCurrentMonths() {
        return houseFundCurrentMonths;
    }

    public void setHouseFundCurrentMonths(String houseFundCurrentMonths) {
        this.houseFundCurrentMonths = houseFundCurrentMonths;
    }

    public String getHouseFundTotalMonths() {
        return houseFundTotalMonths;
    }

    public void setHouseFundTotalMonths(String houseFundTotalMonths) {
        this.houseFundTotalMonths = houseFundTotalMonths;
    }

    public String getContactsCnt() {
        return contactsCnt;
    }

    public void setContactsCnt(String contactsCnt) {
        this.contactsCnt = contactsCnt;
    }

    public String getStakeholderCnt() {
        return stakeholderCnt;
    }

    public void setStakeholderCnt(String stakeholderCnt) {
        this.stakeholderCnt = stakeholderCnt;
    }

    public String getCheckAppleId() {
        return checkAppleId;
    }

    public void setCheckAppleId(String checkAppleId) {
        this.checkAppleId = checkAppleId;
    }

    public String getBankCardNo() {
        return cardNo;
    }

    public void setBankCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankCardType() {
        return cardType;
    }

    public void setBankCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    public String getThirdOrgCode() {
        return thirdOrgCode;
    }

    public void setThirdOrgCode(String thirdOrgCode) {
        this.thirdOrgCode = thirdOrgCode;
    }

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    public String getThirdOrgReturnCode() {
        return thirdOrgReturnCode;
    }

    public void setThirdOrgReturnCode(String thirdOrgReturnCode) {
        this.thirdOrgReturnCode = thirdOrgReturnCode;
    }

    public String getThirdOrgReturnMsg() {
        return thirdOrgReturnMsg;
    }

    public void setThirdOrgReturnMsg(String thirdOrgReturnMsg) {
        this.thirdOrgReturnMsg = thirdOrgReturnMsg;
    }

    public String getApplyDatetime() {
        return applyDatetime;
    }

    public void setApplyDatetime(String applyDatetime) {
        this.applyDatetime = applyDatetime;
    }

    public String getFinishDatetime() {
        return finishDatetime;
    }

    public void setFinishDatetime(String finishDatetime) {
        this.finishDatetime = finishDatetime;
    }

    public String getaDealNo() {
        return aDealNo;
    }

    public void setaDealNo(String aDealNo) {
        this.aDealNo = aDealNo;
    }

    public String getaCapitalBusiNo() {
        return aCapitalBusiNo;
    }

    public void setaCapitalBusiNo(String aCapitalBusiNo) {
        this.aCapitalBusiNo = aCapitalBusiNo;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getDealDesc() {
        return dealDesc;
    }

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}