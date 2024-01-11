
public class Array_summation_usingIterate {
	public static void main(String[] args) {
		int arr[]= {6,3,7,2,7,2};
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
		
			sum =sum+arr[i];
		}
		
		System.out.println("sum value>>>"+sum);
	}

}
/*
first loop
============
i=0,sum=0
	i<6 ==>true	
			sum=sum+arr[0]==>sum=0+6==>sum=6
			
		i++ ==>i=i+1 ==>i=0+1===>i=1


second loop
================
i=1 sum=6
	i<6 ==>true
		sum=sum+arr[1]==>sum=6+3=>sum=9
		i=1+1==>i=2


		
	
	


*/