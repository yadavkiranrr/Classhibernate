package com.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HusbandDTO {
	

	@Id
	private int id;

	private String name;

	private String email;

	private int age;

	private long contact;
	
	@OneToOne
	private WifeDTO wife;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public WifeDTO getWife() {
		return wife;
	}

	public void setWife(WifeDTO wife) {
		this.wife = wife;
	}

	public HusbandDTO(int id, String name, String email, int age, long contact, WifeDTO wife) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.contact = contact;
		this.wife = wife;
	}

	public HusbandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
