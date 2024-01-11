
public class ToFindEvenNumbersFromArray {
	public static void main(String[] args) {
		int arr[]= {6,23,7,3,8,23,75,25,67,10};
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] %2 ==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
