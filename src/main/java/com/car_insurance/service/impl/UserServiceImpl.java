package com.car_insurance.service.impl;


import com.car_insurance.entity.Users;
import com.car_insurance.mapper.UsersMapper;
import com.car_insurance.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UsersMapper um;

   public List<Users> selectAllUsers(){

        return um.selectAllUsers();

    }


    public void addUser(Users users){

       um.addUser(users);
    }


    public void alertUser(Users users) {
        um.alertUser(users);
    }

}
