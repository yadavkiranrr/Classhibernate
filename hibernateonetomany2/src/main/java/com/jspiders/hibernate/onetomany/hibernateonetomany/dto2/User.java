package com.jspiders.hibernate.onetomany.hibernateonetomany.dto2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	private int userId;
	
	private String username;
	
	@OneToMany
	private List<UserAddress> useraddress;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<UserAddress> getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(List<UserAddress> useraddress) {
		this.useraddress = useraddress;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, List<UserAddress> useraddress) {
		super();
		this.userId = userId;
		this.username = username;
		this.useraddress = useraddress;
	}
	
	

}
