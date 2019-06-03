package com.car_insurance.entity;

public class StateAssociated {
    private Integer state_id;

    private String value;

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StateAssociated(Integer state_id, String value) {
        this.state_id = state_id;
        this.value = value;
    }
    public StateAssociated(){

    }
}