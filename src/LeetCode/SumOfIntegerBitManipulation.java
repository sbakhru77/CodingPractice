package LeetCode;

// add two integers without using arithmetic operator
//0010 - 2 ^ 4 = 6
//0100 - 4
//0110	- 6

//0010 - 2
//1111	- 15
//1101

public class SumOfIntegerBitManipulation {
	public static int getSum(int x, int y) {
//        int carry = (a&b) << 1;
//        
//        return (a^b + carry);
		
		 while (y != 0) 
	        {
	            // carry now contains common
	            // set bits of x and y
	            int carry = x & y;
	 
	            // Sum of bits of x and 
	            // y where at least one 
	            // of the bits is not set
	            x = x ^ y;
	 
	            // Carry is shifted by 
	            // one so that adding it 
	            // to x gives the required sum
	            y = carry << 1;
	        }
	        return x;
    }
	
	public static void main(String args[]) {
		System.out.println(getSum(2,15));
		System.out.println(getSum(2,4));
		System.out.println(getSum(20,30));
	}
}
