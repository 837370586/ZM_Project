package com.car_insurance.service.impl;

import com.car_insurance.entity.RecognizeeExample;
import com.car_insurance.mapper.RecognizeeExampleMapper;
import com.car_insurance.service.RecognizeeExampleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/*
* 胡敏
* */
@Service
public class RecognizeeExampleServiceImpl implements RecognizeeExampleService{

    @Resource
    private RecognizeeExampleMapper  pem;
    //根据车牌号查保险
    public List<RecognizeeExample> selectAllRecognizeeExample(String carid) {
        System.out.println("这是据车牌号查保险的方法");
        return pem.selectAllRecognizeeExample(carid);

    }
     //添加工单
    public  void addWorkorder(){

        System.out.println("这是添加工单的方法");
    }

}

