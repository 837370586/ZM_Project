package com.car_insurance.entity;

public class Limits {
    private Integer limitsId;

    private String limitsName;

    private String tittle;

    public Limits(Integer limitsId, String limitsName, String tittle) {
        this.limitsId = limitsId;
        this.limitsName = limitsName;
        this.tittle = tittle;
    }

    public Limits() {
        super();
    }

    public Integer getLimitsId() {
        return limitsId;
    }

    public void setLimitsId(Integer limitsId) {
        this.limitsId = limitsId;
    }

    public String getLimitsName() {
        return limitsName;
    }

    public void setLimitsName(String limitsName) {
        this.limitsName = limitsName == null ? null : limitsName.trim();
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }
}