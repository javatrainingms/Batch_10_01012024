
public class VariableExample1 {
	static String name="raju";
	
	
	public void method1()
	{
		System.out.println(name);
		//OR
		VariableExample1 v=new VariableExample1();
		System.out.println(v.name);
		
		//Or
		System.out.println(VariableExample1.name);
		
	}
	
	public static void method2()
	{
		System.out.println(name);
		//OR
		VariableExample1 v=new VariableExample1();
		System.out.println(v.name);
		
		//Or
		System.out.println(VariableExample1.name);
	}

}
