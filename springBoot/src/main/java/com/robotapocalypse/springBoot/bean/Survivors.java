package com.robotapocalypse.springBoot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="survivors")
public class Survivors {
       @Id
	   private int id;
	   private String name;
	   private int age;
	   private String gender;
	   private String location;
	   private String resources;
	   private boolean infected;
	   
	   
	public Survivors() {

	}
	public Survivors(int id, String name, int age, String gender, String location, String resources, boolean infected) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.resources = resources;
		this.infected = infected;
	}
	public boolean isInfected() {
		return infected;
	}
	public void setInfected(boolean infected) {
		this.infected = infected;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getResources() {
		return resources;
	}
	public void setResources(String resources) {
		this.resources = resources;
	}
	   
	   
	   
	   
} 
