package com.car_insurance.entity;

public class EmployeeRole {
    private Integer employeeRoleId;

    private Integer employeeId;

    private Integer roleId;

    public EmployeeRole(Integer employeeRoleId, Integer employeeId, Integer roleId) {
        this.employeeRoleId = employeeRoleId;
        this.employeeId = employeeId;
        this.roleId = roleId;
    }

    public EmployeeRole() {
        super();
    }

    public Integer getEmployeeRoleId() {
        return employeeRoleId;
    }

    public void setEmployeeRoleId(Integer employeeRoleId) {
        this.employeeRoleId = employeeRoleId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}