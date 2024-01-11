package com.oops._10012024.Project;

public class AllBikesAreAvialable {
	
	public static HondaBike getHondaBikeFromShoroom(int cc, String color,String gear,String mirrors)
	{
		HondaBike h=HondaShowroom.getHondaBike(cc, color, gear, mirrors);
		return h;
	}
	
	public static SuzakiBike getSuzakiBikeFromShoroom(int cc, String color,String gear,String mirrors)
	{
		SuzakiBike s=SuzakiShowroom.getSuzakiBike(cc, color, gear, mirrors);
		return s;
	}
	
	
	public static Bike getBike(String type,int cc, String color,String gear,String mirrors)
	{
		Bike b=new Bike();
		if(type.equals("honda"))
		{
			b=getHondaBikeFromShoroom(cc, color, gear, mirrors);
		}
		
		if(type.equals("suzaki"))
		{
			b=getSuzakiBikeFromShoroom(cc, color, gear, mirrors);
		}
	
		
		return b;
	}

}
