package com.operators._29122023;

public class DoubleEqualsVsEqualsMEthod {
	public static void main(String[] args) {
		String s="data";
		String s1="data";
		String s2=new String("data");
		
		System.out.println("(s==s1)>>>"+(s==s1));
		System.out.println("(s==s2)>>>"+(s==s2));
		
		
		System.out.println("s.equals(s1)>>>>"+(s.equals(s1)));
		System.out.println("s.equals(s2)>>>>"+(s.equals(s2)));
	}

}
