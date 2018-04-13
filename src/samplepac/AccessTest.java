package samplepac;

public class AccessTest {
	public int var1 = 1;
	protected int var2 = 5;
	int var3 = 10;
	private int var4 = 15;

	public static void main(String args[])
	{
		AccessTest atest = new AccessTest();
		System.out.println("Value of var1: " + atest.var1);
		atest.var1 = 2;
		System.out.println("Value of changed var1: " + atest.var1);
		
		System.out.println("Value of var2: " + atest.var2);
		atest.var2 = 6;
		System.out.println("Value of changed var2: " + atest.var2);
		
		System.out.println("Value of var3: " + atest.var3);
		atest.var3 = 11;
		System.out.println("Value of changed var3: " + atest.var3);
		
		System.out.println("Value of var4: " + atest.var4);
		atest.var4 = 16;
		System.out.println("Value of changed var4: " + atest.var4);
	}
}
