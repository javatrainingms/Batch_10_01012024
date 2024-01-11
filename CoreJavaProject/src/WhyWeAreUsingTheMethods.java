
public class WhyWeAreUsingTheMethods {
	
	
	public static void main(String[] args) {
		System.out.println(sumCal(30,20,10));
		System.out.println(sumCal(10,20,40));
		System.out.println(sumCal(20,40,56));
	}
	
	
	
	
	static int sumCal(int n1,int n2,int n3)
	{
		int sum=n1+n2+n3;
		return sum;
	}

//	public static void main(String[] args) {
//		int n1=20;
//		int n2=30;
//		int n3=20;
//		
//		int sum=n1+n2+n3;
//		System.out.println("sum value>>"+sum);
//		
//		int n11=10;
//		int n21=30;
//		int n31=40;
//		int sum1=n11+n21+n31;
//		System.out.println("sum value for client2>>"+sum1);
//		
//	}
}
