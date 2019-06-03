package com.car_insurance.entity;

public class EmployeeRoleExample extends EmployeeRole {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public EmployeeRoleExample(Integer employee_role_id, Integer employee_id, Integer role_id) {
        super(employee_role_id, employee_id, role_id);
    }

    public EmployeeRoleExample() {
    }
}