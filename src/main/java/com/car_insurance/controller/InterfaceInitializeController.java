package com.car_insurance.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterfaceInitializeController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/top")
    public String top(){
        return "top";
    }

    @RequestMapping("/left")
    public String left(){
        return "left";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/bottom")
    public String bottom(){
        return "bottom";
    }

    @RequestMapping("/swich")
    public String swich(){
        return "swich";
    }

    @RequestMapping("/exploration_man")
    public String exploration_man(){
        return "exploration_man";
    }


}
