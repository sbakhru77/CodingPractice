package LeetCode;

//Determine whether an integer is a palindrome. Do this without extra space.


public class PalindromeInt {

    public static boolean isPalindrome(int x) {
        
    	if ((x < 0) || (x%10 == 0 && x!=0))
    		return false;
    	
    	// revert the half of the integer value and compare with other half. If they are equal then int is palindrome.
    	// In case of odd digits in integer ignore the middle digit
    	
    	int revertedHalf = 0;
    	
    	while (revertedHalf < x) {
    		revertedHalf = (revertedHalf * 10) + (x % 10);
    		
    		x = (x / 10);
    	}
    	
    	return (x == revertedHalf) || x == (revertedHalf/10);
    }
    
    public static void main(String args[]) {
    	
    	System.out.println(isPalindrome(1221));
    	System.out.println(isPalindrome(12321));
    	System.out.println(isPalindrome(425521));
    	System.out.println(isPalindrome(2020));
    	System.out.println(isPalindrome(-1221));
    	System.out.println(isPalindrome(0));
    	
    }

}
