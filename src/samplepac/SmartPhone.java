package samplepac;

import java.util.Scanner;

public abstract class SmartPhone implements Phone {

	private int a = 15;
	
	public abstract void openNavigation();
	
	static void test(){};
	
	protected void camera(){
		System.out.println("Camera...Click a picture");
	}
	
	int getA(){
		return a;
	}
	
	void makecall(int n){
		System.out.println("Making call to number "+ n);
	}
	
	//The signature of the dial methods are different...this is overloading
	void dial(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		makecall(n);
	}
	
	void dial(int n){
		makecall(n);
	}
}
