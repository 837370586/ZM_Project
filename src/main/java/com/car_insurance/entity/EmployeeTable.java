package com.car_insurance.entity;

public class EmployeeTable {
    private Integer employeeId;

    private String employeeName;

    private String employeeTel;

    private String employeeSex;

    private Integer roleId;

    public EmployeeTable(Integer employeeId, String employeeName, String employeeTel, String employeeSex, Integer roleId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeTel = employeeTel;
        this.employeeSex = employeeSex;
        this.roleId = roleId;
    }

    public EmployeeTable() {
        super();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel == null ? null : employeeTel.trim();
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex == null ? null : employeeSex.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}