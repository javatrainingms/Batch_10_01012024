package com.oops._04012024;

public class StudentTester {
	public static void main(String[] args) {
		Address add=new Address();
		add.setPincode(500018);
		add.setCity("hyderabad");
		add.setState("TS");
		
		Student std=new Student();
		std.setId(101);
		std.setName("raju");
//		std.setAddress("hyderabad");
		std.setAddress(add);
		
		System.out.println(std);
	}

}
