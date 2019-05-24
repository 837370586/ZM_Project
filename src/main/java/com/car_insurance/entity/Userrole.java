package com.car_insurance.entity;

public class Userrole {
    private Integer userroleId;

    private Integer userId;

    private Integer roleId;

    public Userrole(Integer userroleId, Integer userId, Integer roleId) {
        this.userroleId = userroleId;
        this.userId = userId;
        this.roleId = roleId;
    }

    public Userrole() {
        super();
    }

    public Integer getUserroleId() {
        return userroleId;
    }

    public void setUserroleId(Integer userroleId) {
        this.userroleId = userroleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}