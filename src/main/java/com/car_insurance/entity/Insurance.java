package com.car_insurance.entity;

public class Insurance {
    private Integer insuranceId;

    private String insuranceDetails;

    private String insuranceType;

    private Integer insurancePrice;

    public Insurance(Integer insuranceId, String insuranceDetails, String insuranceType, Integer insurancePrice) {
        this.insuranceId = insuranceId;
        this.insuranceDetails = insuranceDetails;
        this.insuranceType = insuranceType;
        this.insurancePrice = insurancePrice;
    }

    public Insurance() {
        super();
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails == null ? null : insuranceDetails.trim();
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    public Integer getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(Integer insurancePrice) {
        this.insurancePrice = insurancePrice;
    }
}