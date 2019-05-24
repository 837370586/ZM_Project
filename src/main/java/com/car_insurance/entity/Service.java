package com.car_insurance.entity;

import java.util.Date;

public class Service {
    private Integer serviceId;

    private String serviceName;

    private Integer serviceNum;

    private Date serviceTime;

    private String serviceOrder;

    public Service(Integer serviceId, String serviceName, Integer serviceNum, Date serviceTime, String serviceOrder) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceNum = serviceNum;
        this.serviceTime = serviceTime;
        this.serviceOrder = serviceOrder;
    }

    public Service() {
        super();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public Integer getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(String serviceOrder) {
        this.serviceOrder = serviceOrder == null ? null : serviceOrder.trim();
    }
}