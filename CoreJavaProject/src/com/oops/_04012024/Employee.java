package com.oops._04012024;

public class Employee {
		private int id;
		private String name;
		private String address;
		private double salary;
		
		
		public void setId(int id)
		{
			this.id=id;  //local varaible assign to instance varaible
		}
		
		public int getId()
		{
			return id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
		}
		

		

}
