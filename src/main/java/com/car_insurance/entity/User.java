package com.car_insurance.entity;

public class User {
    private Integer user_id;

    private String user_name;

    private Integer password;

    private String salt;

    private String phone;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(Integer user_id, String user_name, Integer password, String salt, String phone) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.salt = salt;
        this.phone = phone;
    }
}