package com.car_insurance.mapper;

import com.car_insurance.entity.AccountExample;

import java.util.List;

public interface AccountMapper {

    //根据姓名查询员工
    AccountExample findAccountByName(String name);

    List<String> getPermissions(String name);

    String getRoles(String name);




}
