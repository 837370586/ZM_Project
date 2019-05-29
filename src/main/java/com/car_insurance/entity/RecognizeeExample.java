package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecognizeeExample extends  Recognizee{
    private  Applicant applicant;

    public RecognizeeExample(Integer recognizee_id, String recognizee_idcard, String recognizee_name, Integer recognizee_age, String recognizee_sex, String recognizee_phone, Integer applicant_id, String recognizee_address, String carid, String car_category, String engine, String vin, Integer insurance_id, String policynumber, String car_owner, Date recognizee, Applicant applicant) {
        super(recognizee_id, recognizee_idcard, recognizee_name, recognizee_age, recognizee_sex, recognizee_phone, applicant_id, recognizee_address, carid, car_category, engine, vin, insurance_id, policynumber, car_owner, recognizee);
        this.applicant = applicant;
    }
    public RecognizeeExample() {
    }


}