package com.car_insurance.entity;

public class Role {
    private Integer roleId;

    private String roleName;

    private String qwe;

    public Role(Integer roleId, String roleName, String qwe) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.qwe = qwe;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getQwe() {
        return qwe;
    }

    public void setQwe(String qwe) {
        this.qwe = qwe == null ? null : qwe.trim();
    }
}