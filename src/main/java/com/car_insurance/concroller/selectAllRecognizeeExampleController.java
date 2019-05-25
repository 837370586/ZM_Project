package com.car_insurance.concroller;

import com.car_insurance.service.RecognizeeExampleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class selectAllRecognizeeExampleController {
    @Resource
    private RecognizeeExampleService  res;
    @RequestMapping()//根据车牌号查
    public String showselectAllRecognizeeExampleController(Model model){

        model.addAttribute("",res.selectAllRecognizeeExample(""));

        return "";
    }
}
