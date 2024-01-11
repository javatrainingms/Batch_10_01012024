import java.util.ArrayList;

public class CollectionExample {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(124);
		al.add("data");
		al.add(34.6f);
		al.add(true);
		al.add('a');
		
		System.out.println("al>>>"+al);
		System.out.println("al size>>>"+al.size());
		
		al.add(245);
		al.add(124);
		
		System.out.println("al>>>"+al);
		System.out.println("al size>>>"+al.size());
	
		System.out.println("data is avaible in al>>>"+al.contains("data"));
		
		al.remove(new Character('a'));
		al.remove(true);
		al.remove("data");
		System.out.println("al>>>"+al);
		System.out.println("al size>>>"+al.size());
		
	}

}
