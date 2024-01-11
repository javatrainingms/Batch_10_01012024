package com.accessmodifier._03012024;

public class ProtectedAccessModifier {

	protected String name="raju";
	
	public void method1()
	{
		System.out.println("name>>>"+name);
	}
	
	public static void method2()
	{
		ProtectedAccessModifier p=new ProtectedAccessModifier();
		System.out.println(p.name);
	}
}
