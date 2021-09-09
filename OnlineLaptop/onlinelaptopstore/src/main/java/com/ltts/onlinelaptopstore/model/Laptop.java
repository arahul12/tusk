package com.ltts.onlinelaptopstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity

public class Laptop {
	private String brandname;
	private String processor;
	@Id
	private int laptop_id;
	private int cost;
	private int model_no;
	private int ram;
	private int year;
	
	
	
	public Laptop() {
		super();
	}


	public Laptop(String brandname, String processor, int laptop_id, int cost, int model_no, int ram, int year) {
		super();
		this.brandname = brandname;
		this.processor = processor;
		this.laptop_id = laptop_id;
		this.cost = cost;
		this.model_no = model_no;
		this.ram = ram;
		this.year = year;
	}


	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	
}
