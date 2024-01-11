package com.oops._10012024;

public class InstanceBlockFlow {
	int i=10;
	
	{
		System.out.println("this is instance block1");
		System.out.println("i value>>>1>>>"+i);
//		System.out.println("j value>>>1>>>"+j);
	}
	

	int j=20;
	
	InstanceBlockFlow()
	{
		System.out.println("this is constrcutor");
		System.out.println("i value>>>const>>>"+i);
		System.out.println("j value>>>const>>>"+j);
		System.out.println("k value>>>const>>>"+k);
	}
	
	{
		System.out.println("this is instance block2");
		System.out.println("i value>>>2>>>"+i);
		System.out.println("j value>>>2>>>"+j);
//		System.out.println("k value>>>2>>>"+k);
	}
	
	int k=30;
}
