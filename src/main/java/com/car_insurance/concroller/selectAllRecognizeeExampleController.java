package com.car_insurance.concroller;

import com.car_insurance.service.RecognizeeExampleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/*
* 胡敏
* */
@Controller
public class selectAllRecognizeeExampleController {
    @Resource
    private RecognizeeExampleService  res;
    @RequestMapping("/RecognizeeExampleShow")//根据车牌号查
    public String showselectAllRecognizeeExampleController(Model model){
        System.out.println("这是胡敏的controller层");
        model.addAttribute("showList",res.selectAllRecognizeeExample(""));

        return "showList";
    }
}
