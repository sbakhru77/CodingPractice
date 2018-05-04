package LeetCode;

import java.util.HashSet;

//A happy number is a number defined by the following process: Starting with any positive integer, 
//replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), 
//or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

public class HappyNumber {
	public static boolean isHappy(int n) {
		if(n<10) {
			if (n==1 || n==7)
				return true;
			else
				return false;
		}
		
		int newNum = 0;
		
		while (n>0) {
			newNum += (n%10)*(n%10);
			n = n/10;
		}
		
		System.out.println(newNum);
		
		return isHappy(newNum);
			
    }
	
	//leetcode solution
	//Since HashSet contains unique values only, any number that is not happy will run into endless loop. 
	//Using set will break the look and return false
	public static boolean isHappy2(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(set.add(n)){
            int res = 0;
            while(n>0){
                int remain = n%10;
                res += remain*remain;
                n /=10;
            }
            if(res==1) return true;
            n=res;
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isHappy2(123));
	//	System.out.println(isHappy2(19));
//		System.out.println(isHappy2(7));	
	}
}
