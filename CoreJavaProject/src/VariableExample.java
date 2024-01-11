
public class VariableExample {
	String name="raju";
	
	
	public void method1()
	{
		System.out.println(name);
		//OR
		VariableExample v=new VariableExample();
		System.out.println(v.name);
		
	}
	
	public static void method2()
	{
//		System.out.println(name);  //compile time error
		
		VariableExample v=new VariableExample();
		System.out.println(v.name);
	}
	

}
