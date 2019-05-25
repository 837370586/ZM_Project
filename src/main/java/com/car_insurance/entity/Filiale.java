package com.car_insurance.entity;

public class Filiale {
    private Integer filiale_id;

    private Integer filiale_num;

    private String filiale_name;

    private String filiale_adress;

    public Integer getFiliale_id() {
        return filiale_id;
    }

    public void setFiliale_id(Integer filiale_id) {
        this.filiale_id = filiale_id;
    }

    public Integer getFiliale_num() {
        return filiale_num;
    }

    public void setFiliale_num(Integer filiale_num) {
        this.filiale_num = filiale_num;
    }

    public String getFiliale_name() {
        return filiale_name;
    }

    public void setFiliale_name(String filiale_name) {
        this.filiale_name = filiale_name;
    }

    public String getFiliale_adress() {
        return filiale_adress;
    }

    public void setFiliale_adress(String filiale_adress) {
        this.filiale_adress = filiale_adress;
    }

    public Filiale(Integer filiale_id, Integer filiale_num, String filiale_name, String filiale_adress) {
        this.filiale_id = filiale_id;
        this.filiale_num = filiale_num;
        this.filiale_name = filiale_name;
        this.filiale_adress = filiale_adress;
    }
}