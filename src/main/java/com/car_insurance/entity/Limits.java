package com.car_insurance.entity;

public class Limits {
    private Integer limits_id;

    private String limits_name;

    private String tittle;

    public Integer getLimits_id() {
        return limits_id;
    }

    public void setLimits_id(Integer limits_id) {
        this.limits_id = limits_id;
    }

    public String getLimits_name() {
        return limits_name;
    }

    public void setLimits_name(String limits_name) {
        this.limits_name = limits_name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Limits(Integer limits_id, String limits_name, String tittle) {
        this.limits_id = limits_id;
        this.limits_name = limits_name;
        this.tittle = tittle;
    }

    public Limits() {
    }
}