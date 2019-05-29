package com.car_insurance.mapper;

import com.car_insurance.entity.InsuranceExample;
import com.car_insurance.entity.Recognizee;
import com.car_insurance.entity.RecognizeeExample;
import com.car_insurance.entity.WorkOrderExample;

import java.util.List;
/*
* 胡敏
* */
public interface RecognizeeExampleMapper {
    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    List<RecognizeeExample> selectAllRecognizeeExample(String carid);

    //生成工单的方法
    public  WorkOrderExample  addWorkorder();

    //查询被保险人的方法
    List<RecognizeeExample> selectAllRecognizee(String recognizee_idcard);

    //查询保险详细信息
    List<InsuranceExample> selectAllInsuranceExample(Integer insurance_id);

}
