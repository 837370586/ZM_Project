package com.car_insurance.entity;

public class EmployeeRole {
    private Integer employee_role_id;

    private Integer employee_id;

    private Integer role_id;

    public Integer getEmployee_role_id() {
        return employee_role_id;
    }

    public void setEmployee_role_id(Integer employee_role_id) {
        this.employee_role_id = employee_role_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public EmployeeRole(Integer employee_role_id, Integer employee_id, Integer role_id) {
        this.employee_role_id = employee_role_id;
        this.employee_id = employee_id;
        this.role_id = role_id;
    }
    public EmployeeRole(){}
}