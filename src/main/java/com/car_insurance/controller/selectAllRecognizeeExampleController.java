package com.car_insurance.controller;

import com.car_insurance.entity.*;
import com.car_insurance.service.RecognizeeExampleService;
import com.car_insurance.service.impl.RecognizeeExampleServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/*
 * 胡敏
 * */
@Controller
public class selectAllRecognizeeExampleController {
    @Resource
    private RecognizeeExampleService res;

    //根据车牌号查的方法
    @RequestMapping("/RecognizeeExampleShow")
    public String showselectAllRecognizeeExampleController(Model model, String carid) {
        System.out.println("这是胡敏的controller层根据车牌号查的方法" + carid);
        model.addAttribute("showList", res.selectAllRecognizeeExample(carid));
        System.out.println("model下面");
        return "plate";
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
    public String addWorkorderController(Model model, WorkOrderExample workOrderExample) {

        System.out.println("这是工单生成的方法" + workOrderExample.getEmployee_id());
        System.out.println("这是工单生成的方法" + workOrderExample.getPolicyNumber());
        System.out.println("这是工单生成的方法" + workOrderExample.getAccident_spot());
        /*非空判断 因为第一次进页面都是空的*/
        if (workOrderExample.getEmployee_id() != null && !workOrderExample.getPolicyNumber().equals("") && !workOrderExample.getAccident_spot().equals("")) {
            System.out.println("asd");
            res.addWorkorder(workOrderExample);

        }
        return "work_order";

    }


    //分页插件 同时查被查询被保险人的方法
    @RequestMapping("/getAllPerson")
    public String getAllPerson(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, String recognizee_idcard) {
        PageHelper.startPage(pageNum, 5);
        List<RecognizeeExample> list = res.selectAllRecognizee(recognizee_idcard);
        PageInfo<RecognizeeExample> pageInfo = new PageInfo<RecognizeeExample>(list);
        model.addAttribute("pageInfo", pageInfo);
        System.out.println("这是胡敏的controller层f分页查询被保险人的方法" + recognizee_idcard);
        return "warranty";
    }

    //分页插件 同时查被查询被保险详细信息的方法
    @RequestMapping("/InsuranceExampleShow")
    public String selectAllInsuranceExampleController(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, Integer Insurance_id) {
        PageHelper.startPage(pageNum, 3);
        List<InsuranceExample> list = res.selectAllInsuranceExample(Insurance_id);
        PageInfo<InsuranceExample> pageInfo = new PageInfo<InsuranceExample>(list);
        model.addAttribute("pageInfo", pageInfo);
        System.out.println("这是胡敏的controller层f分页查询被保险的方法" + Insurance_id);
        return "guarantee_slip";
    }

    //分页查询工单的方法
    @RequestMapping("/WorkOrderExampleShow")
    public String selectWorkOderController(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 3);
        List<WorkOrderExample> list = res.selectWorkOder();
        PageInfo<WorkOrderExample> pageInfo = new PageInfo<WorkOrderExample>(list);
        model.addAttribute("pageInfo", pageInfo);
        System.out.println("这是胡敏的controller层分页查询工单的方法");
        return "select_work_oder";
    }
    //添加勘察信息

    @RequestMapping("/addScoutExampleShow.html")
    public String upload() {

        return "exploration_Add";
    }


    @RequestMapping("/addScoutExampleShow.do")
    public String upload(Model model, ScoutExample scoutExample, MultipartFile accidentPhotos) {

        System.out.println("时间：" + scoutExample.getScout_time());
        System.out.println("图片名称：" + accidentPhotos.getOriginalFilename());
        System.out.println(scoutExample);
        String imageState = null;
        if (accidentPhotos.isEmpty()) {
            imageState = "上传失败，请选择文件";
        }



        String fileName = accidentPhotos.getOriginalFilename();
        String filePath = "D:/accidentphotos/";
        //uuid 自动生成
        String accidentId = UUID.randomUUID().toString();
        System.out.println(accidentId);
        //存储图片的路径
        File dest = new File(filePath +accidentId.toString()+"/"+ fileName );
        System.out.println("--------------------------------------------------------------"+scoutExample.getGlass());
//图片上传
        File fileParent = dest.getParentFile();
        if(!fileParent.exists()){
            fileParent.mkdirs();
        }
        try {
            accidentPhotos.transferTo(dest);
            //上传成功走方法，
            scoutExample.setAccidentPhoto(dest.toString());
            scoutExample.setScout_id(accidentId);
            res.addScoutExample(scoutExample);
            System.out.println("--------------------------------------------------------------"+scoutExample.getGlass());
            imageState = "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }

//        LOGGER.info("上传成功");

        imageState = "上传失败！";

        model.addAttribute("imageState", imageState);
        return "exploration_Add";
    }
//传值用的给exploration_man页面
    @RequestMapping("/ginseng")
    public String ginseng(Model model ,String policyNumber,Integer work_order_number ) {
        System.out.println("这是胡敏的controller层传参的方法" );

        System.out.println( policyNumber+"这是传过来的参数");
        model.addAttribute("policyNumber",policyNumber);
        model.addAttribute("work_order_number",work_order_number);

        return "exploration_man";
    }
    //传值用的给analyze_ktOrder页面
    @RequestMapping("one")
    public  String one(Model model,Integer employee_id , String policyNumber){
        model.addAttribute("employee_id",employee_id);
        model.addAttribute("policyNumber",policyNumber);
        System.out.println(employee_id);
        System.out.println(policyNumber);
        return "analyze_ktOrder";
    }
}
