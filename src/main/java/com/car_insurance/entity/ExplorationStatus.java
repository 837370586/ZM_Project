package com.car_insurance.entity;

public class ExplorationStatus {
    private Integer explorationStatusId;

    private String explorationStatusName;

    public ExplorationStatus(Integer explorationStatusId, String explorationStatusName) {
        this.explorationStatusId = explorationStatusId;
        this.explorationStatusName = explorationStatusName;
    }

    public ExplorationStatus() {
        super();
    }

    public Integer getExplorationStatusId() {
        return explorationStatusId;
    }

    public void setExplorationStatusId(Integer explorationStatusId) {
        this.explorationStatusId = explorationStatusId;
    }

    public String getExplorationStatusName() {
        return explorationStatusName;
    }

    public void setExplorationStatusName(String explorationStatusName) {
        this.explorationStatusName = explorationStatusName == null ? null : explorationStatusName.trim();
    }
}