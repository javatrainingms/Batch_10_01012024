package com.oops._05012024;

public class Employee {
	
	private int id;
	private String name;

	Employee()
	{
		System.out.println("this is default constructor..");
	}

	Employee(int id,String name)
	{
		System.out.println("this is parameterised constructor");
		this.id=id;
		this.name=name;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
	
}
