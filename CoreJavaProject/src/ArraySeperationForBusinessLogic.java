
public class ArraySeperationForBusinessLogic {

	public static void main(String[] args) {
		int arr[]= {6,3,7,2,7,2};
		int sum=sumcalc(arr);
		System.out.println("sum value>>>"+sum);
		//OR
		System.out.println("sum value>>>1>>>"+sumcalc(arr));
		
		int arr1[]= {5,3,6,3,7,};
		System.out.println("sum value>>>2>>>"+sumcalc(arr1));
		
		int arr2[]= {5,3,6,3,7,6,4,7,4,7};
		System.out.println("sum value>>>3>>>"+sumcalc(arr2));
		
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
