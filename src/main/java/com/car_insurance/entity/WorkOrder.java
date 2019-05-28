package com.car_insurance.entity;

public class WorkOrder {
    private Integer work_order_id;

    private Integer employee_id;

    private Integer workOrder_number;

    private Integer recognizee_id;

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

    public Integer getWorkOrder_number() {
        return workOrder_number;
    }

    public void setWorkOrder_number(Integer workOrder_number) {
        this.workOrder_number = workOrder_number;
    }

    public Integer getRecognizee_id() {
        return recognizee_id;
    }

    public void setRecognizee_id(Integer recognizee_id) {
        this.recognizee_id = recognizee_id;
    }

    public String getAccident_spot() {
        return accident_spot;
    }

    public void setAccident_spot(String accident_spot) {
        this.accident_spot = accident_spot;
    }

    public WorkOrder(Integer work_order_id, Integer employee_id, Integer workOrder_number, Integer recognizee_id, String accident_spot) {
        this.work_order_id = work_order_id;
        this.employee_id = employee_id;
        this.workOrder_number = workOrder_number;
        this.recognizee_id = recognizee_id;
        this.accident_spot = accident_spot;
    }

    public WorkOrder() {
    }
}