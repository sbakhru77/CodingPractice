package LeetCode;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//linear time and constant extra space complexity

public class MissingNumber {
	// XOR all nums of the array A1
	// XOR all nums from 1 to length of array A2
	// XOR A1 and A2, will give the missing number
	
	//2 ms runtime
	public static int missingNumber(int[] nums) {
        int a1 = 0, a2 = nums[0];
        int len = nums.length;	
        
        for(int i=1; i<=len; i++) {
        	a1 ^= i;
        }
        
        for(int i = 1; i < len; i++) {
        	a2 ^= nums[i];
        }
        
        return a1^a2;
    }
	
	// len - element of array + index
	public static int missingNum(int[] nums) {
		int sum = nums.length;
		for(int i = 0; i < nums.length; i++) {
			sum = sum - nums[i] + i;
		}
		
		return sum;
	}
	
	// Third approach 1,2,3...n = n*(n+1)/2. Try to find the sum and then substract the sum of all elements of array.
	// 0ms runtime
	public static int missingNumThird(int[] nums) {
		int sum = (nums.length * (nums.length+1))/2;
		
		for(int i = 0; i < nums.length; i++) {
			sum = sum - nums[i];
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		int[] num = {3,1,0};
		System.out.println(missingNumThird(num));
	}
}
