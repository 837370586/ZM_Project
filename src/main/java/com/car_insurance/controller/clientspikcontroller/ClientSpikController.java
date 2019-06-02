package com.car_insurance.controller.clientspikcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientSpikController {

    @RequestMapping("/analyze_ktOrder")
    //分析订单
    public String  analyzeOrder (Model Model){


        return "analyze_ktOrder";
    }

    @RequestMapping("/verify")
    //审核和对
    public String  verifyMessage (Model Model){


        return "verify";
    }
}
