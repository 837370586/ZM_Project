package com.car_insurance.concroller;


import com.car_insurance.service.BossService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class BossController {
    @Resource
    private BossService bossService;
    @RequestMapping("qqq")
    public ModelAndView findAllUser(){
        System.out.println(666);
        ModelAndView mv = new ModelAndView("Boss");
        mv.addObject("list",bossService.findAllUser());
        bossService.findAllUser().forEach(yuan-> System.out.println(yuan.getEmployee_name()));
        return mv;
    }

}
