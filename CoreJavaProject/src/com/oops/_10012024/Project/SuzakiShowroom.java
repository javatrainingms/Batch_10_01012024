package com.oops._10012024.Project;

public class SuzakiShowroom {
	
	public static SuzakiBike getSuzakiBike(int cc, String color,String gear,String mirrors)
	{
		SuzakiManufacture sm=new SuzakiManufacture();
		SuzakiBike s=sm.makingSuzakiBike(cc, color, gear, mirrors);
		s.setPrice(getPrice(s));
		return s;
	}

	private static double getPrice(SuzakiBike s)
	{
		double price=0;
		if(s.getGrear().equalsIgnoreCase("withgear"))
		{
			price=70000;
		}
		
		else if(s.getGrear().equalsIgnoreCase("withoutgear"))
		{
			price=65000;
		}
		else
		{
			price=50000;
		}
		
		return price;
	}
}
