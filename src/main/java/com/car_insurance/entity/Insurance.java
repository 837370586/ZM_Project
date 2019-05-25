package com.car_insurance.entity;

public class Insurance {
    private Integer insurance_id;

    private String insurance_details;

    private String insurance_type;

    private Integer insurance_price;

    public Integer getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(Integer insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getInsurance_details() {
        return insurance_details;
    }

    public void setInsurance_details(String insurance_details) {
        this.insurance_details = insurance_details;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public Integer getInsurance_price() {
        return insurance_price;
    }

    public void setInsurance_price(Integer insurance_price) {
        this.insurance_price = insurance_price;
    }

    public Insurance(Integer insurance_id, String insurance_details, String insurance_type, Integer insurance_price) {
        this.insurance_id = insurance_id;
        this.insurance_details = insurance_details;
        this.insurance_type = insurance_type;
        this.insurance_price = insurance_price;
    }

    public Insurance() {
    }
}