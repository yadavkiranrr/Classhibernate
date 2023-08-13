package com.jspiders.hibernate.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDTO {
	

	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	private long contact;
	
	private String city;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", city="
				+ city + "]";
	}

	public StudentDTO(int id, String name, String email, long contact, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.city = city;
	}

	
	
}
