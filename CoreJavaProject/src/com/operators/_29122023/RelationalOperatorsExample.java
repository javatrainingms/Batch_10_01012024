package com.operators._29122023;

import java.util.Scanner;

public class RelationalOperatorsExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age..");
		int age=sc.nextInt();
		
		if(age>=56)
		{
			System.out.println("he is eligible");
		}
		else
		{
			System.out.println("he is not eligible...");
		}
	}
}
