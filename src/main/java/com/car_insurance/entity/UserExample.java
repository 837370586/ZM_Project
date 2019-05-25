package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample extends User{

    public UserExample(Integer user_id, String user_name, Integer password, String salt, String phone) {
        super(user_id, user_name, password, salt, phone);
    }
}