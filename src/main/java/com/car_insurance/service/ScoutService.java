package com.car_insurance.service;

import com.car_insurance.entity.*;

import java.util.List;
/*
* 张凌宇
*
* */

 public interface ScoutService {
    //查询订单表,看字段内是否有内容
    List<ScoutExample> selectAllScout();
    //模糊查询,输入订单号查询指定审核的订单
    List<ScoutExample> selectOne(int scout_num);
    //查询接口里的内容
    List<InterviceExample> selectAllIntervice();
    //连表查询需要跟接口表比对的字段
    //List<ScoutExample> selectPrice();
    //直接查询指定零件损坏表
    List<DamagedPartsExample> selectOneParts(String scout_id);
    //查询所有勘探员工信息(在员工表里连表查)
    List<EmployeeTableExample> selectAllCheckPeople();
    //根据输入的勘探员id查询指定的勘探员信息
    List<EmployeeTableExample> selectOneCheck(int employee_id);
    //删除指定勘探人员资料
    void deleatOne(int employee_id);
    //编辑勘探员信息
    void updateOne(Integer employee_id,String employee_name,String employee_tel);
    //往最后一张表里存最后的所有信息
    void insertInto(Integer employee_id, String polocyNumber, String scout_id, String scout_time
            , int accident_type_id, String accidentphoto, String loss_situation, String responsibility_judgment);
    //往最后一张表里添加原因字段
    void inserInto2(String reson,String scout_id);

    //查最后一张表
    List<FinallyscoutExample> selectFinally();
}
