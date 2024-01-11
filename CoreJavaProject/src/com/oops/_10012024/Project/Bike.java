package com.oops._10012024.Project;

public class Bike {
	


	private int CC;
	private String color;
	private String grear; //withGrear or without gear
	private String mirrors;
	private double price;

	public int getCC() {
		return CC;
	}
	public void setCC(int cC) {
		CC = cC;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGrear() {
		return grear;
	}
	public void setGrear(String grear) {
		this.grear = grear;
	}
	public String getMirrors() {
		return mirrors;
	}
	public void setMirrors(String mirrors) {
		this.mirrors = mirrors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Bike(int cC, String color, String grear, String mirrors, double price) {
		super();
		CC = cC;
		this.color = color;
		this.grear = grear;
		this.mirrors = mirrors;
		this.price = price;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bike [CC=" + CC + ", color=" + color + ", grear=" + grear + ", mirrors=" + mirrors + ", price=" + price
				+ "]";
	}


	

}
