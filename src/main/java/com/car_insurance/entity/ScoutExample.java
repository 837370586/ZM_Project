package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoutExample extends Scout {
    public ScoutExample(Integer scout_id, Integer scout_num, Date scout_time, Integer accident_type_id, String accidentphoto, Integer recognizee_id, String loss_situation, String responsibility_judgment, String goods_name, Double goods_price) {
        super(scout_id, scout_num, scout_time, accident_type_id, accidentphoto, recognizee_id, loss_situation, responsibility_judgment, goods_name, goods_price);
    }

    public ScoutExample() {
    }
}