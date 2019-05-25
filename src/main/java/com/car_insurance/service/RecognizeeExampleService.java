package com.car_insurance.service;

import com.car_insurance.entity.Recognizee;
import com.car_insurance.entity.RecognizeeExample;

import java.util.List;
/*
* 胡敏
* */
public interface RecognizeeExampleService {
    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    List<RecognizeeExample> selectAllRecognizeeExample(String carid);
    //生成订单的方法
    public  void addWorkorder();

    //查询被保险人的方法
    List<Recognizee> selectAllRecognizee(String applicant_idcard);
}
