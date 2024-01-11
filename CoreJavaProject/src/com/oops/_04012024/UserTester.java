package com.oops._04012024;

public class UserTester {

	public static void main(String[] args) {
		Address tempAdd=new Address();
		tempAdd.setCity("Hyderabad");
		tempAdd.setState("TS");
		tempAdd.setPincode(500018);
		
		Address permAdd=new Address();
		permAdd.setCity("Vijayawada");
		permAdd.setState("AP");
		permAdd.setPincode(523456);
		
//		Address addArray[]=new Address[2]; //if i have idea for length
//		addArray[0]=tempAdd;
//		addArray[1]=permAdd;
		
		//OR
		Address addArray[]= {tempAdd,permAdd};  //i dont have idea for length
		
		User u=new User();
		u.setUsername("ranjith");
		u.setPassword("ranjith@123");
//		u.setAddress(new Address[] {tempAdd,permAdd});//i dont have idea for length
		u.setAddress(addArray);
		
		System.out.println(u);
		
	}
}
