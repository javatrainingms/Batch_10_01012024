package com.oops._04012024;

import java.util.Scanner;

public class EmployeeTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:::");
		int id=sc.nextInt();
		System.out.println("enter name:::");
		String name=sc.next();
		System.out.println("enter address::");
		String address=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		
		Employee emp=new Employee();
//		emp.id=id;
//		emp.name=name;
		emp.setId(id);
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(salary);
		System.out.println(emp.getId()+"::::"+emp.getName()+":::"+emp.getAddress()+":::"+emp.getSalary());
		
		System.out.println(emp);
		
		Employee emp1=new Employee();
		System.out.println(emp1);
	}

}
