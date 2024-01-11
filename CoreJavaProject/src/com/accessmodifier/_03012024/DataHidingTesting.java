package com.accessmodifier._03012024;

public class DataHidingTesting {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(emp.username);
//		System.out.println(emp.password);
		
		Employee rajEmp=new Employee();
		rajEmp.username="raju";
//		rajEmp.password="raj@123";
		
		System.out.println(rajEmp.username);
//		System.out.println(rajEmp.password);
	}
}
