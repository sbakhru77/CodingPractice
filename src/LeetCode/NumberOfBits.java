package LeetCode;

public class NumberOfBits {
	
	
	// >>> right shifts - unsigned operation
	// >> signed operation for right shifting
	public static int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
        	count = count + (n & 1);
  	
        	n = (n >>> 1);
        }
        
        return count;
    }
	
	public static void main(String args[]) {
		System.out.println(hammingWeight(11));
	}
}
