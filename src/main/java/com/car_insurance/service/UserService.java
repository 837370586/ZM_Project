package com.car_insurance.service;


import com.car_insurance.entity.Users;

import java.util.List;

public interface UserService {

    List<Users> selectAllUsers();

    void addUser(Users users);

    void alertUser(Users users);
}
