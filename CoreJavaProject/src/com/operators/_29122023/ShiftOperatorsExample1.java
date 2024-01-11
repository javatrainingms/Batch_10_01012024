package com.operators._29122023;

public class ShiftOperatorsExample1 {
	public static void main(String[] args) {
		String govtIDCard="drivinglicence";
		if(govtIDCard.equals("adhar") || govtIDCard.equals("pancard") )
		{
			System.out.println("he is eligible for interview");
		}
		else
		{
			System.out.println("he is not eligible..");
		}
	}

}
