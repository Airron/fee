package com.ecf.pojo;

import java.util.Date;

public class Project {
    private Integer pid;

    private String user;

    private String pname;

    private Integer pcategoryid;

    private Boolean pstatus;

    private Integer pgoal;

    private Integer ppledged;

    private Date pstartdate;

    private Integer penddate;

    private Integer pblurb;

    private String pcontent;

    private String pimage;

    private Integer precommend;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPcategoryid() {
        return pcategoryid;
    }

    public void setPcategoryid(Integer pcategoryid) {
        this.pcategoryid = pcategoryid;
    }

    public Boolean getPstatus() {
        return pstatus;
    }

    public void setPstatus(Boolean pstatus) {
        this.pstatus = pstatus;
    }

    public Integer getPgoal() {
        return pgoal;
    }

    public void setPgoal(Integer pgoal) {
        this.pgoal = pgoal;
    }

    public Integer getPpledged() {
        return ppledged;
    }

    public void setPpledged(Integer ppledged) {
        this.ppledged = ppledged;
    }

    public Date getPstartdate() {
        return pstartdate;
    }

    public void setPstartdate(Date pstartdate) {
        this.pstartdate = pstartdate;
    }

    public Integer getPenddate() {
        return penddate;
    }

    public void setPenddate(Integer penddate) {
        this.penddate = penddate;
    }

    public Integer getPblurb() {
        return pblurb;
    }

    public void setPblurb(Integer pblurb) {
        this.pblurb = pblurb;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent == null ? null : pcontent.trim();
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage == null ? null : pimage.trim();
    }

    public Integer getPrecommend() {
        return precommend;
    }

    public void setPrecommend(Integer precommend) {
        this.precommend = precommend;
    }
}