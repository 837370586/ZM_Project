package com.car_insurance.entity;

public class Intervice {
    private Integer num;

    private String carid;

    private String vin;

    private String recognizee_idcard;

    private String payee_num;

    private String payee_name;

    private String payee_idcard;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getRecognizee_idcard() {
        return recognizee_idcard;
    }

    public void setRecognizee_idcard(String recognizee_idcard) {
        this.recognizee_idcard = recognizee_idcard;
    }

    public String getPayee_num() {
        return payee_num;
    }

    public void setPayee_num(String payee_num) {
        this.payee_num = payee_num;
    }

    public String getPayee_name() {
        return payee_name;
    }

    public void setPayee_name(String payee_name) {
        this.payee_name = payee_name;
    }

    public String getPayee_idcard() {
        return payee_idcard;
    }

    public void setPayee_idcard(String payee_idcard) {
        this.payee_idcard = payee_idcard;
    }

    public Intervice(Integer num, String carid, String vin, String recognizee_idcard, String payee_num, String payee_name, String payee_idcard) {
        this.num = num;
        this.carid = carid;
        this.vin = vin;
        this.recognizee_idcard = recognizee_idcard;
        this.payee_num = payee_num;
        this.payee_name = payee_name;
        this.payee_idcard = payee_idcard;
    }
    public Intervice(){

    }
}