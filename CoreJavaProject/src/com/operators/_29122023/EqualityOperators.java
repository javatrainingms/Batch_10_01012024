package com.operators._29122023;

import java.util.Scanner;

public class EqualityOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter education");
		String education=sc.next();
		
		if(education.equals("btech"))
		{
			System.out.println("he is eligible");
		}
		else
		{
			System.out.println("he is not eligible...");
		}
		
	}
}
