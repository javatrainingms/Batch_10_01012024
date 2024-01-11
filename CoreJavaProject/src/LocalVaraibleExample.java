
public class LocalVaraibleExample {
	
	public static void main(String[] args) {
	
		int a=45;
		int b=56;
		int c=45;
		int d=67;
		int e=23;
	
//		int res=sumCalculater(m1, m2, m3, m4, m5);
//		System.out.println("res==>"+res);
		//OR
		System.out.println(sumCalculater(a, b, c, d,e));
	}
	
	static int sumCalculater(int m1,int m2,int m3,int m4,int m5)
	{
		int sum=m1+m2+m3+m4+m5;
		return sum;
	}
	

}
