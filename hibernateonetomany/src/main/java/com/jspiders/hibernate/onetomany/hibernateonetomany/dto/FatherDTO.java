package com.jspiders.hibernate.onetomany.hibernateonetomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class FatherDTO {
	
	@Id
	private int id;
	
	private String name;
	
	private int age;
	
	@OneToMany
	private List<ChildDTO> children;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<ChildDTO> getChildren() {
		return children;
	}

	public void setChildren(List<ChildDTO> children) {
		this.children = children;
	}

	public FatherDTO(int id, String name, int age, List<ChildDTO> children) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.children = children;
	}

	public FatherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
