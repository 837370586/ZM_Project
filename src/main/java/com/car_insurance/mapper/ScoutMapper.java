package com.car_insurance.mapper;

import com.car_insurance.entity.InterviceExample;
import com.car_insurance.entity.ScoutExample;

import java.util.List;
/*
* 张凌宇
* */
public interface ScoutMapper {
    //查询订单表,看字段内是否有内容
    List<ScoutExample> selectAllScout();
    //查询接口里的内容
    List<InterviceExample> selectAllIntervice();
    //连表查询需要跟接口表比对的字段
    List<ScoutExample> selectPrice();

}
