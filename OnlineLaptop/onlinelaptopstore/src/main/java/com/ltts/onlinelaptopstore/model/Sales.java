package com.ltts.onlinelaptopstore.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class Sales {
	private String customer_name;
	private int laptop_id;
	private String username;
	private int amount;
	@Id
	private int billno;
	private LocalDate dateofpurchase;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public LocalDate getDateofpurchase() {
		return dateofpurchase;
	}
	public void setDateofpurchase(LocalDate dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}
	@Override
	public String toString() {
		return "Sales [customer_name=" + customer_name + ", laptop_id=" + laptop_id + ", username=" + username
				+ ", amount=" + amount + ", billno=" + billno + ", dateofpurchase=" + dateofpurchase + "]";
	}
}
