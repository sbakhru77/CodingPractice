package LeetCode;

public class reverseInteger {
	public static int reverse(int x) {
		String mod;
		
        if (x%10 == x) return x;
        
        mod = String.valueOf(x % 10) + reverse(x/10);
        
        if (Integer.parseInt(mod) > Integer.MAX_VALUE || Integer.parseInt(mod) < Integer.MIN_VALUE) return 0;
        else return Integer.parseInt(mod) ;
    }
	
	public static void main(String args[]) {
		System.out.println(reverse(123));
		System.out.println(reverse(0));
		System.out.println(reverse(320));
		//System.out.println(reverse(1111111113 ));
	}
}

