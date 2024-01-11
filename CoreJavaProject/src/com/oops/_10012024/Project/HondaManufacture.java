package com.oops._10012024.Project;

public class HondaManufacture {
	public static HondaBike getMakingHondaBike(int cc, String color,String gear,String mirrors)
	{
		HondaBike honda=new HondaBike();
		honda.setCC(cc);
		honda.setColor(color);
		honda.setGrear(gear);
		honda.setMirrors(mirrors);
		return honda;
	}

}
