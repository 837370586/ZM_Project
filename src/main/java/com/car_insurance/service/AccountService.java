package com.car_insurance.service;

import com.car_insurance.entity.AccountExample;

import java.util.List;

public interface AccountService {

    //根据姓名查询员工
    AccountExample findAccountByName(String name);

    List<String> getPermissions(String name);

    String getRoles(String name);
}
