package com.car_insurance.controller.businessspikcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusinessSpikController {

    @RequestMapping("/warranty")

    //查询表单信息跳转
    public String inquire_GuaranteeSlip(Model Model){

        return "warranty";
    }

    @RequestMapping("/guarantee_slip")
    //查询保险详细信息
    public String insurance (Model Model){

        return "guarantee_slip";
    }

    @RequestMapping("/work_order")
    //工单生成
    public String workOrderGenerated (Model Model){

        return "work_order";
    }
}
