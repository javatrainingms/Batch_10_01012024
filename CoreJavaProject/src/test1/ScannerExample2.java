package test1;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student id:::");
		int id=sc.nextInt();
		
		System.out.println("enter student name::::");
		String name=sc.next();
		
		System.out.println("enter student gender:::(M/F)");
		char gender=sc.next().charAt(0);
		
		System.out.println("id \t:\t"+id);
		System.out.println("name \t:\t"+name);
		System.out.println("gender \t:\t"+gender);
	}

}
