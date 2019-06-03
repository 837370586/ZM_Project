package com.car_insurance.entity;

public class Damaged_parts {
    private Integer parts_id;
    private  String scout_id;
    private  String parts_goodsname;
    private  Double parts_goodsprice;

    public Damaged_parts(Integer parts_id, String scout_id, String parts_goodsname, Double parts_goodsprice) {
        this.parts_id = parts_id;
        this.scout_id = scout_id;
        this.parts_goodsname = parts_goodsname;
        this.parts_goodsprice = parts_goodsprice;
    }

    public Damaged_parts() {
    }

    public Integer getParts_id() {
        return parts_id;
    }

    public void setParts_id(Integer parts_id) {
        this.parts_id = parts_id;
    }

    public String getScout_id() {
        return scout_id;
    }

    public void setScout_id(String scout_id) {
        this.scout_id = scout_id;
    }

    public String getParts_goodsname() {
        return parts_goodsname;
    }

    public void setParts_goodsname(String parts_goodsname) {
        this.parts_goodsname = parts_goodsname;
    }

    public Double getParts_goodsprice() {
        return parts_goodsprice;
    }

    public void setParts_goodsprice(Double parts_goodsprice) {
        this.parts_goodsprice = parts_goodsprice;
    }
}
