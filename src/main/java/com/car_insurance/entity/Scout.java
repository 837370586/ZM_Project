package com.car_insurance.entity;

import java.util.Date;

public class Scout {
    private String scout_id;

    private Integer scout_num;

    private String scout_time;

    private Integer accident_type_id;

    private String accidentPhoto;

    private Integer recognizee_id;

    private String loss_situation;

    private String responsibility_judgment;

    private Integer state_id;

    private String glass;

    private String tire;

    private String carDoor;

    private String engineId;

    private String bumper;

    private Double tiremoney;


    private Double carDoormoney;

    private Double engineIdmoney;

    private Double bumpermoney;

    private Double glassmoney;

    public Scout(String scout_id, Integer scout_num, String scout_time, Integer accident_type_id, String accidentPhoto, Integer recognizee_id, String loss_situation, String responsibility_judgment, Integer state_id, String glass, String tire, String carDoor, String engineId, String bumper, Double tiremoney, Double carDoormoney, Double engineIdmoney, Double bumpermoney, Double glassmoney) {
        this.scout_id = scout_id;
        this.scout_num = scout_num;
        this.scout_time = scout_time;
        this.accident_type_id = accident_type_id;
        this.accidentPhoto = accidentPhoto;
        this.recognizee_id = recognizee_id;
        this.loss_situation = loss_situation;
        this.responsibility_judgment = responsibility_judgment;
        this.state_id = state_id;
        this.glass = glass;
        this.tire = tire;
        this.carDoor = carDoor;
        this.engineId = engineId;
        this.bumper = bumper;
        this.tiremoney = tiremoney;
        this.carDoormoney = carDoormoney;
        this.engineIdmoney = engineIdmoney;
        this.bumpermoney = bumpermoney;
        this.glassmoney = glassmoney;
    }

    public Scout() {
    }

    public String getScout_id() {
        return scout_id;
    }

    public void setScout_id(String scout_id) {
        this.scout_id = scout_id;
    }

    public Integer getScout_num() {
        return scout_num;
    }

    public void setScout_num(Integer scout_num) {
        this.scout_num = scout_num;
    }

    public String getScout_time() {
        return scout_time;
    }

    public void setScout_time(String scout_time) {
        this.scout_time = scout_time;
    }

    public Integer getAccident_type_id() {
        return accident_type_id;
    }

    public void setAccident_type_id(Integer accident_type_id) {
        this.accident_type_id = accident_type_id;
    }

    public String getAccidentPhoto() {
        return accidentPhoto;
    }

    public void setAccidentPhoto(String accidentPhoto) {
        this.accidentPhoto = accidentPhoto;
    }

    public Integer getRecognizee_id() {
        return recognizee_id;
    }

    public void setRecognizee_id(Integer recognizee_id) {
        this.recognizee_id = recognizee_id;
    }

    public String getLoss_situation() {
        return loss_situation;
    }

    public void setLoss_situation(String loss_situation) {
        this.loss_situation = loss_situation;
    }

    public String getResponsibility_judgment() {
        return responsibility_judgment;
    }

    public void setResponsibility_judgment(String responsibility_judgment) {
        this.responsibility_judgment = responsibility_judgment;
    }

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getCarDoor() {
        return carDoor;
    }

    public void setCarDoor(String carDoor) {
        this.carDoor = carDoor;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getBumper() {
        return bumper;
    }

    public void setBumper(String bumper) {
        this.bumper = bumper;
    }

    public double getTiremoney() {
        return tiremoney;
    }

    public void setTiremoney(double tiremoney) {
        this.tiremoney = tiremoney;
    }

    public double getCarDoormoney() {
        return carDoormoney;
    }

    public void setCarDoormoney(double carDoormoney) {
        this.carDoormoney = carDoormoney;
    }

    public double getEngineIdmoney() {
        return engineIdmoney;
    }

    public void setEngineIdmoney(double engineIdmoney) {
        this.engineIdmoney = engineIdmoney;
    }

    public double getBumpermoney() {
        return bumpermoney;
    }

    public void setBumpermoney(double bumpermoney) {
        this.bumpermoney = bumpermoney;
    }

    public double getGlassmoney() {
        return glassmoney;
    }

    public void setGlassmoney(double glassmoney) {
        this.glassmoney = glassmoney;
    }
}