package test1;

import java.util.Scanner;

public class EmployeeTesterByUsingScanner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//step1 ==>providing the input data 
		System.out.println("enter Employe id:::");
		int id=sc.nextInt();
		System.out.println("enter employee name:::");
		String name=sc.next();
		System.out.println("enter employee address:::");
		String address=sc.next();
		System.out.println("enter employee salary:::");
		double salary=sc.nextDouble();
		
		
		//converting the input data into Object
		Employee emp=new Employee();
		emp.id=id;
		emp.name=name;
		emp.address=address;
		emp.salary=salary;
		
		//display into console
		System.out.println("emp Id\t:::\t"+emp.id);
		System.out.println("emp Name\t:::\t"+emp.name);
		System.out.println("emp Address\t:::\t"+emp.address);
		System.out.println("emp Salary\t:::\t"+emp.salary);
	}

}
