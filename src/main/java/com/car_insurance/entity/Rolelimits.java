package com.car_insurance.entity;

public class Rolelimits {
    private Integer rolelimits_id;

    private Integer role_id;

    private Integer limits_id;

    public Rolelimits(Integer rolelimits_id, Integer role_id, Integer limits_id) {
        this.rolelimits_id = rolelimits_id;
        this.role_id = role_id;
        this.limits_id = limits_id;
    }

    public Rolelimits() {
    }

    public Integer getRolelimits_id() {
        return rolelimits_id;
    }

    public void setRolelimits_id(Integer rolelimits_id) {
        this.rolelimits_id = rolelimits_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getLimits_id() {
        return limits_id;
    }

    public void setLimits_id(Integer limits_id) {
        this.limits_id = limits_id;
    }
}