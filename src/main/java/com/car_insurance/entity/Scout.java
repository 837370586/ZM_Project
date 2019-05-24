package com.car_insurance.entity;

import java.util.Date;

public class Scout {
    private Integer scoutId;

    private Integer scoutNum;

    private Date scoutTime;

    private Integer accidentTypeId;

    private String accidentPhoto;

    private Integer recognizeeId;

    private String lossSituation;

    private String responsibilityJudgment;

    public Scout(Integer scoutId, Integer scoutNum, Date scoutTime, Integer accidentTypeId, String accidentPhoto, Integer recognizeeId, String lossSituation, String responsibilityJudgment) {
        this.scoutId = scoutId;
        this.scoutNum = scoutNum;
        this.scoutTime = scoutTime;
        this.accidentTypeId = accidentTypeId;
        this.accidentPhoto = accidentPhoto;
        this.recognizeeId = recognizeeId;
        this.lossSituation = lossSituation;
        this.responsibilityJudgment = responsibilityJudgment;
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

    public Date getScoutTime() {
        return scoutTime;
    }

    public void setScoutTime(Date scoutTime) {
        this.scoutTime = scoutTime;
    }

    public Integer getAccidentTypeId() {
        return accidentTypeId;
    }

    public void setAccidentTypeId(Integer accidentTypeId) {
        this.accidentTypeId = accidentTypeId;
    }

    public String getAccidentPhoto() {
        return accidentPhoto;
    }

    public void setAccidentPhoto(String accidentPhoto) {
        this.accidentPhoto = accidentPhoto == null ? null : accidentPhoto.trim();
    }

    public Integer getRecognizeeId() {
        return recognizeeId;
    }

    public void setRecognizeeId(Integer recognizeeId) {
        this.recognizeeId = recognizeeId;
    }

    public String getLossSituation() {
        return lossSituation;
    }

    public void setLossSituation(String lossSituation) {
        this.lossSituation = lossSituation == null ? null : lossSituation.trim();
    }

    public String getResponsibilityJudgment() {
        return responsibilityJudgment;
    }

    public void setResponsibilityJudgment(String responsibilityJudgment) {
        this.responsibilityJudgment = responsibilityJudgment == null ? null : responsibilityJudgment.trim();
    }
}