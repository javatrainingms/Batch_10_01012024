package com.oops._05012024;

import java.util.Arrays;

public class Doctor {
	private int id;
	private String name;
	private String position;
	private Patient[] patients;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Patient[] getPatients() {
		return patients;
	}
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", position=" + position + ", patients="
				+ Arrays.toString(patients) + "]";
	}
	public Doctor(int id, String name, String position, Patient[] patients) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.patients = patients;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
