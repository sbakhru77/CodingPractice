package crachCode;

public class Factorial {
	public static int findFactorialRecursive(int val) {
		
		if (val == 0)
			return 0;
		
		while (val > 1) {
			return (val * findFactorial(val - 1));
		}
		
		return 1;
	}
	
	public static int findFactorial(int val) {
	
		for (int i = val; i>1; i--) {
			val = val * (i-1);
		}
		
		return val;
	}
	
	public static void main(String args[]) {
		System.out.println("Factorial value of 3 " + findFactorial(3));
		System.out.println("Factorial value of 10 " + findFactorial(10));
		System.out.println("Factorial value of 4 " + findFactorial(4));
		System.out.println("Factorial value of 1 " + findFactorial(1));
		System.out.println("Factorial value of 0 " + findFactorial(0));
	}
}
