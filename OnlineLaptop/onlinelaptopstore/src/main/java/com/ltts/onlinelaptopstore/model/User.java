package com.ltts.onlinelaptopstore.model;



import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity  
public class User {

	
	private String cust_name;
	@Id
	private String username;
	private String password;
	private String dob;
	private String address;
	private String pic;
	
	
	
	public User() {
		super();
	}


	public User(String cust_name, String username, String password, String dob, String address) {
		super();
		this.cust_name = cust_name;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.address = address;
	}
	
	
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "User [cust_name=" + cust_name + ", username=" + username + ", password=" + password + ", dob=" + dob
				+ ", address=" + address + ",pic" + pic + "]";
	}
	
}
