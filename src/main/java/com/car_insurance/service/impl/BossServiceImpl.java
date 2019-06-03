package com.car_insurance.service.impl;


import com.car_insurance.entity.EmployeeTableExample;
import com.car_insurance.mapper.BossMapper;
import com.car_insurance.service.BossService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
*
* 周小东
* */
@Service
public class BossServiceImpl implements BossService {
    @Resource
    private BossMapper bossMapper;
    //查询所有员工
    public List<EmployeeTableExample> findAllUser() {

        return bossMapper.findAllUser();
    }
}
