package com.car_insurance.entity;

import java.util.Date;

public class Audit {
    private Integer auditId;

    private Integer auditNum;

    private String auditName;

    private Integer auditPhone;

    private Integer insuranceId;

    private Integer auditStatusId;

    private Date auditTime;

    public Audit(Integer auditId, Integer auditNum, String auditName, Integer auditPhone, Integer insuranceId, Integer auditStatusId, Date auditTime) {
        this.auditId = auditId;
        this.auditNum = auditNum;
        this.auditName = auditName;
        this.auditPhone = auditPhone;
        this.insuranceId = insuranceId;
        this.auditStatusId = auditStatusId;
        this.auditTime = auditTime;
    }

    public Audit() {
        super();
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getAuditNum() {
        return auditNum;
    }

    public void setAuditNum(Integer auditNum) {
        this.auditNum = auditNum;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    public Integer getAuditPhone() {
        return auditPhone;
    }

    public void setAuditPhone(Integer auditPhone) {
        this.auditPhone = auditPhone;
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Integer getAuditStatusId() {
        return auditStatusId;
    }

    public void setAuditStatusId(Integer auditStatusId) {
        this.auditStatusId = auditStatusId;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}