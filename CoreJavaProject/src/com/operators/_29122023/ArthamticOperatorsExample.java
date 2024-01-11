package com.operators._29122023;

import java.util.Scanner;

public class ArthamticOperatorsExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();

		System.out.println("press 1 : addition");
		System.out.println("press 2 : subtraction");
		System.out.println("press 3 : multiplication");
		System.out.println("press 4 : divistion");
		System.out.println("press 5 : remaininder ");

		System.out.println("====================");
		System.out.println("enter u r choice");
		int choice=sc.nextInt();

		switch (choice) {
		case 1:		
				System.out.println("addition");
					int sum=n1+n2;
					System.out.println("sum value>>"+sum);
				break;
		case 2:		
			System.out.println("subtraction");
				int sub=n1-n2;
				System.out.println("sub value>>>"+sub);
			break;
		case 3: 	
			System.out.println("multiplication");
				int mul=n1*n2;
				System.out.println("mul value>>>"+mul);
			break;
		case 4:		
			System.out.println("division");
				int div=n1/n2;
			System.out.println("div value>>>>"+div);
			break;
		case 5:		
			System.out.println("remainder");
			int remainder=n1%n2;
			System.out.println("remainder>>>"+remainder);
			break;
			default :
					System.out.println("boss please provide 1 to 5 numbers only.");
		}
	}


}
