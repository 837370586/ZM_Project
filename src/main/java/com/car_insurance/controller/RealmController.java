package com.car_insurance.controller;

import com.car_insurance.service.AccountService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class RealmController {
    @Resource
    private AccountService accountService;

    @RequestMapping("toLogin")
    public String Login(String name, String password, Model model, HttpServletRequest request){

        //编写认证操作1.获取Subject
        Subject subject = SecurityUtils.getSubject() ;
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        try{

            //3.执行登录方法
            subject.login(token);
            request.getSession().setAttribute("qwe",name);
            String role=accountService.getRoles(name);
            if(role.equals("boss")){
                request.getSession().setAttribute("asd","超级管理员");
            }
            if(role.equals("service")){
                request.getSession().setAttribute("asd","客服");
            }
            if(role.equals("reconnaissance")){
                request.getSession().setAttribute("asd","勘察员");
            }
            if(role.equals("audit")){
                request.getSession().setAttribute("asd","审核员");
            }
            //登陆成功
            return "/index";
        }catch (UnknownAccountException e){
            model.addAttribute("mes","账号不存在");
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("mes","密码错误");
            return "login";
        }
    }


    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("/qqq")
    public  @ResponseBody
    List<String> qqq(HttpServletRequest request){
        String name=(String)request.getSession().getAttribute("qwe");
        List<String> list = new ArrayList<String>();
        String role = accountService.getRoles(name);
        list.add(role);
        System.out.println(role);
        return list;
    }

    @RequestMapping("loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().invalidate();

        System.out.println("loginout="+"123123123");
        return "login";
    }

    @RequestMapping("shouye")
    public String index(){
        System.out.println("loginout="+"178787878787");
        return "index";
    }
}
