package com.oops._10012024.Project;

public class SuzakiManufacture {
	
	public SuzakiBike makingSuzakiBike(int cc, String color,String gear,String mirrors)
	{
		SuzakiBike s=new SuzakiBike();
		s.setCC(cc);
		s.setColor(color);
		s.setGrear(gear);
		s.setMirrors(mirrors);
		
		return s;
	}

}
