package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ipolist")
@XmlRootElement(name="ipo")
public class Ipo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String companyname;
	private String stockexchange;
	private int ppshare;
	private int shares;
	private String datetime;
	private String remarks;
	public Ipo() {

	}
	public Ipo(int id, String companyname, String stockexchange, int ppshare, int shares, String datetime,
			String remarks) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.stockexchange = stockexchange;
		this.ppshare = ppshare;
		this.shares = shares;
		this.datetime = datetime;
		this.remarks = remarks;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public int getPpshare() {
		return ppshare;
	}
	public void setPpshare(int ppshare) {
		this.ppshare = ppshare;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Ipo [id=" + id + ", companyname=" + companyname + ", stockexchange=" + stockexchange + ", ppshare="
				+ ppshare + ", shares=" + shares + ", datetime=" + datetime + ", remarks=" + remarks + "]";
	}
	
	
}
	