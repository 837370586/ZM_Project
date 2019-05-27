package com.car_insurance.entity;

import java.util.Date;

public class Scout {
    private Integer scout_id;

    private Integer scout_num;

    private Date scout_time;

    private Integer accident_type_id;

    private String accidentphoto;

    private Integer recognizee_id;

    private String loss_situation;

    private String responsibility_judgment;

    private String accidentgoods_name;

    private Double accidentgoods_price;

    private Integer state_id;

    public Integer getScout_id() {
        return scout_id;
    }

    public void setScout_id(Integer scout_id) {
        this.scout_id = scout_id;
    }

    public Integer getScout_num() {
        return scout_num;
    }

    public void setScout_num(Integer scout_num) {
        this.scout_num = scout_num;
    }

    public Date getScout_time() {
        return scout_time;
    }

    public void setScout_time(Date scout_time) {
        this.scout_time = scout_time;
    }

    public Integer getAccident_type_id() {
        return accident_type_id;
    }

    public void setAccident_type_id(Integer accident_type_id) {
        this.accident_type_id = accident_type_id;
    }

    public String getAccidentphoto() {
        return accidentphoto;
    }

    public void setAccidentphoto(String accidentphoto) {
        this.accidentphoto = accidentphoto;
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

    public String getAccidentgoods_name() {
        return accidentgoods_name;
    }

    public void setAccidentgoods_name(String accidentgoods_name) {
        this.accidentgoods_name = accidentgoods_name;
    }

    public Double getAccidentgoods_price() {
        return accidentgoods_price;
    }

    public void setAccidentgoods_price(Double accidentgoods_price) {
        this.accidentgoods_price = accidentgoods_price;
    }

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public Scout() {
    }

    public Scout(Integer scout_id, Integer scout_num, Date scout_time, Integer accident_type_id, String accidentphoto, Integer recognizee_id, String loss_situation, String responsibility_judgment, String accidentgoods_name, Double accidentgoods_price, Integer state_id) {
        this.scout_id = scout_id;
        this.scout_num = scout_num;
        this.scout_time = scout_time;
        this.accident_type_id = accident_type_id;
        this.accidentphoto = accidentphoto;
        this.recognizee_id = recognizee_id;
        this.loss_situation = loss_situation;
        this.responsibility_judgment = responsibility_judgment;
        this.accidentgoods_name = accidentgoods_name;
        this.accidentgoods_price = accidentgoods_price;
        this.state_id = state_id;
    }
}