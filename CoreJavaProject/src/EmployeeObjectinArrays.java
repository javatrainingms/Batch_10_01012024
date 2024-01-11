
public class EmployeeObjectinArrays {
	
	public static void main(String[] args) {
		Employee1 empdata[]=new Employee1[5];
		
		empdata[0]=new Employee1();
		empdata[0].id=101;
		empdata[0].name="raju";
		empdata[0].address="hyderabad";
		empdata[0].salary=34000;
		
		
		
		empdata[1]=new Employee1();
		empdata[1].id=234;
		empdata[1].name="kiran";
		empdata[1].address="hyderabad";
		empdata[1].salary=23000;
		
		empdata[2]=new Employee1();
		empdata[2].id=129;
		empdata[2].name="karthik";
		empdata[2].address="secendrabad";
		empdata[2].salary=30000;
		
		
		empdata[3]=new Employee1();
		empdata[3].id=235;
		empdata[3].name="phani";
		empdata[3].address="vijayawada";
		empdata[3].salary=28000;
		
		
		
		empdata[4]=new Employee1();
		empdata[4].id=870;
		empdata[4].name="anil";
		empdata[4].address="vizag";
		empdata[4].salary=29000;
		
		
		for (int i = 0; i < empdata.length; i++) {
			System.out.println(empdata[i].id+"\t"+empdata[i].name+"\t"+empdata[i].address+"\t"+empdata[i].salary);
		}
	}

}
