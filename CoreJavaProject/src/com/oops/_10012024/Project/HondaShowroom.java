package com.oops._10012024.Project;

public class HondaShowroom {
	
	public static HondaBike getHondaBike(int cc, String color,String gear,String mirrors)
	{
		HondaBike honda=HondaManufacture.getMakingHondaBike(cc, color, gear, mirrors);
		honda.setPrice(getPrice(honda));
		
		return honda;
	}
	

	private static double getPrice(HondaBike h)
	{
		double price=0;
		if(h.getGrear().equalsIgnoreCase("withgear"))
		{
			price=70000;
		}
		
		else if(h.getGrear().equalsIgnoreCase("withoutgear"))
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
