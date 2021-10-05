package com.java.bean;

public class StudentBean {
	private int id;
	private String name;
	//private String address;
	public Object setId;
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + "]";
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
	

}
