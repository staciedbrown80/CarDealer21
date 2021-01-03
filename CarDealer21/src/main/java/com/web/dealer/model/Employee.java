package com.web.dealer.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="employee")

	public class Employee {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)

		private Long id;		
		private String lname;
		private String fname;
	    private String password;
	    private String email;         
	    private String password2;
		
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword2() {
			return password2;
		}
		public void setPassword2(String password2) {
			this.password2 = password2;
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", lname=" + lname + ", fname=" + fname + ", password=" + password + ", email="
					+ email + ", password2=" + password2 + "]";
		}
		public void setRole(String role) {
			// TODO Auto-generated method stub
			
		}
		
	}

