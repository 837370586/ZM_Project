package com.car_insurance.mapper;


import com.car_insurance.entity.Users;

import java.util.List;

public interface UsersMapper {

      List<Users> selectAllUsers();

      void addUser(Users users);

      void alertUser(Users users);

}