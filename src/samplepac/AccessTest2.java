package samplepac;

public class AccessTest2 {

	public static void main(String args[]){
		
		AccessTest at = new AccessTest();
		
		System.out.println("Access public var1 value from another class: " + at.var1);
		System.out.println("Access protected var2 value from another class: " + at.var2);
		System.out.println("Access default var3 value from another class: " + at.var3);
		//Access private variable from another class in any package does not work
		//System.out.println("Access private var4 value from another class: " + at.var4);
		
	}
}
