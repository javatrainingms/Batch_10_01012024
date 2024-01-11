
public class EmployeeDatain2DimentionalArrays {
	public static void main(String[] args) {
		String empdata[][]=new String[5][4];
		//first emp details 
		empdata[0][0]="101";
		empdata[0][1]="raju";
		empdata[0][2]="hyderabad";
		empdata[0][3]="34000";



		//second emp details 
		empdata[1][0]="234";
		empdata[1][1]="kiran";
		empdata[1][2]="hyderabad";
		empdata[1][3]="23000";

		//third emp details 
		empdata[2][0]="129";
		empdata[2][1]="karthik";
		empdata[2][2]="secendrabad";
		empdata[2][3]="30000";

		//fourth emp details 
		empdata[3][0]="235";
		empdata[3][1]="phani";
		empdata[3][2]="vijayawada";
		empdata[3][3]="28000";
		
		
		//fifth emp details 
		empdata[4][0]="870";
		empdata[4][1]="anil";
		empdata[4][2]="vizag";
		empdata[4][3]="29000";

		
		for (int i = 0; i < empdata.length; i++) {
			for (int j = 0; j < empdata[i].length; j++) {
				System.out.print(empdata[i][j]+"\t\t");
			}
			System.out.println();
		}
	}

}
