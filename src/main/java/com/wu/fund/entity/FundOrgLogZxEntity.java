package com.wu.fund.entity;


/**
 * @Author: wangying
 * @Description:资金平台-人行征信查询结果
 * @Date: Created in 17:29 2018/5/8
 */
public class FundOrgLogZxEntity {
    /**
     * 流水号
     */
    private String serialno;

    /**
     * 人行请求流水号
     */
    private String capplyno;

    /**
     * 世联金融业务流水号
     */
    private String cslbusinessno;

    /**
     * 人行受理流水号
     */
    private String cdealno;

    /**
     * 当前步骤节点
     */
    private String fundstepname;

    /**
     * 当前主流程节点
     */
    private String fundmainflowname;

    /**
     * 当前子流程节点
     */
    private String fundsubflowname;

    /**
     * 当前子流程状态(codeno为FundSubFlowStatus 01 待处理 02 处理中 03挂起)
     */
    private String fundsubflowstatus;

    /**
     * 当前子流程返回码
     */
    private String fundservicereturncode;

    /**
     * 当前子流程返回信息
     */
    private String fundservicereturnmsg;

    /**
     * 业务状态(Codeno 为FundBusinessStatus)
     */
    private String fundbusinessstatus;

    /**
     * 人行资金方业务流水号
     */
    private String ccapitalbusinessno;

    /**
     * 开始查询时间
     */
    private String begintime;

    /**
     * 结束查询时间
     */
    private String endtime;

    /**
     * 报告内容
     */
    private String loanorgcode;

    /**
     * 贷款机构编号
     */
    private String status;

    /**
     * 状态
     */
    private String oldloanorgcode;

    /**
     * 身份证证件号码
     */
    private String certid;

    /**
     * 人行征信报告地址
     */
    private String filepackageName;

    /**
     * 处理结果
     */
    private String dealStatus;

    /**
     * 描述
     */
    private String dealDesc;

    /**
     * 证件类型
     */
    private String certtype;

    /**
     * 客户姓名
     */
    private String customername;

    /**
     * null
     */
    private String responsemessage;

    /**
     * null
     * @return SERIALNO null
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * null
     * @param serialno null
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
     * null
     * @return CAPPLYNO null
     */
    public String getCapplyno() {
        return capplyno;
    }

    /**
     * null
     * @param capplyno null
     */
    public void setCapplyno(String capplyno) {
        this.capplyno = capplyno;
    }

    /**
     * null
     * @return CSLBUSINESSNO null
     */
    public String getCslbusinessno() {
        return cslbusinessno;
    }

    /**
     * null
     * @param cslbusinessno null
     */
    public void setCslbusinessno(String cslbusinessno) {
        this.cslbusinessno = cslbusinessno;
    }

    /**
     * null
     * @return CDEALNO null
     */
    public String getCdealno() {
        return cdealno;
    }

    /**
     * null
     * @param cdealno null
     */
    public void setCdealno(String cdealno) {
        this.cdealno = cdealno;
    }

    /**
     * null
     * @return FUNDSTEPNAME null
     */
    public String getFundstepname() {
        return fundstepname;
    }

    /**
     * null
     * @param fundstepname null
     */
    public void setFundstepname(String fundstepname) {
        this.fundstepname = fundstepname;
    }

    /**
     * null
     * @return FUNDMAINFLOWNAME null
     */
    public String getFundmainflowname() {
        return fundmainflowname;
    }

    /**
     * null
     * @param fundmainflowname null
     */
    public void setFundmainflowname(String fundmainflowname) {
        this.fundmainflowname = fundmainflowname;
    }

    /**
     * null
     * @return FUNDSUBFLOWNAME null
     */
    public String getFundsubflowname() {
        return fundsubflowname;
    }

    /**
     * null
     * @param fundsubflowname null
     */
    public void setFundsubflowname(String fundsubflowname) {
        this.fundsubflowname = fundsubflowname;
    }

    /**
     * null
     * @return FUNDSUBFLOWSTATUS null
     */
    public String getFundsubflowstatus() {
        return fundsubflowstatus;
    }

    /**
     * null
     * @param fundsubflowstatus null
     */
    public void setFundsubflowstatus(String fundsubflowstatus) {
        this.fundsubflowstatus = fundsubflowstatus;
    }

    /**
     * null
     * @return FUNDSERVICERETURNCODE null
     */
    public String getFundservicereturncode() {
        return fundservicereturncode;
    }

    /**
     * null
     * @param fundservicereturncode null
     */
    public void setFundservicereturncode(String fundservicereturncode) {
        this.fundservicereturncode = fundservicereturncode;
    }

    /**
     * null
     * @return FUNDSERVICERETURNMSG null
     */
    public String getFundservicereturnmsg() {
        return fundservicereturnmsg;
    }

    /**
     * null
     * @param fundservicereturnmsg null
     */
    public void setFundservicereturnmsg(String fundservicereturnmsg) {
        this.fundservicereturnmsg = fundservicereturnmsg;
    }

    /**
     * null
     * @return FUNDBUSINESSSTATUS null
     */
    public String getFundbusinessstatus() {
        return fundbusinessstatus;
    }

    /**
     * null
     * @param fundbusinessstatus null
     */
    public void setFundbusinessstatus(String fundbusinessstatus) {
        this.fundbusinessstatus = fundbusinessstatus;
    }

    /**
     * null
     * @return CCAPITALBUSINESSNO null
     */
    public String getCcapitalbusinessno() {
        return ccapitalbusinessno;
    }

    /**
     * null
     * @param ccapitalbusinessno null
     */
    public void setCcapitalbusinessno(String ccapitalbusinessno) {
        this.ccapitalbusinessno = ccapitalbusinessno;
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
     * @return OLDLOANORGCODE null
     */
    public String getOldloanorgcode() {
        return oldloanorgcode;
    }

    /**
     * null
     * @param oldloanorgcode null
     */
    public void setOldloanorgcode(String oldloanorgcode) {
        this.oldloanorgcode = oldloanorgcode;
    }

    /**
     * null
     * @return CERTID null
     */
    public String getCertid() {
        return certid;
    }

    /**
     * null
     * @param certid null
     */
    public void setCertid(String certid) {
        this.certid = certid;
    }

    /**
     * null
     * @return FILEPACKAGE_NAME null
     */
    public String getFilepackageName() {
        return filepackageName;
    }

    /**
     * null
     * @param filepackageName null
     */
    public void setFilepackageName(String filepackageName) {
        this.filepackageName = filepackageName;
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
     * @return CERTTYPE null
     */
    public String getCerttype() {
        return certtype;
    }

    /**
     * null
     * @param certtype null
     */
    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    /**
     * null
     * @return CUSTOMERNAME null
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * null
     * @param customername null
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * null
     * @return RESPONSEMESSAGE null
     */
    public String getResponsemessage() {
        return responsemessage;
    }

    /**
     * null
     * @param responsemessage null
     */
    public void setResponsemessage(String responsemessage) {
        this.responsemessage = responsemessage;
    }
}