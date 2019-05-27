package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class InterviceExample extends Intervice {

    private Scout scout;

    private StateAssociated stateAssociated;

    public Scout getScout() {
        return scout;
    }

    public void setScout(Scout scout) {
        this.scout = scout;
    }

    public StateAssociated getStateAssociated() {
        return stateAssociated;
    }

    public void setStateAssociated(StateAssociated stateAssociated) {
        this.stateAssociated = stateAssociated;
    }

//    public InterviceExample(Integer scout_id, Integer num, String goods_name, Double goods_price, Scout scout, StateAssociated stateAssociated) {
//        super(scout_id, num, goods_name, goods_price);
//        this.scout = scout;
//        this.stateAssociated = stateAssociated;
//    }
//
//    public InterviceExample() {
//    }
}