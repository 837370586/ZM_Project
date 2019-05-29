package com.car_insurance.service.impl;

import com.car_insurance.entity.InsuranceExample;
import com.car_insurance.entity.Recognizee;
import com.car_insurance.entity.RecognizeeExample;
import com.car_insurance.entity.WorkOrderExample;
import com.car_insurance.mapper.RecognizeeExampleMapper;
import com.car_insurance.service.RecognizeeExampleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/*
* 胡敏
* */
@Service
public class RecognizeeExampleServiceImpl implements RecognizeeExampleService {

    @Resource
    private RecognizeeExampleMapper  pem;

    //查询所有的方法，主要是通过客户提供的车牌号查投保信息
    public List<RecognizeeExample> selectAllRecognizeeExample(String carid) {

        return pem.selectAllRecognizeeExample(carid);
    }

    //生成工单的方法
    public WorkOrderExample  addWorkorder() {
        return pem.addWorkorder( );
    }


    //查询被保险人的方法
    public List<RecognizeeExample> selectAllRecognizee(String recognizee_idcard) {

        return pem.selectAllRecognizee(recognizee_idcard);
    }

    //查询保险详细信息
    public List<InsuranceExample> selectAllInsuranceExample(Integer insurance_id) {

        return pem.selectAllInsuranceExample(insurance_id);
    }
}
