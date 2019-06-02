package com.car_insurance.controller;

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
    public String showScout(Model model) {
        model.addAttribute("scoutList", sse.selectAllScout());
        System.out.print(sse.selectAllScout().get(0).getScout_num());
        return "scoutList";
    }

    //查询接口表内容
    @RequestMapping("/interviceShow")
    public String ShowIntervice(Model model) {
        model.addAttribute("interviceList", sse.selectAllIntervice());
        System.out.print(sse.selectAllIntervice().get(0).getGoods_name());
        return "interviceList";
    }

    //连表查询订单表对比接口表里零件价格
    @RequestMapping("/compairShow")
    public Model compairShow(Model model) {
        System.out.println("第一次");
        model.addAttribute("compairList", sse.selectPrice());
        System.out.println(sse.selectPrice().get(0).getAccidentgoods_name());
        System.out.println("第二次");
        return model;
    }

}
