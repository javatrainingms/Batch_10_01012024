
public class Instance_StaticVaraibles {

	public static void main(String[] args) {
		Employee.companyName="TCS";
		
		//first emp
		Employee emp1=new Employee();
		emp1.id=101;
		emp1.name="raju";
		emp1.address="hyderabad";
//		emp1.companyName="TCS";
		

		//second emp
		Employee emp2=new Employee();
		emp2.id=432;
		emp2.name="kiran";
//		emp2.address="vijayawada";
//		emp2.companyName="TCS";



		//third emp
		Employee emp3=new Employee();
		emp3.id=671;
//		emp3.name="Ganesh";
		emp3.address="Vizag";
//		emp3.companyName="TCS";
		
		System.out.println(emp1.id+":::"+emp1.name+":::"+emp1.address+":::"+emp1.companyName);
		System.out.println(emp2.id+":::"+emp2.name+":::"+emp2.address+":::"+emp2.companyName);
		System.out.println(emp3.id+":::"+emp3.name+":::"+emp3.address+":::"+emp3.companyName);

	}

}
