package com.car_insurance.concroller;

import com.car_insurance.entity.Insurance;
import com.car_insurance.service.impl.RecognizeeExampleServiceImpl;
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
    private RecognizeeExampleServiceImpl res;
    //根据车牌号查的方法
    @RequestMapping("/RecognizeeExampleShow")
    public String showselectAllRecognizeeExampleController(Model model ,String carid){
        System.out.println("这是胡敏的controller层根据车牌号查的方法"+carid);
        model.addAttribute("showList",res.selectAllRecognizeeExample(carid));
        System.out.println("model下面");
        return "sys/plate";
    }
    //查询被保险人的方法
    @RequestMapping("/RecognizeeShow")
    public String selectAllRecognizeeController(Model model, String recognizee_idcard){

        System.out.println("这是胡敏的controller层查询被保险人的方法"+recognizee_idcard);

    model.addAttribute("selectList",res.selectAllRecognizee(recognizee_idcard));

        return "sys/warranty";
    }

    //查询保险详细信息
    @RequestMapping("InsuranceExampleShow")
    public  String selectAllInsuranceExampleController(Model model ,Integer Insurance_id){
        System.out.println("这是胡敏的controller层查询保险详细信息的方法");
        model.addAttribute("selectAll",res.selectAllInsuranceExample(Insurance_id));
        return "sys/guarantee_slip";
    }
    //添加的方法
@RequestMapping("insertOneShow")
    public String addWorkorderController(){

        return "insertOne";

    }

}
