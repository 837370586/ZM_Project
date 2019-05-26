package com.car_insurance.service.impl;

import com.car_insurance.entity.Recognizee;
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
public class RecognizeeExampleServiceImpl implements RecognizeeExampleService {

    @Resource
    private RecognizeeExampleMapper  pem;


    public List<RecognizeeExample> selectAllRecognizeeExample(String carid) {

        return pem.selectAllRecognizeeExample(carid);
    }

    @Override
    public void addWorkorder() {

    }


    @Override
    public List<Recognizee> selectAllRecognizee(String applicant_idcard) {
        return null;
    }
}
