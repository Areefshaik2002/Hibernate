package com.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Table")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="Product_id")
	private long id;
	private String category;
	private String name;
	private double price;
	
	public Product() {}

	public Product(long id, String category, String name, double price) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " " + category + " " + name + " " + price + " ";
	}
	
	
	
}
