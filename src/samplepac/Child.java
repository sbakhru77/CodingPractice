package samplepac;

public class Child extends Parent {
	int e = 5;
	public int f = 6;
	
	public void method2(){
		System.out.println("Inside child method");
	}
	
	public static void main(String[] args){
		Child ch = new Child();
		System.out.println("Value of parent child variables: " + ch.a + " "+ ch.b + " "+ ch.c + " "+ ch.e + " "+ ch.f );
		ch.method1();
		ch.method2();
	}
}
