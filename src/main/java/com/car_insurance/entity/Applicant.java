package com.car_insurance.entity;

import java.util.Date;

public class Applicant {
    private Integer applicantId;

    private Integer customerNum;

    private String applicantIdcard;

    private String applicantName;

    private Integer age;

    private String applicantPhone;

    private String sex;

    private String address;

    private Date applicantTime;

    public Applicant(Integer applicantId, Integer customerNum, String applicantIdcard, String applicantName, Integer age, String applicantPhone, String sex, String address, Date applicantTime) {
        this.applicantId = applicantId;
        this.customerNum = customerNum;
        this.applicantIdcard = applicantIdcard;
        this.applicantName = applicantName;
        this.age = age;
        this.applicantPhone = applicantPhone;
        this.sex = sex;
        this.address = address;
        this.applicantTime = applicantTime;
    }

    public Applicant() {
        super();
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public Integer getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(Integer customerNum) {
        this.customerNum = customerNum;
    }

    public String getApplicantIdcard() {
        return applicantIdcard;
    }

    public void setApplicantIdcard(String applicantIdcard) {
        this.applicantIdcard = applicantIdcard == null ? null : applicantIdcard.trim();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone == null ? null : applicantPhone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getApplicantTime() {
        return applicantTime;
    }

    public void setApplicantTime(Date applicantTime) {
        this.applicantTime = applicantTime;
    }
}