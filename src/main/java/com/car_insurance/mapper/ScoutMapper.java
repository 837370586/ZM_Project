package com.car_insurance.mapper;

import com.car_insurance.entity.ScoutExample;

import java.util.List;
/*
* 张凌宇
* */
public interface ScoutMapper {
    //查询订单表,看字段内是否有内容
    List<ScoutExample> selectAllScout();
}
