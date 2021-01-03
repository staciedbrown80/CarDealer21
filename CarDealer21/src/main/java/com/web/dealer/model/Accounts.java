package com.web.dealer.model;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Accounts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String fname;
	private String lname;
	private String password;
	@Transient
	private String password2;
	private String email;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Accounts [id=" + id + ", fname=" + fname + ", lname=" + lname + ", password=" + password
				+ ", password2=" + password2 + ", email=" + email + "]";
	}
	
}

