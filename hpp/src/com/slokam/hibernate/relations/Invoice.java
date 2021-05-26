package com.slokam.hibernate.relations;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	private int vid;
	private int inumber;
	
	
	private Customer cc;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkcid")
	public Customer getCc() {
		return cc;
	}
	public void setCc(Customer cc) {
		this.cc = cc;
	}
	
	
	
	/*private List<Productinfo> pro;
	
	@OneToMany(mappedBy = "invo",cascade = CascadeType.ALL)
	public List<Productinfo> getPro() {
		return pro;
	}
	public void setPro(List<Productinfo> pro) {
		this.pro = pro;
	}*/
	

	@Id
	@GeneratedValue
	@Column(name="vid")
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	@Column(name="inumber")
	public int getInumber() {
		return inumber;
	}
	public void setInumber(int inumber) {
		this.inumber = inumber;
	}
	

}
