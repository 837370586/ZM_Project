package com.car_insurance.entity;

public class User {
    private Integer userId;

    private Integer roleId;

    private String userName;

    private Integer password;

    private String salt;

    private String phone;

    public User(Integer userId, Integer roleId, String userName, Integer password, String salt, String phone) {
        this.userId = userId;
        this.roleId = roleId;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.phone = phone;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}