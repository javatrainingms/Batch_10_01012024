package com.accessmodifier._03012024;

public class PrivateAccessModifier {

	private String name="raju";
	
	public void method1()
	{
		System.out.println("name>>>"+name);
	}
	
	public static void method2()
	{
		PrivateAccessModifier p=new PrivateAccessModifier();
		System.out.println(p.name);
	}
}
