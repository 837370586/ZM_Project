package com.car_insurance.service;

import com.car_insurance.entity.RecognizeeExample;

import java.util.List;

public interface RecognizeeExampleService {
    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    List<RecognizeeExample> selectAllRecognizeeExample();
}
