package com.operators._30122023;

public class ReturnExamle {
	public static void main(String[] args) {
		int res=sum(10,20);
		System.out.println("res >>>"+res);
		
		//OR
		System.out.println(sum(20,30));
		
//		System.out.println(method1());
	}
	
	public static int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static void method1()
	{
		System.out.println("this is method1...");
		
		return;//end of the method
//		System.out.println();
	}

}
