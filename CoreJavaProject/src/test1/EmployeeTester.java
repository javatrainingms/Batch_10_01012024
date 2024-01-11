package test1;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(emp.id+"::"+emp.name+"::"+emp.address+"::"+emp.salary);
		
		Employee emp1=new Employee();
		emp1.id=234;
		emp1.name="ganesh";
		emp1.address="secendrabad";
		emp1.salary=23000;
		System.out.println(emp1.id+"::"+emp1.name+"::"+emp1.address+"::"+emp1.salary);
		
		
		
	}

}
