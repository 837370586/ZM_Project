package com.car_insurance.entity;

import java.util.ArrayList;
import java.util.List;

public class WorkOrderExample extends WorkOrder{

    public WorkOrderExample(Integer work_order_id, Integer employee_id, Integer workOrder_number, Integer recognizee_id, String accident_spot) {
        super(work_order_id, employee_id, workOrder_number, recognizee_id, accident_spot);
    }
}