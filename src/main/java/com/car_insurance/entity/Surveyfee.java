package com.car_insurance.entity;

public class Surveyfee {
    private Integer auditfeeId;

    private Integer surveyfeeCard;

    private Integer surveyNum;

    private Integer surveyState;

    private String accidentHandingDepartment;

    private String kindOfAccident;

    private String vin;

    private String dangerBecause;

    private String lossSituation;

    private String responsibilityJudgement;

    private String compensationRecords;

    private String dutyRatio;

    private String picture;

    private String maintenancePoint;

    private String nuclearDamageOfAudit;

    public Surveyfee(Integer auditfeeId, Integer surveyfeeCard, Integer surveyNum, Integer surveyState, String accidentHandingDepartment, String kindOfAccident, String vin, String dangerBecause, String lossSituation, String responsibilityJudgement, String compensationRecords, String dutyRatio, String picture, String maintenancePoint, String nuclearDamageOfAudit) {
        this.auditfeeId = auditfeeId;
        this.surveyfeeCard = surveyfeeCard;
        this.surveyNum = surveyNum;
        this.surveyState = surveyState;
        this.accidentHandingDepartment = accidentHandingDepartment;
        this.kindOfAccident = kindOfAccident;
        this.vin = vin;
        this.dangerBecause = dangerBecause;
        this.lossSituation = lossSituation;
        this.responsibilityJudgement = responsibilityJudgement;
        this.compensationRecords = compensationRecords;
        this.dutyRatio = dutyRatio;
        this.picture = picture;
        this.maintenancePoint = maintenancePoint;
        this.nuclearDamageOfAudit = nuclearDamageOfAudit;
    }

    public Surveyfee() {
        super();
    }

    public Integer getAuditfeeId() {
        return auditfeeId;
    }

    public void setAuditfeeId(Integer auditfeeId) {
        this.auditfeeId = auditfeeId;
    }

    public Integer getSurveyfeeCard() {
        return surveyfeeCard;
    }

    public void setSurveyfeeCard(Integer surveyfeeCard) {
        this.surveyfeeCard = surveyfeeCard;
    }

    public Integer getSurveyNum() {
        return surveyNum;
    }

    public void setSurveyNum(Integer surveyNum) {
        this.surveyNum = surveyNum;
    }

    public Integer getSurveyState() {
        return surveyState;
    }

    public void setSurveyState(Integer surveyState) {
        this.surveyState = surveyState;
    }

    public String getAccidentHandingDepartment() {
        return accidentHandingDepartment;
    }

    public void setAccidentHandingDepartment(String accidentHandingDepartment) {
        this.accidentHandingDepartment = accidentHandingDepartment == null ? null : accidentHandingDepartment.trim();
    }

    public String getKindOfAccident() {
        return kindOfAccident;
    }

    public void setKindOfAccident(String kindOfAccident) {
        this.kindOfAccident = kindOfAccident == null ? null : kindOfAccident.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getDangerBecause() {
        return dangerBecause;
    }

    public void setDangerBecause(String dangerBecause) {
        this.dangerBecause = dangerBecause == null ? null : dangerBecause.trim();
    }

    public String getLossSituation() {
        return lossSituation;
    }

    public void setLossSituation(String lossSituation) {
        this.lossSituation = lossSituation == null ? null : lossSituation.trim();
    }

    public String getResponsibilityJudgement() {
        return responsibilityJudgement;
    }

    public void setResponsibilityJudgement(String responsibilityJudgement) {
        this.responsibilityJudgement = responsibilityJudgement == null ? null : responsibilityJudgement.trim();
    }

    public String getCompensationRecords() {
        return compensationRecords;
    }

    public void setCompensationRecords(String compensationRecords) {
        this.compensationRecords = compensationRecords == null ? null : compensationRecords.trim();
    }

    public String getDutyRatio() {
        return dutyRatio;
    }

    public void setDutyRatio(String dutyRatio) {
        this.dutyRatio = dutyRatio == null ? null : dutyRatio.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getMaintenancePoint() {
        return maintenancePoint;
    }

    public void setMaintenancePoint(String maintenancePoint) {
        this.maintenancePoint = maintenancePoint == null ? null : maintenancePoint.trim();
    }

    public String getNuclearDamageOfAudit() {
        return nuclearDamageOfAudit;
    }

    public void setNuclearDamageOfAudit(String nuclearDamageOfAudit) {
        this.nuclearDamageOfAudit = nuclearDamageOfAudit == null ? null : nuclearDamageOfAudit.trim();
    }
}