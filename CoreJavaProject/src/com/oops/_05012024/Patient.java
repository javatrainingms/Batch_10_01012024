package com.oops._05012024;

public class Patient {

	private int id;
	private String name;
	private String issue;
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
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", issue=" + issue + "]";
	}
	public Patient(int id, String name, String issue) {
		super();
		this.id = id;
		this.name = name;
		this.issue = issue;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
