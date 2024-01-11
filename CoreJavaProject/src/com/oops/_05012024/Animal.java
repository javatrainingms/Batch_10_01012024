package com.oops._05012024;

public class Animal {
	


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void sleeping()
	{
		System.out.println(name+" was sleeping");
	}
	
	public void eating()
	{
		System.out.println(name+" was eating");
	}


}
