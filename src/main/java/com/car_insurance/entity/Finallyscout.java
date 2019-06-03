package com.car_insurance.entity;

public class Finallyscout {

    private String reson;

    public String getReson() {
        return reson;
    }

    public void setReson(String reson) {
        this.reson = reson;
    }

    private Integer num;

    private String scout_id;

    private Integer employee_id;

    private String polocyNumber;

    private String scout_time;

    private Integer accident_type_id;

    private String accidentphoto;

    private String loss_situation;

    private String responsibility_judgment;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getScout_id() {
        return scout_id;
    }

    public void setScout_id(String scout_id) {
        this.scout_id = scout_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getPolocyNumber() {
        return polocyNumber;
    }

    public void setPolocyNumber(String polocyNumber) {
        this.polocyNumber = polocyNumber;
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

    public String getAccidentphoto() {
        return accidentphoto;
    }

    public void setAccidentphoto(String accidentphoto) {
        this.accidentphoto = accidentphoto;
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

    public Finallyscout(String reson, Integer num, String scout_id, Integer employee_id, String polocyNumber, String scout_time, Integer accident_type_id, String accidentphoto, String loss_situation, String responsibility_judgment) {
        this.reson = reson;
        this.num = num;
        this.scout_id = scout_id;
        this.employee_id = employee_id;
        this.polocyNumber = polocyNumber;
        this.scout_time = scout_time;
        this.accident_type_id = accident_type_id;
        this.accidentphoto = accidentphoto;
        this.loss_situation = loss_situation;
        this.responsibility_judgment = responsibility_judgment;
    }

    public Finallyscout(){

    }
}