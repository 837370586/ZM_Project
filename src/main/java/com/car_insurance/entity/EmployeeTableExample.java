package com.car_insurance.entity;




public class EmployeeTableExample extends  EmployeeTable {
    private  RoleExample role;
    private EmployeeRoleExample employee;
    private LimitsExample limiits;
    private RolelimitsExample rolelimit;

    public RoleExample getRole() {
        return role;
    }

    public void setRole(RoleExample role) {
        this.role = role;
    }

    public EmployeeRoleExample getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeRoleExample employee) {
        this.employee = employee;
    }

    public LimitsExample getLimiits() {
        return limiits;
    }

    public void setLimiits(LimitsExample limiits) {
        this.limiits = limiits;
    }

    public RolelimitsExample getRolelimit() {
        return rolelimit;
    }

    public void setRolelimit(RolelimitsExample rolelimit) {
        this.rolelimit = rolelimit;
    }
}