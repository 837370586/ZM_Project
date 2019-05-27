package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class InterviceExample extends Intervice {
    private Integer scout_id;

    public Integer getScout_id() {
        return scout_id;
    }

    public void setScout_id(Integer scout_id) {
        this.scout_id = scout_id;
    }

    public InterviceExample(Integer num, String goods_name, Double goods_price, Integer scout_id) {
        super(num, goods_name, goods_price);
        this.scout_id = scout_id;
    }

    public InterviceExample() {
    }
}