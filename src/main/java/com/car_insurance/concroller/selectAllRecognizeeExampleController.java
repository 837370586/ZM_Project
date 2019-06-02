package com.car_insurance.concroller;

import com.car_insurance.entity.*;
import com.car_insurance.service.RecognizeeExampleService;
import com.car_insurance.service.impl.RecognizeeExampleServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
* 胡敏
* */
@Controller

public class selectAllRecognizeeExampleController {
    @Resource
    private RecognizeeExampleService res;
    //根据车牌号查的方法
    @RequestMapping("/RecognizeeExampleShow")
    public String showselectAllRecognizeeExampleController(Model model ,String carid){
        System.out.println("这是胡敏的controller层根据车牌号查的方法"+carid);
        model.addAttribute("showList",res.selectAllRecognizeeExample(carid));
        System.out.println("model下面");
        return "sys/plate";
    }
    //查询被保险人的方法  因为加分页这个方法就不用了
    /*@RequestMapping("/RecognizeeShow")
    public String selectAllRecognizeeController(Model model, String recognizee_idcard){

        System.out.println("这是胡敏的controller层查询被保险人的方法"+recognizee_idcard);

    model.addAttribute("selectList",res.selectAllRecognizee(recognizee_idcard));

        return "sys/warranty";
    }*/

    //查询保险详细信息
    /*@RequestMapping("InsuranceExampleShow")
    public  String selectAllInsuranceExampleController(Model model ,Integer Insurance_id){
        System.out.println("这是胡敏的controller层查询保险详细信息的方法");
        model.addAttribute("selectAll",res.selectAllInsuranceExample(Insurance_id));
        return "sys/guarantee_slip";
    }*/
    //添加的方法 生成工单
@RequestMapping("insertOneShow")
    public String addWorkorderController(Model model,WorkOrderExample workOrderExample){

    System.out.println("这是工单生成的方法"+workOrderExample.getEmployee_id());
    System.out.println("这是工单生成的方法"+workOrderExample.getPolicyNumber());
    System.out.println("这是工单生成的方法"+workOrderExample.getAccident_spot());
           /*非空判断 因为第一次进页面都是空的*/
    if (workOrderExample.getEmployee_id()!=null && !workOrderExample.getPolicyNumber().equals("") && !workOrderExample.getAccident_spot().equals("")){
        System.out.println("asd");
        res.addWorkorder(workOrderExample);

    }
        return "sys/work_order";

    }



          //分页插件 同时查被查询被保险人的方法
        @RequestMapping("/getAllPerson")
        public String getAllPerson(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum ,String recognizee_idcard){
            PageHelper.startPage(pageNum,5);
            List<RecognizeeExample > list = res.selectAllRecognizee( recognizee_idcard);
            PageInfo<RecognizeeExample> pageInfo = new PageInfo<RecognizeeExample>(list);
            model.addAttribute("pageInfo",pageInfo);
            System.out.println("这是胡敏的controller层f分页查询被保险人的方法"+recognizee_idcard);
            return "sys/warranty";
        }
    //分页插件 同时查被查询被保险详细信息的方法
    @RequestMapping("/InsuranceExampleShow")
    public String selectAllInsuranceExampleController(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum ,Integer Insurance_id){
        PageHelper.startPage(pageNum,3);
        List<InsuranceExample> list = res.selectAllInsuranceExample( Insurance_id);
        PageInfo<InsuranceExample> pageInfo = new PageInfo<InsuranceExample>(list);
        model.addAttribute("pageInfo",pageInfo);
        System.out.println("这是胡敏的controller层f分页查询被保险的方法"+Insurance_id);
        return "sys/guarantee_slip";
    }
//分页查询工单的方法
    @RequestMapping("/WorkOrderExampleShow")
    public String selectWorkOderController(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum ){
        PageHelper.startPage(pageNum,3);
        List<WorkOrderExample> list = res.selectWorkOder();
        PageInfo<WorkOrderExample> pageInfo = new PageInfo<WorkOrderExample>(list);
        model.addAttribute("pageInfo",pageInfo);
        System.out.println("这是胡敏的controller层分页查询工单的方法");
        return "sys/select_work_oder";
    }
    //添加勘察信息
    @RequestMapping("/addScoutExampleShow")
    public String addScoutExampleController(Model model,ScoutExample scoutExample){

            res.addScoutExample(scoutExample);
            System.out.println("这是添加勘察信息的的方法");
            return "sys/exploration_Add";

    }




}
