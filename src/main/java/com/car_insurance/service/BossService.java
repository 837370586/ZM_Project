package com.car_insurance.service;






import com.car_insurance.entity.EmployeeTableExample;


import java.util.List;

public interface BossService {


    //查询所有员工
    List<EmployeeTableExample > findAllUser();
}
