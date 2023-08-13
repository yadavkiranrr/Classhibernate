package com.jspiders.hibernate.onetomany.hibernateonetomany.dto2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Useraddress {
	
	@Id 
	private Integer userId;
	
	private String useraddress;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public Useraddress(Integer userId, String useraddress) {
		super();
		this.userId = userId;
		this.useraddress = useraddress;
	}

	public Useraddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
