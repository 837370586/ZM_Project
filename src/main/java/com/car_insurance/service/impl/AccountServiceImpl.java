package com.car_insurance.service.impl;

import com.car_insurance.entity.AccountExample;
import com.car_insurance.mapper.AccountMapper;
import com.car_insurance.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public AccountExample findAccountByName(String name) {

        return accountMapper.findAccountByName(name);
    }


    public List<String> getPermissions(String name) {
        return accountMapper.getPermissions(name);
    }

    @Override
    public String getRoles(String name) {
        return accountMapper.getRoles(name);
    }
}
