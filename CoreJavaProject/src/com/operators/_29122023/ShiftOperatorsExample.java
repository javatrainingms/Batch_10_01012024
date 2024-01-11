package com.operators._29122023;

import java.util.Scanner;

public class ShiftOperatorsExample {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year of passedout");
		int yearofpassedut=sc.nextInt();
		
		System.out.println("enter education");
		String education=sc.next();
		
		
		if((yearofpassedut >=2020)  && (education.equals("btech")))
		{
			System.out.println("he is eligible...");
		}
		else
		{
			System.out.println("he is not eligible");
		}

		
		
//		if(yearofpassedut >=2020)
//		{
//			if(education.equals("btech"))
//			{
//				System.out.println("he is eligible");
//			}
//			else
//			{
//				System.out.println("he is not eligible");
//			}
//		}
//		else
//		{
//			System.out.println("he is not eligible");
//		}
	}

}
