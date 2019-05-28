package com.car_insurance.entity;

import java.util.Date;

public class Recognizee {

    private Integer recognizee_id;

    private String recognizee_idcard;

    private String recognizee_name;

    private Integer recognizee_age;

    private String recognizee_sex;

    private String recognizee_phone;

    private Integer applicant_id;

    private String recognizee_address;

    private String carid;

    private String car_category;

    private String engine;

    private String vin;

    private Integer insurance_id;

    private String policynumber;

    private String car_owner;

    private Date recognizee;

    public Integer getRecognizee_id() {
        return recognizee_id;
    }

    public void setRecognizee_id(Integer recognizee_id) {
        this.recognizee_id = recognizee_id;
    }

    public String getRecognizee_idcard() {
        return recognizee_idcard;
    }

    public void setRecognizee_idcard(String recognizee_idcard) {
        this.recognizee_idcard = recognizee_idcard;
    }

    public String getRecognizee_name() {
        return recognizee_name;
    }

    public void setRecognizee_name(String recognizee_name) {
        this.recognizee_name = recognizee_name;
    }

    public Integer getRecognizee_age() {
        return recognizee_age;
    }

    public void setRecognizee_age(Integer recognizee_age) {
        this.recognizee_age = recognizee_age;
    }

    public String getRecognizee_sex() {
        return recognizee_sex;
    }

    public void setRecognizee_sex(String recognizee_sex) {
        this.recognizee_sex = recognizee_sex;
    }

    public String getRecognizee_phone() {
        return recognizee_phone;
    }

    public void setRecognizee_phone(String recognizee_phone) {
        this.recognizee_phone = recognizee_phone;
    }

    public Integer getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(Integer applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getRecognizee_address() {
        return recognizee_address;
    }

    public void setRecognizee_address(String recognizee_address) {
        this.recognizee_address = recognizee_address;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getCar_category() {
        return car_category;
    }

    public void setCar_category(String car_category) {
        this.car_category = car_category;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(Integer insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getCar_owner() {
        return car_owner;
    }

    public void setCar_owner(String car_owner) {
        this.car_owner = car_owner;
    }

    public Date getRecognizee() {
        return recognizee;
    }

    public void setRecognizee(Date recognizee) {
        this.recognizee = recognizee;
    }

    public Recognizee(Integer recognizee_id, String recognizee_idcard, String recognizee_name, Integer recognizee_age, String recognizee_sex, String recognizee_phone, Integer applicant_id, String recognizee_address, String carid, String car_category, String engine, String vin, Integer insurance_id, String policynumber, String car_owner, Date recognizee) {
        this.recognizee_id = recognizee_id;
        this.recognizee_idcard = recognizee_idcard;
        this.recognizee_name = recognizee_name;
        this.recognizee_age = recognizee_age;
        this.recognizee_sex = recognizee_sex;
        this.recognizee_phone = recognizee_phone;
        this.applicant_id = applicant_id;
        this.recognizee_address = recognizee_address;
        this.carid = carid;
        this.car_category = car_category;
        this.engine = engine;
        this.vin = vin;
        this.insurance_id = insurance_id;
        this.policynumber = policynumber;
        this.car_owner = car_owner;
        this.recognizee = recognizee;
    }

    public Recognizee() {
    }
}