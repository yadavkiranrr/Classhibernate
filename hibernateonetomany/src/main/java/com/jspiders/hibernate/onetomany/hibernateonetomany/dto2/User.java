package com.jspiders.hibernate.onetomany.hibernateonetomany.dto2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	private Integer userId;
	
	private String username;
	
	@OneToMany 
	private List<Useraddress> useraddress;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Useraddress> getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(List<Useraddress> useraddress) {
		this.useraddress = useraddress;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String username, List<Useraddress> useraddress) {
		super();
		this.userId = userId;
		this.username = username;
		this.useraddress = useraddress;
	}
	
	

}
