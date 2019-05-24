package com.car_insurance.service.impl;

import com.car_insurance.mapper.RecognizeeExampleMapper;
import com.car_insurance.service.RecognizeeExampleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecognizeeExampleServiceImpl implements RecognizeeExampleService {

    @Resource
    private RecognizeeExampleMapper  pem;


    public List<RecognizeeExample> selectAllRecognizeeExample() {
        return pem.selectAllRecognizeeExample();
    }
}
