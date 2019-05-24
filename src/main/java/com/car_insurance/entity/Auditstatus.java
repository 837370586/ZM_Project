package com.car_insurance.entity;

public class Auditstatus {
    private Integer auditStatusId;

    private String auditStatus;

    public Auditstatus(Integer auditStatusId, String auditStatus) {
        this.auditStatusId = auditStatusId;
        this.auditStatus = auditStatus;
    }

    public Auditstatus() {
        super();
    }

    public Integer getAuditStatusId() {
        return auditStatusId;
    }

    public void setAuditStatusId(Integer auditStatusId) {
        this.auditStatusId = auditStatusId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }
}