package LeetCode;

//Given a 32-bit signed integer, reverse digits of an integer.

public class reverseInteger {
	// long is used for sum to handle overrun
	public static int reverse(int x) {
		 if (x%10 == x) return x;
		
		 long sum = 0;
		 
		 while(x != 0) {
			 sum = (sum * 10) + (x % 10);
			 x = x / 10;		 
		 }
		 
		 if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;
		 
		 return (int) sum;
	}
	
	
	public static void main(String args[]) {
		System.out.println(reverse(123));
		System.out.println(reverse(0));
		System.out.println(reverse(320));
		System.out.println(reverse(1534236469));
		System.out.println(reverse(-123));
	}
}

