package com.car_insurance.entity;

public class Auditstatus {
    private Integer auditstatus_id;

    private String audit_status;

    public Integer getAuditstatus_id() {
        return auditstatus_id;
    }

    public void setAuditstatus_id(Integer auditstatus_id) {
        this.auditstatus_id = auditstatus_id;
    }

    public String getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(String audit_status) {
        this.audit_status = audit_status;
    }

    public Auditstatus(Integer auditstatus_id, String audit_status) {
        this.auditstatus_id = auditstatus_id;
        this.audit_status = audit_status;
    }
}