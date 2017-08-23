package com.ecf.pojo;

public class Pcftype {
    private Integer pcftypeid;

    private Integer pid;

    private Integer pcfprix;

    private Integer pcfprice;

    private String pcfintrouce;

    public Integer getPcftypeid() {
        return pcftypeid;
    }

    public void setPcftypeid(Integer pcftypeid) {
        this.pcftypeid = pcftypeid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPcfprix() {
        return pcfprix;
    }

    public void setPcfprix(Integer pcfprix) {
        this.pcfprix = pcfprix;
    }

    public Integer getPcfprice() {
        return pcfprice;
    }

    public void setPcfprice(Integer pcfprice) {
        this.pcfprice = pcfprice;
    }

    public String getPcfintrouce() {
        return pcfintrouce;
    }

    public void setPcfintrouce(String pcfintrouce) {
        this.pcfintrouce = pcfintrouce == null ? null : pcfintrouce.trim();
    }
}