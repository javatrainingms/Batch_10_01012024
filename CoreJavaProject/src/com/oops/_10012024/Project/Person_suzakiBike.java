package com.oops._10012024.Project;

import java.util.Scanner;

public class Person_suzakiBike {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter CC");
		int cc=sc.nextInt();
		System.out.println("enter color");
		String color=sc.next();
		System.out.println("enter gear");
		String gear=sc.next();
		System.out.println("enter mirrors");
		String mirrors=sc.next();
		
		SuzakiBike s=SuzakiShowroom.getSuzakiBike(cc, color, gear, mirrors);
		
		System.out.println(s);
	}
}
