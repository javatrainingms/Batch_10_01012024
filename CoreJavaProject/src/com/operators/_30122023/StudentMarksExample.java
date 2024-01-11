package com.operators._30122023;

import java.util.Scanner;

public class StudentMarksExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter u r name");
		String name=sc.next();
		System.out.println("enter telugu marks");
		int telugu=sc.nextInt();
		System.out.println("enter Hindi marks");
		int hindi=sc.nextInt();
		System.out.println("enter English marks");
		int english=sc.nextInt();
		System.out.println("enter Maths marks");
		int maths=sc.nextInt();
		System.out.println("enter Science marks");
		int science=sc.nextInt();
		System.out.println("enter social marks");
		int social=sc.nextInt();
		
		int sum=telugu+hindi+english+maths+science+social;
		
		
		int average=sum/6;
		
		String grade="";
		if(average >81 && average<=100)
		{
			grade="A grade";
		}
		else if(average >61 && average<=80)
		{
			grade="B grade";
		}
		else if(average >41 && average<=60)
		{
			grade="C grade";
		}
		else
		{
			grade="D grade";
		}

	
		System.out.println("name : \t\t"+name);
		System.out.println("===== ===== ====== ====== ====");
		System.out.println("telugu\t:\t"+telugu);
		System.out.println("Hindi\t:\t"+hindi);
		System.out.println("english\t:\t"+english);
		System.out.println("Maths\t:\t"+maths);
		System.out.println("Science\t:\t"+science);
		System.out.println("Social\t:\t"+social);
		System.out.println("sum of all marks:\t\t"+sum);
		System.out.println("average of all marks\t\t"+average);
		System.out.println("Grade=====\t\t::::"+grade);
	}

}
