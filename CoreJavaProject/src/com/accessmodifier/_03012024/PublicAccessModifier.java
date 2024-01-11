package com.accessmodifier._03012024;

public class PublicAccessModifier {
	
	public String name="raju";
	
	public void method1()
	{
		System.out.println("name>>>"+name);
	}
	
	public static void method2()
	{
		PublicAccessModifier p=new PublicAccessModifier();
		System.out.println("name>>>"+p.name);
	}

}
