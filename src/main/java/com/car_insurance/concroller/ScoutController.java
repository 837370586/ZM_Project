package com.car_insurance.concroller;

import com.car_insurance.entity.*;
import com.car_insurance.service.ScoutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
/*
 * 张凌宇
 * */

@Controller
public class ScoutController {
    @Resource
    private ScoutService sse;

    //查询订单信息
    @RequestMapping("/scoutShow")
    public ModelAndView showScout( @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum) {
        PageHelper.startPage(pageNum,2);
        ModelAndView model = new ModelAndView("analyze_ktOrder");
        List<ScoutExample> list = sse.selectAllScout();
        PageInfo<ScoutExample> pageInfo = new PageInfo<ScoutExample>(list);
        model.addObject("pageInfo",pageInfo);
        //测试代
        return model;
    }
    //根据单号查询指定订单
    @RequestMapping("/selectOne")
    public ModelAndView showOne( @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,Integer scout_num) {
        PageHelper.startPage(pageNum,2);
        if(String.valueOf(scout_num)=="" ||String.valueOf(scout_num)=="null"){
            ModelAndView model = new ModelAndView("analyze_ktOrder");
            List<ScoutExample> list = sse.selectAllScout();
            PageInfo<ScoutExample> pageInfo = new PageInfo<ScoutExample>(list);
            model.addObject("pageInfo",pageInfo);
            System.out.println("张凌宇的查单条,没有输入内容");
            System.out.println("这是:"+scout_num);
            return model;
        }
        else {
            ModelAndView model = new ModelAndView("analyze_ktOrder");
            List<ScoutExample> list = sse.selectOne(scout_num);
            PageInfo<ScoutExample> pageInfo = new PageInfo<ScoutExample>(list);
            model.addObject("pageInfo",pageInfo);
            //测试代码
            System.out.println("张凌宇的查单条");
            System.out.println("这是:"+scout_num);
            return model;
        }


    }
    //查询接口表内容
    @RequestMapping("/interviceShow")
    public ModelAndView showIntervice( @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,String scout_id,HttpServletRequest request) {
        PageHelper.startPage(pageNum,3);
        ModelAndView model = new ModelAndView("verify");
        System.out.println("张凌宇查指定零件损坏表-2"+scout_id);
        if(null!=request.getParameter("scout_id")){
            scout_id = request.getParameter("scout_id");
        }
        List<InterviceExample> list = sse.selectAllIntervice();
        System.out.println("张凌宇查指定零件损坏表"+scout_id);
        List<DamagedPartsExample> dpe = sse.selectOneParts(scout_id);

        PageInfo<InterviceExample> pageInfo = new PageInfo<InterviceExample>(list);
        model.addObject("scout_id",scout_id);
        model.addObject("pageInfo",pageInfo);
        model.addObject("dpe",dpe);
        //测试代码
        System.out.println("张凌宇的查接口表");
        return model;
    }

    //根据勘探状态查询所有勘探员工信息(在员工表里连表查)
    @RequestMapping("/allCheckPeopleShow")
    public ModelAndView allCheckPeopleShow(@RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum){
        ModelAndView model = new ModelAndView("exploration_man");
        PageHelper.startPage(pageNum,2);
        List<EmployeeTableExample> list = sse.selectAllCheckPeople();
        PageInfo<EmployeeTableExample> pageInfo = new PageInfo<EmployeeTableExample>(list);
        model.addObject("pageInfo",pageInfo);
        System.out.println("张凌宇的连表查勘探人员表"+list.get(0).getEmployee_name()+"  "+list.get(0).getExploration_status_id());
        return model;
    }
    //根据输入的勘探员id查询指定的勘探员信息
    @RequestMapping("/selectOneCheck")
    public ModelAndView showOneCheck( @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,Integer employee_id) {
        PageHelper.startPage(pageNum,2);
        if(String.valueOf(employee_id)=="" ||String.valueOf(employee_id)=="null"){
            ModelAndView model = new ModelAndView("exploration_man");
            List<EmployeeTableExample> list = sse.selectAllCheckPeople();
            PageInfo<EmployeeTableExample> pageInfo = new PageInfo<EmployeeTableExample>(list);
            model.addObject("pageInfo",pageInfo);
            System.out.println("张凌宇的查勘探员单条,没有输入内容");
            System.out.println("这是:"+employee_id);
            return model;
        }
        else {
            ModelAndView model = new ModelAndView("exploration_man");
            List<EmployeeTableExample> list = sse.selectOneCheck(employee_id);
            PageInfo<EmployeeTableExample> pageInfo = new PageInfo<EmployeeTableExample>(list);
            model.addObject("pageInfo",pageInfo);
            //测试代码
            System.out.println("张凌宇的查勘探员单条");
            System.out.println("这是:"+employee_id);
            return model;
        }



    }

