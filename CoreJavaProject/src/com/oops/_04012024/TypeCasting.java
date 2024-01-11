package com.oops._04012024;

public class TypeCasting {
	
	public static void main(String[] args) {
		byte b=10;
		
		int i=b; //byte value converted into int
		
		System.out.println("int value>>>"+i);
		
		long l=100;
		byte b1=(byte)l;
		System.out.println(b1);
		
		
		int i1=3400;
		byte b2=(byte)i1;
		
		System.out.println("b2 value>>>"+b2);
	}

}
