package com.car_insurance.entity;

public class Rolelimits {
    private Integer rolelimitsId;

    private Integer roleId;

    private Integer limitsId;

    public Rolelimits(Integer rolelimitsId, Integer roleId, Integer limitsId) {
        this.rolelimitsId = rolelimitsId;
        this.roleId = roleId;
        this.limitsId = limitsId;
    }

    public Rolelimits() {
        super();
    }

    public Integer getRolelimitsId() {
        return rolelimitsId;
    }

    public void setRolelimitsId(Integer rolelimitsId) {
        this.rolelimitsId = rolelimitsId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getLimitsId() {
        return limitsId;
    }

    public void setLimitsId(Integer limitsId) {
        this.limitsId = limitsId;
    }
}