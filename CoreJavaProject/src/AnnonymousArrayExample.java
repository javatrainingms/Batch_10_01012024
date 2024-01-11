
public class AnnonymousArrayExample {
	
	public static void main(String[] args) {
		int arr[]= {5,3,7};
		System.out.println(sumcalc(arr));
		
		System.out.println(sumcalc(new int[] {6,3,7,3,7,3,7}));
		
		//100 lines 
		System.out.println(arr[1]);
		System.out.println();
		
	}
	

	public static int sumcalc(int arr[])
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum =sum+arr[i];
		}
		
		return sum;
	}
	

}
