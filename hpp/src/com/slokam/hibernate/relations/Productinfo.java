package com.slokam.hibernate.relations;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productinfo")
public class Productinfo {
	
	private int prdid;
	private String prdname;
	private int price;
	
	private Invoice invo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkvid")
	public Invoice getInvo() {
		return invo;
	}
	public void setInvo(Invoice invo) {
		this.invo = invo;
	}
	@Id
	@GeneratedValue
	@Column(name="prdid")
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	@Column(name="prdname")
	public String getPrdname() {
		return prdname;
	}
	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}
	@Column(name="price")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
