package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoutExample extends Scout{
    public ScoutExample(Integer scout_id, Integer scout_num, Date scout_time, Integer accident_type_id, String accidentPhoto, Integer recognizee_id, String loss_situation, String responsibility_judgment) {
        super(scout_id, scout_num, scout_time, accident_type_id, accidentPhoto, recognizee_id, loss_situation, responsibility_judgment);
    }

    public ScoutExample() {
    }
}