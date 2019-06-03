package com.car_insurance.entity;

import java.util.Date;

public class FinancialStaff {
    private Integer financial_staff_id;

    private Integer serial_num;

    private Integer employee_id;

    private Integer financial_staff_state;

    private String payee_num;

    private String payee_name;

    private String payee_idcard;

    private Integer money_state;

    private Date financial_staff_time;

    public FinancialStaff(Integer financial_staff_id, Integer serial_num, Integer employee_id, Integer financial_staff_state, String payee_num, String payee_name, String payee_idcard, Integer money_state, Date financial_staff_time) {
        this.financial_staff_id = financial_staff_id;
        this.serial_num = serial_num;
        this.employee_id = employee_id;
        this.financial_staff_state = financial_staff_state;
        this.payee_num = payee_num;
        this.payee_name = payee_name;
        this.payee_idcard = payee_idcard;
        this.money_state = money_state;
        this.financial_staff_time = financial_staff_time;
    }

    public FinancialStaff() {
    }
}