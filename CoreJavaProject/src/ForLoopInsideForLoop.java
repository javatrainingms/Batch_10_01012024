
public class ForLoopInsideForLoop {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
/*
first outter for loop
		i=0
			inner loop
				j=0
					0 0
				j=1
					0 1
				j=2
					0 2
				j=3
					03 
				j=4 
					04 
			exit the inner loop
	
	i==>1
	
		inner loop	
			j=0
				10
				11
				12
				13
				14
				......
				


*/