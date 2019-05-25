package com.car_insurance.concroller;


import com.car_insurance.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService us;

    //查询用户所有信息
    @RequestMapping("/show")
    public String showUsers(Model model) {
        model.addAttribute("userList", us.selectAllUsers());
        return "show";
    }

    //跳转添加用户页面
    @RequestMapping("/skip_addUser")
    public String skip_addUser(Model model) {

        return "addUser";

    }

    //添加用户
    @RequestMapping("/addUsers")
    public String addUsers(Model model, Users users) {

        us.addUser(users);
       System.out.println(users.getPassword()+users.getUser());
        model.addAttribute("userList", us.selectAllUsers());

        return "show";

    }

    //跳转修改用户页面
    @RequestMapping("/skip_alertUser")
    public String skip_alertUser(Model model) {

        return "alert";

    }

    //修改用户信息
    @RequestMapping("/alertUser")
    public String alertUser(Model model, Users users) {

        us.alertUser(users);
        System.out.println(users.getPassword()+users.getUser());
        model.addAttribute("userList", us.selectAllUsers());
        return "show";

    }
}
