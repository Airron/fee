package com.ecf.pojo;

public class Pcategory {
    private Integer pcategoryid;

    private String pcategory;

    public Integer getPcategoryid() {
        return pcategoryid;
    }

    public void setPcategoryid(Integer pcategoryid) {
        this.pcategoryid = pcategoryid;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory == null ? null : pcategory.trim();
    }
}