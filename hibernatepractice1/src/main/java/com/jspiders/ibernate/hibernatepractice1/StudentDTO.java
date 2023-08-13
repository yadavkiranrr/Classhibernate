package com.jspiders.ibernate.hibernatepractice1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDTO {
	
	@Id
	private int id;
	private String name;
    private String email;
    private String contact;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public StudentDTO(int id, String name, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
  

}
