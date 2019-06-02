package com.car_insurance.mapper;

import com.car_insurance.entity.*;

import java.util.List;
/*
* 胡敏
* */
public interface RecognizeeExampleMapper {
    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    List<RecognizeeExample> selectAllRecognizeeExample(String carid);

    //生成工单的方法
    public  void   addWorkorder(WorkOrderExample workOrderExample);

    //查询被保险人的方法
    List<RecognizeeExample> selectAllRecognizee(String recognizee_idcard);

    //查询保险详细信息
    List<InsuranceExample> selectAllInsuranceExample(Integer insurance_id);

    //接受工单
    List<WorkOrderExample>selectWorkOder( );

    //勘察信息添加

    void addScoutExample (ScoutExample scoutExample);

}
