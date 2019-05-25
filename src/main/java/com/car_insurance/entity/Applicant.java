package com.car_insurance.entity;

import java.util.Date;

public class Applicant {
    private Integer applicant_id;

    private String applicant_idcard;

    private String applicant_name;

    private Integer age;

    private String applicant_phone;

    private String sex;

    private String address;

    private Date applicant_time;

    public Integer getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(Integer applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getApplicant_idcard() {
        return applicant_idcard;
    }

    public void setApplicant_idcard(String applicant_idcard) {
        this.applicant_idcard = applicant_idcard;
    }

    public String getApplicant_name() {
        return applicant_name;
    }

    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getApplicant_phone() {
        return applicant_phone;
    }

    public void setApplicant_phone(String applicant_phone) {
        this.applicant_phone = applicant_phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getApplicant_time() {
        return applicant_time;
    }

    public void setApplicant_time(Date applicant_time) {
        this.applicant_time = applicant_time;
    }

    public Applicant(Integer applicant_id, String applicant_idcard, String applicant_name, Integer age, String applicant_phone, String sex, String address, Date applicant_time) {
        this.applicant_id = applicant_id;
        this.applicant_idcard = applicant_idcard;
        this.applicant_name = applicant_name;
        this.age = age;
        this.applicant_phone = applicant_phone;
        this.sex = sex;
        this.address = address;
        this.applicant_time = applicant_time;
    }
}