package com.accessmodifier._03012024;

public class Client1_getEmployeeDetails {
	
	public static void main(String[] args) {
//		EmployeeManagement emp=new EmployeeManagement();
//		emp.getEmployee();
//		
//		emp.createEmployee();
//		emp.deleteEmployee();
//		emp.updateEmployee();
		
		
		GetEmployeeService getEmp=new EmployeeManagement();
		getEmp.getEmployee();
//		getEmp.createEmployee();
//		getEmp.deleteEmployee();
//		getEmp.updateEmployee();
	}

}
