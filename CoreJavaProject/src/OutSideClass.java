
public class OutSideClass {
	
	public static void main(String[] args) {
		VariableExample v=new VariableExample();
		System.out.println(v.name);
		

		VariableExample1 v1=new VariableExample1();
		System.out.println(v1.name);
		//OR
		System.out.println(VariableExample1.name);
	}

}
