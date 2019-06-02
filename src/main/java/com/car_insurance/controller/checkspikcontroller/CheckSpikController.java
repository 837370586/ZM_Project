package com.car_insurance.controller.checkspikcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckSpikController {

    @RequestMapping("/select_work_oder")
    //查询工单
    public String  inquireWorkOrder(Model Model){

        return "select_work_oder";
    }

    @RequestMapping("/exploration_man")
    //查询勘探员工信息
    public String  prospectStaff (Model Model){

        return "exploration_man";
    }

    @RequestMapping("/exploration_Add")
    //勘探信息增加
    public String  prospectAdd (Model Model){


        return "exploration_Add";
    }
}
