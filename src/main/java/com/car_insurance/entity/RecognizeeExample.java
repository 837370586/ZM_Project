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

}