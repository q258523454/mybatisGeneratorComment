package com.entity;

public class DgpjCallLog {
    //评级唯一标志
    private String uniqueCode;

    //评级资产包apid
    private String apid;

    //评级项目类型(1:个人消费贷款, 2:汽车抵押贷款, 3:住房抵押贷款, 5:企业贷款, 6:企业应收账款, 7:商业保理, 8:国金汽车抵押贷款)
    private String industryType;

    //评级调起阶段
    private String stage;

    //评级请求时间
    private String startTime;

    //评级状态(1.评级ing,2.评级完成,3.评级失败)
    private String ratingStatus;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getRatingStatus() {
        return ratingStatus;
    }

    public void setRatingStatus(String ratingStatus) {
        this.ratingStatus = ratingStatus;
    }
}