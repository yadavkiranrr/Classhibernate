package com.jspiders.hibernateonettomany.hibernatemanytomany.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customer_details")
public class CustomerDTO {
	
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "customer_name")
	private String name;
	
	@Column(name = "customer_contact")
	private long contact;
	
	@Column(name = "customer_email")
	private String email;
	
	@ManyToMany
	private List<ProductDTO> products;

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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	public CustomerDTO(int id, String name, long contact, String email, List<ProductDTO> products) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.products = products;
	}

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

	
	

