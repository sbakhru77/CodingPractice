
public class staticPractice {

	
	int b = 20;
	static int a = 10;
	
	public static void main(String args[]){
		staticPractice a1 = new staticPractice();
		a1.b = 25;
		a1.a = 15;
		
		staticPractice a2 = new staticPractice();
//		a2.b = 35;
//		a2.a = 17;
		
		System.out.println("a1 object value of b var: " + a1.b);
		System.out.println("a1 object value of a var: " + a1.a);
		
		System.out.println("a2 object value of b var: " + a2.b);
		System.out.println("a2 object value of a var: " + a2.a);
		
	}
}
