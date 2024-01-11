package com.operators._30122023;

public class ContinueStatement {
	public static void main(String[] args) {
		
//		for(int i=2;i<1000;i=i+2)
//		{
//			System.out.println("i value>>>"+i);
//		}
		
		//OR
		for (int i = 2; i < 1000; i++) {

			if(i%2==0)
			{
				continue;
			}
			System.out.println("i>>"+i);
		}
	}

}
