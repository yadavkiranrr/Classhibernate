package com.jspiders.hibernate.onetomany.hibernateonetomany.dto2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserAddress {
	
	@Id 
	private int Id;
	
	
	private String useraddress;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress= useraddress;
	}

	public UserAddress(int Id, String useraddress) {
		super();
		this.Id = Id;
		this.useraddress = useraddress;
	}

	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
