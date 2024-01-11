package com.accessmodifier._03012024.out;

import com.accessmodifier._03012024.Parent;

public class Child extends Parent {

	public void method1()
	{
		Child c=new Child();
		System.out.println(c.name);
	}
	
	public static void method2()
	{
		Child c=new Child();
		System.out.println(c.name);
	}
	
}
