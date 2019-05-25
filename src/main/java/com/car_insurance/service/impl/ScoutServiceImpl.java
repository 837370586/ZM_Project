package com.car_insurance.service.impl;

import com.car_insurance.entity.ScoutExample;
import com.car_insurance.mapper.ScoutMapper;
import com.car_insurance.service.ScoutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/*
* 张凌宇
*
* */
@Service
public class ScoutServiceImpl implements ScoutService{
    @Resource
    private ScoutMapper sm;
   public List<ScoutExample> selectAllScout(){
        return sm.selectAllScout();
    }
}
