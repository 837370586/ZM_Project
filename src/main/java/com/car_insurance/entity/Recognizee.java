package com.car_insurance.entity;

import java.util.Date;

public class Recognizee {
    private Integer recognizeeId;

    private String recognizeeIdcard;

    private String name;

    private Integer age;

    private String sex;

    private String phone;

    private Integer applicantId;

    private String address;

    private String carid;

    private String carCategory;

    private String engine;

    private String vin;

    private Integer insuranceId;

    private String policynumber;

    private String carOwner;

    private Date recognizee;

    public Recognizee(Integer recognizeeId, String recognizeeIdcard, String name, Integer age, String sex, String phone, Integer applicantId, String address, String carid, String carCategory, String engine, String vin, Integer insuranceId, String policynumber, String carOwner, Date recognizee) {
        this.recognizeeId = recognizeeId;
        this.recognizeeIdcard = recognizeeIdcard;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.applicantId = applicantId;
        this.address = address;
        this.carid = carid;
        this.carCategory = carCategory;
        this.engine = engine;
        this.vin = vin;
        this.insuranceId = insuranceId;
        this.policynumber = policynumber;
        this.carOwner = carOwner;
        this.recognizee = recognizee;
    }

    public Recognizee() {
        super();
    }

    public Integer getRecognizeeId() {
        return recognizeeId;
    }

    public void setRecognizeeId(Integer recognizeeId) {
        this.recognizeeId = recognizeeId;
    }

    public String getRecognizeeIdcard() {
        return recognizeeIdcard;
    }

    public void setRecognizeeIdcard(String recognizeeIdcard) {
        this.recognizeeIdcard = recognizeeIdcard == null ? null : recognizeeIdcard.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory == null ? null : carCategory.trim();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber == null ? null : policynumber.trim();
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner == null ? null : carOwner.trim();
    }

    public Date getRecognizee() {
        return recognizee;
    }

    public void setRecognizee(Date recognizee) {
        this.recognizee = recognizee;
    }
}