
public class TestConstructor {
	static int n = 0;

	TestConstructor(){
		n = n + 1;
	}
	
	TestConstructor(String s){
		System.out.println(s);
	}
	
	public static void main(String args[]){
		TestConstructor tc = new TestConstructor();
		System.out.println("value of this obj is " + tc.n);
		
		TestConstructor tc2 = new TestConstructor();
		System.out.println("value of second obj is " + tc2.n);
		
		TestConstructor tc3 = new TestConstructor("Trying to test overloading");
		System.out.println("value of this obj is " + tc3.n);
	}
}
