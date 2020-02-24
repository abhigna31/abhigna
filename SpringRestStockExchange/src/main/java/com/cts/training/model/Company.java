package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "company")
@XmlRootElement(name="com")
public class Company  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String sector;
	private String name;
	private String ceo;
	private String bod;
	private long turnover;
	public Company() {	
		
	}
		
		
	public Company(String sector, String name, int id, String ceo, String bod, long turnover) {
		super();
		this.sector = sector;
		this.name = name;
		this.id = id;
		this.ceo = ceo;
		this.bod = bod;
		this.turnover = turnover;
	}

	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	public long getTurnover() {
		return turnover;
	}
	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Company [sector=" + sector + ", name=" + name + ", id=" + id + ", ceo=" + ceo + ", bod=" + bod
				+ ", turnover=" + turnover + "]";
	}
}



