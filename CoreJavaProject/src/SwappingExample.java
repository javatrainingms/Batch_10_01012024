
public class SwappingExample {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp=a;   //temp=10,a=10,b=20
		a=b;			//temp=10,a=20,b=20
		b=temp;    //temp=10, a=20,b=10
		
		System.out.println("a>>>"+a);
		System.out.println("b>>>"+b);
		
	}

}
