package com.sttproject.dto;

public class OrderDTO {
	private int serviceidx;
	private int expertidx;
	private int useridx;
	private String servicetitle;
	private int servicecategory;
	private int serviceteamscale;
	private String serviceresident;
	private int serviceprice;
	private int serivceperiod;
	private String serviceinfo;
	

	public int getServiceidx() {
		return serviceidx;
	}
	public void setServiceidx(int serviceidx) {
		this.serviceidx = serviceidx;
	}
	public int getExpertidx() {
		return expertidx;
	}
	public void setExpertidx(int expertidx) {
		this.expertidx = expertidx;
	}
	public int getUseridx() {
		return useridx;
	}
	public void setUseridx(int useridx) {
		this.useridx = useridx;
	}
	public String getServicetitle() {
		return servicetitle;
	}
	public void setServicetitle(String servicetitle) {
		this.servicetitle = servicetitle;
	}
	
	public int getServicecategory() {
		return servicecategory;
	}
	public void setServicecategory(int servicecategory) {
		this.servicecategory = servicecategory;
	}
	
	public int getServiceteamscale() {
		return serviceteamscale;
	}
	public void setServiceteamscale(int serviceteamscale) {
		this.serviceteamscale = serviceteamscale;
	}
	public String getServiceresident() {
		return serviceresident;
	}
	public void setServiceresident(String serviceresident) {
		this.serviceresident = serviceresident;
	}
	public int getServiceprice() {
		return serviceprice;
	}
	public void setServiceprice(int serviceprice) {
		this.serviceprice = serviceprice;
	}
	public int getSerivceperiod() {
		return serivceperiod;
	}
	public void setSerivceperiod(int serivceperiod) {
		this.serivceperiod = serivceperiod;
	}
	public String getServiceinfo() {
		return serviceinfo;
	}
	public void setServiceinfo(String serviceinfo) {
		this.serviceinfo = serviceinfo;
	}
	
}