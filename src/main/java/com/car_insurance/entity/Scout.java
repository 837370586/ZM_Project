package com.car_insurance.entity;

import java.util.Date;

public class Scout {
    private Integer scoutId;

    private Integer scoutNum;

    private String scoutName;

    private Integer filialeNum;

    private Date scoutTime;

    public Scout(Integer scoutId, Integer scoutNum, String scoutName, Integer filialeNum, Date scoutTime) {
        this.scoutId = scoutId;
        this.scoutNum = scoutNum;
        this.scoutName = scoutName;
        this.filialeNum = filialeNum;
        this.scoutTime = scoutTime;
    }

    public Scout() {
        super();
    }

    public Integer getScoutId() {
        return scoutId;
    }

    public void setScoutId(Integer scoutId) {
        this.scoutId = scoutId;
    }

    public Integer getScoutNum() {
        return scoutNum;
    }

    public void setScoutNum(Integer scoutNum) {
        this.scoutNum = scoutNum;
    }

    public String getScoutName() {
        return scoutName;
    }

    public void setScoutName(String scoutName) {
        this.scoutName = scoutName == null ? null : scoutName.trim();
    }

    public Integer getFilialeNum() {
        return filialeNum;
    }

    public void setFilialeNum(Integer filialeNum) {
        this.filialeNum = filialeNum;
    }

    public Date getScoutTime() {
        return scoutTime;
    }

    public void setScoutTime(Date scoutTime) {
        this.scoutTime = scoutTime;
    }
}