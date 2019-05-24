package com.car_insurance.entity;

public class WorkOrder {
    private Integer workOrderId;

    private Integer employeeId;

    private Integer workOrderNumber;

    private Integer recognizeeId;

    private String accidentSpot;

    public WorkOrder(Integer workOrderId, Integer employeeId, Integer workOrderNumber, Integer recognizeeId, String accidentSpot) {
        this.workOrderId = workOrderId;
        this.employeeId = employeeId;
        this.workOrderNumber = workOrderNumber;
        this.recognizeeId = recognizeeId;
        this.accidentSpot = accidentSpot;
    }

    public WorkOrder() {
        super();
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(Integer workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    public Integer getRecognizeeId() {
        return recognizeeId;
    }

    public void setRecognizeeId(Integer recognizeeId) {
        this.recognizeeId = recognizeeId;
    }

    public String getAccidentSpot() {
        return accidentSpot;
    }

    public void setAccidentSpot(String accidentSpot) {
        this.accidentSpot = accidentSpot == null ? null : accidentSpot.trim();
    }
}