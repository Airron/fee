package com.ecf.pojo;

public class Porder {
    private Integer oorderid;

    private Integer pcftypeid;

    private Integer uid;

    private String ostatus;

    private Integer ocount;

    private Integer oprice;

    private String oaddress;

    public Integer getOorderid() {
        return oorderid;
    }

    public void setOorderid(Integer oorderid) {
        this.oorderid = oorderid;
    }

    public Integer getPcftypeid() {
        return pcftypeid;
    }

    public void setPcftypeid(Integer pcftypeid) {
        this.pcftypeid = pcftypeid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus == null ? null : ostatus.trim();
    }

    public Integer getOcount() {
        return ocount;
    }

    public void setOcount(Integer ocount) {
        this.ocount = ocount;
    }

    public Integer getOprice() {
        return oprice;
    }

    public void setOprice(Integer oprice) {
        this.oprice = oprice;
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress == null ? null : oaddress.trim();
    }

	private String pcfintrouce;

	public String getPcfintrouce() {
		return pcfintrouce;
	}

	public void setPcfintrouce(String pcfintrouce) {
		this.pcfintrouce = pcfintrouce;
	}
	
}