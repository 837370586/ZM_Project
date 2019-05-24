package com.car_insurance.mapper;

import com.car_insurance.entity.RecognizeeExample;

import java.util.List;

public interface RecognizeeExampleMapper {
    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    List<RecognizeeExample> selectAllRecognizeeExample();

}
