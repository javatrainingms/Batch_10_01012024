package com.oops._05012024;

public class OverLoadingExampleTesting {

	public static void main(String[] args) {
		SummataionClass s=new SummataionClass();
		System.out.println(s.sum(30, 40));
		System.out.println(s.sum(50, 10));
		
		System.out.println(s.sum(20, 10,30,50));
		
//		System.out.println(s.sum(30,10,20));//compiltime error 
	}
}
