package com.car_insurance.entity;

public class EmployeeTable {
    private Integer employee_id;

    private String employee_name;

    private String employee_tel;

    private String employee_sex;

    private Integer role_id;

    public String getEmployee_tel() {
        return employee_tel;
    }

    public void setEmployee_tel(String employee_tel) {
        this.employee_tel = employee_tel;
    }

    public String getEmployee_sex() {
        return employee_sex;
    }

    public void setEmployee_sex(String employee_sex) {
        this.employee_sex = employee_sex;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public EmployeeTable(Integer employee_id, String employee_name, String employee_tel, String employee_sex, Integer role_id) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_tel = employee_tel;
        this.employee_sex = employee_sex;
        this.role_id = role_id;
    }
}