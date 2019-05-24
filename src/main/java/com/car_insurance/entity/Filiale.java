package com.car_insurance.entity;

public class Filiale {
    private Integer filialeId;

    private Integer filialeNum;

    private String filialeName;

    private String filialeAdress;

    public Filiale(Integer filialeId, Integer filialeNum, String filialeName, String filialeAdress) {
        this.filialeId = filialeId;
        this.filialeNum = filialeNum;
        this.filialeName = filialeName;
        this.filialeAdress = filialeAdress;
    }

    public Filiale() {
        super();
    }

    public Integer getFilialeId() {
        return filialeId;
    }

    public void setFilialeId(Integer filialeId) {
        this.filialeId = filialeId;
    }

    public Integer getFilialeNum() {
        return filialeNum;
    }

    public void setFilialeNum(Integer filialeNum) {
        this.filialeNum = filialeNum;
    }

    public String getFilialeName() {
        return filialeName;
    }

    public void setFilialeName(String filialeName) {
        this.filialeName = filialeName == null ? null : filialeName.trim();
    }

    public String getFilialeAdress() {
        return filialeAdress;
    }

    public void setFilialeAdress(String filialeAdress) {
        this.filialeAdress = filialeAdress == null ? null : filialeAdress.trim();
    }
}