package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class InsuranceExample extends  Insurance{
    public InsuranceExample(Integer insurance_id, String insurance_details, String insurance_type, Integer insurance_price) {
        super(insurance_id, insurance_details, insurance_type, insurance_price);
    }

    public InsuranceExample() {
    }
}