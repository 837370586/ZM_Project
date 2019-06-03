package com.car_insurance.entity;


public class EmployeeTableExample extends EmployeeTable {
    private Role role;


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public EmployeeTableExample(Integer employee_id, String employee_name, String employee_tel, String employee_sex, Integer role_id, Integer exploration_status_id, Role role) {
        super(employee_id, employee_name, employee_tel, employee_sex, role_id, exploration_status_id);
        this.role = role;
    }

    public EmployeeTableExample(Role role) {
        this.role = role;
    }
    public EmployeeTableExample(){

    }
}