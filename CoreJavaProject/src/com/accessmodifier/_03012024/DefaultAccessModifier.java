package com.accessmodifier._03012024;

public class DefaultAccessModifier {
	String name="raju";
	
	
	public void method1()
	{
		System.out.println(name);
	}
	
	public static void method2()
	{
		DefaultAccessModifier d=new DefaultAccessModifier();
		System.out.println(d.name);
	}

}
