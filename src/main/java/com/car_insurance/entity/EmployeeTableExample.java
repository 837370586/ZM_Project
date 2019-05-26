package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTableExample extends  EmployeeTable {

    private EmployeeRole employeeRole;
    private Role role;

    public EmployeeTableExample() {
    }

    public EmployeeTableExample(Integer employee_id, String employee_name, String employee_tel, String employee_sex, Integer role_id, EmployeeRole employeeRole, Role role) {
        super(employee_id, employee_name, employee_tel, employee_sex, role_id);
        this.employeeRole = employeeRole;
        this.role = role;
    }

    public EmployeeTableExample(EmployeeRole employeeRole, Role role) {
        this.employeeRole = employeeRole;
        this.role = role;
    }

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