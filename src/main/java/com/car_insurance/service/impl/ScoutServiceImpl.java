package com.car_insurance.service.impl;


import com.car_insurance.entity.*;
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


    //查询所有订单
    public List<ScoutExample> selectAllScout(){
        return sm.selectAllScout();
    }


    //模糊查询,输入订单号查询指定审核的订单
    public List<ScoutExample> selectOne(int scout_num){
        return sm.selectOne(scout_num);
    }

    //查接口表
    public List<InterviceExample> selectAllIntervice(){
        return sm.selectAllIntervice();
    }


    // 直接查询指定零件损坏表
    public List<DamagedPartsExample> selectOneParts(String scout_id){

        return sm.selectOneParts(scout_id);
    }

    //查询所有勘探员工信息(在员工表里连表查)
    public List<EmployeeTableExample> selectAllCheckPeople(){
        System.out.print( sm.selectAllCheckPeople().get(0).getEmployee_name());
        System.out.print( sm.selectAllCheckPeople().get(0).getExploration_status_id());
        return sm.selectAllCheckPeople();
    }

    //根据输入的勘探员id查询指定的勘探员信息
    public List<EmployeeTableExample> selectOneCheck(int employee_id){
        return sm.selectOneCheck(employee_id);
    }

    //删除指定勘探人员资料
    public void deleatOne(int employee_id){
        sm.deleatOne(employee_id);
    }

    //编辑勘探员信息
    public void updateOne(Integer employee_id,String employee_name,String employee_tel){
        sm.updateOne(employee_id,employee_name,employee_tel);
    }

    //往最后一张表里存最后的所有信息
    public void insertInto(Integer employee_id, String polocyNumber, String scout_id, String scout_time
            , int accident_type_id, String accidentphoto, String loss_situation, String responsibility_judgment){
        sm.insertInto(employee_id,polocyNumber,scout_id,scout_time,accident_type_id,accidentphoto,loss_situation,responsibility_judgment);
    }
    //往最后一张表里添加原因字段
    public  void inserInto2(String reson,String scout_id){
        sm.inserInto2(reson,scout_id);
    }

    //查最后一张表
    public  List<FinallyscoutExample> selectFinally(){
       return sm.selectFinally();
    }



}
