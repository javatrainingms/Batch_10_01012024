package com.accessmodifier._03012024;

public class OutsideClassWithinPackage {
	
	public void method1()
	{
		PublicAccessModifier p=new PublicAccessModifier();
		System.out.println("name>>>"+p.name);
		
		PrivateAccessModifier p1=new PrivateAccessModifier();
//		System.out.println(p1.name);  //compile time error
		
		
		DefaultAccessModifier d=new DefaultAccessModifier();
		System.out.println(d.name);
		
		
		ProtectedAccessModifier p2=new ProtectedAccessModifier();
		System.out.println(p2.name);
	}

	
	public static void method2()
	{
		PublicAccessModifier p=new PublicAccessModifier();
		System.out.println("name>>>"+p.name);
		
		PrivateAccessModifier p1=new PrivateAccessModifier();
//		System.out.println(p1.name);//compile time error

		DefaultAccessModifier d=new DefaultAccessModifier();
		System.out.println(d.name);
		
		
		ProtectedAccessModifier p2=new ProtectedAccessModifier();
		System.out.println(p2.name);
	}
}
