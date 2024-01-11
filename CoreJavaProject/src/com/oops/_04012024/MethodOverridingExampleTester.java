package com.oops._04012024;

public class MethodOverridingExampleTester {
	
	public static void main(String[] args) {
		//sce1 ==>parent ref and parent object
		Parent p=new Parent();
		p.method1();   //parent method1
		p.method2();  //parent method2
//		p.method3();//compile time error
		
		System.out.println("=======================");
		//sce2==>child ref child object
		Child c=new Child();
		c.method1();   //Child method1
		c.method2();   //parent method2
		c.method3();   //child method3
		
		System.out.println("=======================");
		//sce3 ==>parent ref and child Object
		Parent p1=new Child();
		p1.method1();   // child method1
		p1.method2();  //parent method2 
//		p1.method3();//compile time error
		
		System.out.println("=======================");
		//sce4==>child ref and PArent Object
//		Child c1=(Child)new Parent();
		
		
		
		
	}

}
