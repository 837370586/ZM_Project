package com.car_insurance.entity;

public class ExplorationStatus {
    private Integer exploration_status_id;

    private String exploration_status_name;

    public Integer getExploration_status_id() {
        return exploration_status_id;
    }

    public void setExploration_status_id(Integer exploration_status_id) {
        this.exploration_status_id = exploration_status_id;
    }

    public String getExploration_status_name() {
        return exploration_status_name;
    }

    public void setExploration_status_name(String exploration_status_name) {
        this.exploration_status_name = exploration_status_name;
    }

    public ExplorationStatus(Integer exploration_status_id, String exploration_status_name) {
        this.exploration_status_id = exploration_status_id;
        this.exploration_status_name = exploration_status_name;
    }
}