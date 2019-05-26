package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecognizeeExample extends  Recognizee{
    private  Applicant applicant;

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public RecognizeeExample(Integer recognizee_id, String recognizee_idcard, String name, Integer age, String sex, String phone, Integer applicant_id, String address, String carid, String car_category, String engine, String vin, Integer insurance_id, String policynumber, String car_owner, Date recognizee, Applicant applicant) {
        super(recognizee_id, recognizee_idcard, name, age, sex, phone, applicant_id, address, carid, car_category, engine, vin, insurance_id, policynumber, car_owner, recognizee);
        this.applicant = applicant;
    }
    public RecognizeeExample(Integer recognizee_id, String recognizee_idcard, String name, Integer age, String sex, String phone, Integer applicant_id, String address, String carid, String car_category, String engine, String vin, Integer insurance_id, String policynumber, String car_owner, Date recognizee) {
        super(recognizee_id, recognizee_idcard, name, age, sex, phone, applicant_id, address, carid, car_category, engine, vin, insurance_id, policynumber, car_owner, recognizee);
    }

    public RecognizeeExample() {
    }
}