package com.car_insurance.entity;

import java.util.Date;

public class FinancialStaff {
    private Integer financialStaffId;

    private Integer serialNum;

    private Integer financialStaffNum;

    private String financialStaffName;

    private String financialStaffPhone;

    private Integer financialStaffState;

    private String payeeNum;

    private String payeeName;

    private String payeeIdcard;

    private Integer moneyState;

    private Date financialStaffTime;

    public FinancialStaff(Integer financialStaffId, Integer serialNum, Integer financialStaffNum, String financialStaffName, String financialStaffPhone, Integer financialStaffState, String payeeNum, String payeeName, String payeeIdcard, Integer moneyState, Date financialStaffTime) {
        this.financialStaffId = financialStaffId;
        this.serialNum = serialNum;
        this.financialStaffNum = financialStaffNum;
        this.financialStaffName = financialStaffName;
        this.financialStaffPhone = financialStaffPhone;
        this.financialStaffState = financialStaffState;
        this.payeeNum = payeeNum;
        this.payeeName = payeeName;
        this.payeeIdcard = payeeIdcard;
        this.moneyState = moneyState;
        this.financialStaffTime = financialStaffTime;
    }

    public FinancialStaff() {
        super();
    }

    public Integer getFinancialStaffId() {
        return financialStaffId;
    }

    public void setFinancialStaffId(Integer financialStaffId) {
        this.financialStaffId = financialStaffId;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Integer getFinancialStaffNum() {
        return financialStaffNum;
    }

    public void setFinancialStaffNum(Integer financialStaffNum) {
        this.financialStaffNum = financialStaffNum;
    }

    public String getFinancialStaffName() {
        return financialStaffName;
    }

    public void setFinancialStaffName(String financialStaffName) {
        this.financialStaffName = financialStaffName == null ? null : financialStaffName.trim();
    }

    public String getFinancialStaffPhone() {
        return financialStaffPhone;
    }

    public void setFinancialStaffPhone(String financialStaffPhone) {
        this.financialStaffPhone = financialStaffPhone == null ? null : financialStaffPhone.trim();
    }

    public Integer getFinancialStaffState() {
        return financialStaffState;
    }

    public void setFinancialStaffState(Integer financialStaffState) {
        this.financialStaffState = financialStaffState;
    }

    public String getPayeeNum() {
        return payeeNum;
    }

    public void setPayeeNum(String payeeNum) {
        this.payeeNum = payeeNum == null ? null : payeeNum.trim();
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    public String getPayeeIdcard() {
        return payeeIdcard;
    }

    public void setPayeeIdcard(String payeeIdcard) {
        this.payeeIdcard = payeeIdcard == null ? null : payeeIdcard.trim();
    }

    public Integer getMoneyState() {
        return moneyState;
    }

    public void setMoneyState(Integer moneyState) {
        this.moneyState = moneyState;
    }

    public Date getFinancialStaffTime() {
        return financialStaffTime;
    }

    public void setFinancialStaffTime(Date financialStaffTime) {
        this.financialStaffTime = financialStaffTime;
    }
}