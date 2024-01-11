package com.accessmodifier._03012024;

public class EmployeeManagement extends GetEmployeeService
								implements Create_updateEmployeeservice,CreateGetEmployeeService{

	public void createEmployee()
	{
		System.out.println("this is create Employee process ");
	}
	
	public void getEmployee()
	{
		System.out.println("this is get Employee process ");
	}
	
	
	public void updateEmployee()
	{
		System.out.println("this is update Employee process ");
	}
	
	
	public void deleteEmployee()
	{
		System.out.println("this is Delete Employee process ");
	}
}
