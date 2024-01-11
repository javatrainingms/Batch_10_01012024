package com.operators._29122023;

public class NullCheckExample {

	public static void main(String[] args) {
//		String s="somedata";
		String s=null;
		
		if(s!=null)
		{
			System.out.println("4 th postion>>"+s.charAt(4));
		}
		else
		{
			System.out.println("s value is null");
		}
	}
}
