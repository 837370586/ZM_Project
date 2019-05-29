package com.car_insurance.entity;

import java.util.Date;

public class Scout {
    private Integer scout_id;

    private Integer scout_num;

    private Date scout_time;

    private Integer accident_type_id;

    private String accidentPhoto;

    private Integer recognizee_id;

    private String loss_situation;

    private String responsibility_judgment;

    public Scout(Integer scout_id, Integer scout_num, Date scout_time, Integer accident_type_id, String accidentPhoto, Integer recognizee_id, String loss_situation, String responsibility_judgment) {
        this.scout_id = scout_id;
        this.scout_num = scout_num;
        this.scout_time = scout_time;
        this.accident_type_id = accident_type_id;
        this.accidentPhoto = accidentPhoto;
        this.recognizee_id = recognizee_id;
        this.loss_situation = loss_situation;
        this.responsibility_judgment = responsibility_judgment;
    }

    public Scout() {
    }

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

}