package com.oops._05012024;

public class HospitalMangementSystem {
	
	public static void main(String[] args) {
		Patient p=new Patient(123,"Ganesh","fever");
		Patient p1=new Patient(156,"Rammurty","cold");
		
		Patient[] array= {p,p1};
		
		
		
		
		Doctor d=new Doctor();
		d.setId(101);
		d.setName("raju");
		d.setPosition("General surgin");
		d.setPatients(array);//data
		
		System.out.println(d);
	}

}
