package com.car_insurance.concroller;

import com.car_insurance.service.ScoutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/*
* 张凌宇
* */

@Controller
public class ScoutController {
@Resource
    private ScoutService sse;

//查询订单信息
    @RequestMapping("/scoutShow")
    public String showScout(Model model){
        model.addAttribute("scoutList",sse.selectAllScout());
        System.out.print(sse.selectAllScout().get(0).getScout_num());
        return "scoutList";
    }
    //查询接口表内容
    @RequestMapping("/interviceShow")
    public String ShowIntervice(Model model){
        model.addAttribute("interviceList",sse.selectAllIntervice());
        System.out.print(sse.selectAllIntervice().get(0).getPayee_name());
        return  "interviceList";
    }

}
