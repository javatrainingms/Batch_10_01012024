package com.oops._05012024;

public class MethodHidingExampleTesting {
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.method1();  //parent methodd1
		p.method2();  //Perent method2
		System.out.println("=================");
		
		Child c=new Child();
		c.method1();	//Child method1
		c.method2(); //PArent method 2
		c.method3();  //Child method3
		
		System.out.println("==================");
		
		Parent p1=new Child();
		p1.method1();  //Parent method1
		p1.method2(); //parent method2
	}

}
