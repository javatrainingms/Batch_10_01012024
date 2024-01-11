package com.accessmodifier._03012024.out;

import com.accessmodifier._03012024.DefaultAccessModifier;
import com.accessmodifier._03012024.ProtectedAccessModifier;
import com.accessmodifier._03012024.PublicAccessModifier;

public class OutSidePackageOutsideClass {
	
	public void method1()
	{
		PublicAccessModifier p=new PublicAccessModifier();
		System.out.println("name>>>"+p.name);
		
		DefaultAccessModifier d=new DefaultAccessModifier();
//		System.out.println(d.name);  //compile time error
		
		ProtectedAccessModifier p2=new ProtectedAccessModifier();
//		System.out.println(p2.name); //compile time error
	}
	
	public static void method2()
	{
		PublicAccessModifier p=new PublicAccessModifier();
		System.out.println("name>>>"+p.name);
		
		DefaultAccessModifier d=new DefaultAccessModifier();
//		System.out.println(d.name);  //compile time error
		
		ProtectedAccessModifier p2=new ProtectedAccessModifier();
//		System.out.println(p2.name); //compile time error
	}

}
