package com.slokam.hibernate.relations;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	private int cid;
	private String cname;
	private String clocation;
	
	
	private Invoice  in;
	
	
	@OneToOne(mappedBy = "cc",cascade = CascadeType.ALL)
	public Invoice getIn() {
		return in;
	}
	public void setIn(Invoice in) {
		this.in = in;
	}
	@Id
	@GeneratedValue
	@Column(name="cid")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Column(name="cname")
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column(name="clocation")
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	
	

}
