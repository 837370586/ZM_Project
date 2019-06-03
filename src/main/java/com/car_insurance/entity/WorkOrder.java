package com.car_insurance.entity;

public class WorkOrder {
    private Integer work_order_id;

    private Integer employee_id;

    private Integer work_order_number;

    private String policyNumber;

    private String accident_spot;

    public Integer getWork_order_id() {
        return work_order_id;
    }

    public void setWork_order_id(Integer work_order_id) {
        this.work_order_id = work_order_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getWork_order_number() {
        return work_order_number;
    }

    public void setWork_order_number(Integer work_order_number) {
        this.work_order_number = work_order_number;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getAccident_spot() {
        return accident_spot;
    }

    public void setAccident_spot(String accident_spot) {
        this.accident_spot = accident_spot;
    }

    public WorkOrder(Integer work_order_id, Integer employee_id, Integer work_order_number, String policyNumber, String accident_spot) {
        this.work_order_id = work_order_id;
        this.employee_id = employee_id;
        this.work_order_number = work_order_number;
        this.policyNumber = policyNumber;
        this.accident_spot = accident_spot;
    }

    public WorkOrder() {
    }
}