package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTableExample extends  EmployeeTable {

    private EmployeeRoleExample employeeRoleExample;
    private RoleExample roleExample;

    public EmployeeTableExample() {
    }

    public EmployeeTableExample(Integer employee_id, String employee_name, String employee_tel, String employee_sex, Integer role_id, EmployeeRoleExample employeeRoleExample) {
        super(employee_id, employee_name, employee_tel, employee_sex, role_id);
        this.employeeRoleExample = employeeRoleExample;
    }

    public EmployeeTableExample(EmployeeRoleExample employeeRoleExample) {
        this.employeeRoleExample = employeeRoleExample;
    }

    public EmployeeTableExample(Integer employee_id, String employee_name, String employee_tel, String employee_sex, Integer role_id) {
        super(employee_id, employee_name, employee_tel, employee_sex, role_id);
    }
}