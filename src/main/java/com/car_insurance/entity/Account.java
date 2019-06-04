package com.car_insurance.entity;

public class Account {
    private int account_id;
    private String account_name;
    private String account_password;
    private int employee_table_id;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public int getEmployee_table_id() {
        return employee_table_id;
    }

    public void setEmployee_table_id(int employee_table_id) {
        this.employee_table_id = employee_table_id;
    }
}
