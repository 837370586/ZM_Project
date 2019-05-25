package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancialStaffExample extends FinancialStaff{
    public FinancialStaffExample(Integer financial_staff_id, Integer serial_num, Integer employee_id, Integer financial_staff_state, String payee_num, String payee_name, String payee_idcard, Integer money_state, Date financial_staff_time) {
        super(financial_staff_id, serial_num, employee_id, financial_staff_state, payee_num, payee_name, payee_idcard, money_state, financial_staff_time);
    }

    public FinancialStaffExample() {
    }
}