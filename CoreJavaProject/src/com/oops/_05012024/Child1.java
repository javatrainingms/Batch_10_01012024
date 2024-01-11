package com.oops._05012024;

public class Child1 extends Parent1{
	
	Child1()
	{
		super(101);
//		this(123);
		System.out.println("child default constrcutor...");
	}
	
	Child1(int a)
	{
		System.out.println("child paremeterised cosntructor>>>int>>>"+a);
	}

}
