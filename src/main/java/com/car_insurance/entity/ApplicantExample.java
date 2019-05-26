package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicantExample extends Applicant  {
    public ApplicantExample(Integer applicant_id, String applicant_idcard, String applicant_name, Integer age, String applicant_phone, String sex, String address, Date applicant_time) {
        super(applicant_id, applicant_idcard, applicant_name, age, applicant_phone, sex, address, applicant_time);
    }
    public ApplicantExample(){};
}