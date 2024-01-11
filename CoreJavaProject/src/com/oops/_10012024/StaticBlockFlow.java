package com.oops._10012024;

public class StaticBlockFlow {
	
	static int i=10;
	
	static {
		System.out.println("this is static block 1");
		System.out.println("i value>>>1>>>"+i);
//		System.out.println("j value>>>1>>>"+j);
	}
	static int j=20;
	
	StaticBlockFlow()
	{
		System.out.println("this is constrcutor...");
	}


	static {
		System.out.println("this is static block 2");
	}
}
