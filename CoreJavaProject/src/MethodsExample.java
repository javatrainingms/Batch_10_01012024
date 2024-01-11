
public class MethodsExample {
	
	
	//instance method
	public void instanceMethod1()
	{
		System.out.println("this is instance method..");
	}
	
	
	public static void staticMethod()
	{
		System.out.println("this is static method....");
	}

	
	public static void main(String[] args) {
		MethodsExample m=new MethodsExample();
		m.instanceMethod1();
		
		staticMethod();
		MethodsExample.staticMethod();
	}
}
