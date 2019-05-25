package com.car_insurance.mapper;





import com.car_insurance.entity.EmployeeTableExample;

import java.util.List;

/*
周小东
*/
public interface BossMapper {

    //查询所有员工表
    List<EmployeeTableExample> findAllUser();


}
