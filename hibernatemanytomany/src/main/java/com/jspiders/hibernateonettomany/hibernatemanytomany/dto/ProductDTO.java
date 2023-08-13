package com.jspiders.hibernateonettomany.hibernatemanytomany.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product_details")
public class ProductDTO {
	
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_price")
	private double price;
	
	@Column(name = "product_category")
	private String category;
	
	@ManyToMany(mappedBy = "products")
	private List<CustomerDTO> customers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<CustomerDTO> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerDTO> customers) {
		this.customers = customers;
	}

	public ProductDTO(int id, String name, double price, String category, List<CustomerDTO> customers) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.customers = customers;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}


