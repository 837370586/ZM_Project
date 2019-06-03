package com.car_insurance.entity;

public class Intervice {
    private Integer num;

    private String goods_name;

    private Double goods_price;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Double goods_price) {
        this.goods_price = goods_price;
    }

    public Intervice(Integer num, String goods_name, Double goods_price) {
        this.num = num;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
    }
    public Intervice(){


    }
}