package com.feecreate.pojo;

public class Feehospitalarea {
    private Integer feehospitalareaid;

    private String feehospitalareaname;

    public Integer getFeehospitalareaid() {
        return feehospitalareaid;
    }

    public void setFeehospitalareaid(Integer feehospitalareaid) {
        this.feehospitalareaid = feehospitalareaid;
    }

    public String getFeehospitalareaname() {
        return feehospitalareaname;
    }

    public void setFeehospitalareaname(String feehospitalareaname) {
        this.feehospitalareaname = feehospitalareaname == null ? null : feehospitalareaname.trim();
    }
}