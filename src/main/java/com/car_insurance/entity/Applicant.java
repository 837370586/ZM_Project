package com.car_insurance.entity;

import java.util.Date;

public class Applicant {
    private Integer applicant_id;

    private String applicant_idcard;

    private String applicant_name;

    private Integer applicant_age;

    private String applicant_phone;

    private String registered_phone;
    private Integer applicant_password;
    private String applicant_sex;

    private String applicant_address;

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

    public Integer getApplicant_age() {
        return applicant_age;
    }

    public void setApplicant_age(Integer applicant_age) {
        this.applicant_age = applicant_age;
    }

    public String getApplicant_phone() {
        return applicant_phone;
    }

    public void setApplicant_phone(String applicant_phone) {
        this.applicant_phone = applicant_phone;
    }

    public String getRegistered_phone() {
        return registered_phone;
    }

    public void setRegistered_phone(String registered_phone) {
        this.registered_phone = registered_phone;
    }

    public Integer getApplicant_password() {
        return applicant_password;
    }

    public void setApplicant_password(Integer applicant_password) {
        this.applicant_password = applicant_password;
    }

    public String getApplicant_sex() {
        return applicant_sex;
    }

    public void setApplicant_sex(String applicant_sex) {
        this.applicant_sex = applicant_sex;
    }

    public String getApplicant_address() {
        return applicant_address;
    }

    public void setApplicant_address(String applicant_address) {
        this.applicant_address = applicant_address;
    }

    public Date getApplicant_time() {
        return applicant_time;
    }

    public void setApplicant_time(Date applicant_time) {
        this.applicant_time = applicant_time;
    }

    public Applicant(Integer applicant_id, String applicant_idcard, String applicant_name, Integer applicant_age, String applicant_phone, String registered_phone, Integer applicant_password, String applicant_sex, String applicant_address, Date applicant_time) {
        this.applicant_id = applicant_id;
        this.applicant_idcard = applicant_idcard;
        this.applicant_name = applicant_name;
        this.applicant_age = applicant_age;
        this.applicant_phone = applicant_phone;
        this.registered_phone = registered_phone;
        this.applicant_password = applicant_password;
        this.applicant_sex = applicant_sex;
        this.applicant_address = applicant_address;
        this.applicant_time = applicant_time;
    }

    public Applicant() {
    }
}