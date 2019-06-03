package com.car_insurance.entity;

public class Finally {
    private Integer finally_id;

    private String scout_goods_name;

    private String intervice_goods_name;

    private Double scout_goods_price;

    private Double intervice_goods_price;

    private String value;

    public Integer getFinally_id() {
        return finally_id;
    }

    public void setFinally_id(Integer finally_id) {
        this.finally_id = finally_id;
    }

    public String getScout_goods_name() {
        return scout_goods_name;
    }

    public void setScout_goods_name(String scout_goods_name) {
        this.scout_goods_name = scout_goods_name;
    }

    public String getIntervice_goods_name() {
        return intervice_goods_name;
    }

    public void setIntervice_goods_name(String intervice_goods_name) {
        this.intervice_goods_name = intervice_goods_name;
    }

    public Double getScout_goods_price() {
        return scout_goods_price;
    }

    public void setScout_goods_price(Double scout_goods_price) {
        this.scout_goods_price = scout_goods_price;
    }

    public Double getIntervice_goods_price() {
        return intervice_goods_price;
    }

    public void setIntervice_goods_price(Double intervice_goods_price) {
        this.intervice_goods_price = intervice_goods_price;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Finally(Integer finally_id, String scout_goods_name, String intervice_goods_name, Double scout_goods_price, Double intervice_goods_price, String value) {
        this.finally_id = finally_id;
        this.scout_goods_name = scout_goods_name;
        this.intervice_goods_name = intervice_goods_name;
        this.scout_goods_price = scout_goods_price;
        this.intervice_goods_price = intervice_goods_price;
        this.value = value;
    }
    public Finally(){

    }
}