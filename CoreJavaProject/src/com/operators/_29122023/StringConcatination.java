package com.operators._29122023;

public class StringConcatination {

	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		int sum=n1+n2;
		System.out.println("sum >>>"+sum);
		
		String data="SomeData";
		
		//number +string
		String res=n1+n2+data;  //10+20=30==>30somedata
		System.out.println("res>>>>"+res);
		
		
		//String +number  (just appending with string)  
		String res1=data+n1+n2;
		System.out.println("res1>>>"+res1);
		
		
		System.out.println("this is my data>>>"+(n1+n2));
		
	}
}
