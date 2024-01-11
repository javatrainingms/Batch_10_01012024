package com.operators._30122023;

import java.util.Iterator;

public class BreakStatement {
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println("i value>>>"+i);
			if(i==100)
			{
				System.out.println("house full");
				break;
			}
		}
	}

}
