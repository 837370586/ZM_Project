package com.car_insurance.entity;

import java.util.Date;

public class Recognizee {
    private Integer recognizee_id;

    private String recognizee_idcard;

    private String name;

    private Integer age;

    private String sex;

    private String phone;

    private Integer applicant_id;

    private String address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(Integer applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Recognizee(Integer recognizee_id, String recognizee_idcard, String name, Integer age, String sex, String phone, Integer applicant_id, String address, String carid, String car_category, String engine, String vin, Integer insurance_id, String policynumber, String car_owner, Date recognizee) {
        this.recognizee_id = recognizee_id;
        this.recognizee_idcard = recognizee_idcard;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.applicant_id = applicant_id;
        this.address = address;
        this.carid = carid;
        this.car_category = car_category;
        this.engine = engine;
        this.vin = vin;
        this.insurance_id = insurance_id;
        this.policynumber = policynumber;
        this.car_owner = car_owner;
        this.recognizee = recognizee;
    }
}