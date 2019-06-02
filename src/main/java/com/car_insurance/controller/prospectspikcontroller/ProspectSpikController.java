package com.car_insurance.controller.prospectspikcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProspectSpikController {

    @RequestMapping("/insureMan")
    //投保人信息
    public String applicant(Model Model) {


        return "insure_man";
    }

    @RequestMapping("/guaranteeSlip")
    //查询保单信息
    public String GuaranteeSlip(Model Model) {

        return "warranty";
    }

    @RequestMapping("/select_staff")
    //查询员工信息
    public String select_staff(Model Model) {

        return "select_staff";
    }

    @RequestMapping("/selectWorkOder")
    //查询工单
    public String select_work_oder(Model Model) {

        return "select_work_oder";
    }


    @RequestMapping("/exploration_order")
    //勘探订单
    public String exploration_order(Model Model) {

        return "exploration_order";
    }
}