    //删除指定勘探人员资料
    @RequestMapping("/deletOne")
    public ModelAndView deletOne(@RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,Integer employee_id){
        ModelAndView model = new ModelAndView("exploration_man");
        PageHelper.startPage(pageNum,2);
        System.out.print("张凌宇测试是否传回要删除的勘探员id"+employee_id);
        sse.deleatOne(employee_id);
        List<EmployeeTableExample> list = sse.selectAllCheckPeople();
        PageInfo<EmployeeTableExample> pageInfo = new PageInfo<EmployeeTableExample>(list);
        model.addObject("pageInfo",pageInfo);
        System.out.println("张凌宇的删除指定勘探员后，连表查勘探人员表");
        return model;
    }
    //跳转页面的功能
    @RequestMapping("/tiaozhuan")
    public String tiaozhuan(Model model,Integer employee_id){
        model.addAttribute("employee_id",employee_id);
        System.out.print("接受传过来的勘探员id"+employee_id);
        return "editExploration";
    }

    //编辑勘探员信息
    @RequestMapping("/updateOne")
    public ModelAndView updateOne(@RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum,Integer employee_id,String employee_name, String employee_tel){
        ModelAndView model = new ModelAndView("exploration_man");
        PageHelper.startPage(pageNum,2);
        System.out.print("张凌宇测试是否传回要编辑的勘探员信息"+employee_id+" "+employee_name+" "+employee_tel+" ");
        sse.updateOne(employee_id,employee_name,employee_tel);
        List<EmployeeTableExample> list = sse.selectAllCheckPeople();
        PageInfo<EmployeeTableExample> pageInfo = new PageInfo<EmployeeTableExample>(list);
        model.addObject("pageInfo",pageInfo);
        return model;
    }

    //勘探页面点击操作进行页面跳转
    @RequestMapping("/tiaozhuan2")
    public  String tiaozhuan2(Model model,Integer employee_id,String polocyNumber){
            model.addAttribute("employee_id",employee_id);
            model.addAttribute("polocyNumber",polocyNumber);
            return "exploration_Add";
    }

    //往最后一张表里存最后所有的信息
    //订单页面第一个驳回
    @RequestMapping("/boHui1")
    public  String tiaozhuan3(Model model,Integer employee_id,String polocyNumber,String scout_id,String scout_time
    ,int accident_type_id,String accidentphoto,String loss_situation,String responsibility_judgment){
        System.out.println("检测是否从驳回传回订单编号："+scout_id);
        sse.insertInto(employee_id,polocyNumber,scout_id,scout_time,accident_type_id,accidentphoto,loss_situation,responsibility_judgment);
        model.addAttribute("scout_id",scout_id);
        return "boHui1";
    }

    @RequestMapping("/addReson")
    public String tiaozhuan4(Model model,String reson,String scout_id){
        System.out.println("看是否接收到驳回原因"+reson);
        System.out.println("看是否接收到驳回订单编号"+scout_id);
        sse.inserInto2(reson,scout_id);
        List<FinallyscoutExample> list = sse.selectFinally();
        model.addAttribute("list",list);
        return "finallyScout";
    }
}
