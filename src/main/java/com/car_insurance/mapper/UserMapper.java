package com.car_insurance.mapper;


import java.util.List;

public interface UserMapper {

      List<Users> selectAllUsers();

      void addUser(Users users);

      void alertUser(Users users);

}