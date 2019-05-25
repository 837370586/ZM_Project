package com.car_insurance.mapper;

import com.car_insurance.entity.RecognizeeExample;

import java.util.List;
/*
* 胡敏
* */
public interface RecognizeeExampleMapper {
    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    List<RecognizeeExample> selectAllRecognizeeExample(String carid);

    //生成订单的方法
    public  void addWorkorder();

}
