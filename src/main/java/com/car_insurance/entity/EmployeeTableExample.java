package com.car_insurance.entity;



public class EmployeeTableExample extends  EmployeeTable {

    private EmployeeRole employeeRole;
    private Role role;


    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        this.employeeRole = employeeRole;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}