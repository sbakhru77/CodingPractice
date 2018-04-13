package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers, find if the array contains any duplicates. 
// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

public class ContainsDuplicate {
	
	//19ms
	public static boolean containsDuplicate(int[] nums) {
        Boolean isDup = false;
        
        Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        
        for(Integer n: nums) {
        	if (numCount.containsKey(n)) {
        		isDup = true;
        		break;
        	}
        	numCount.put(n, 1);
        }
        
        return isDup;
    }
	
	//6ms
	public static boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		
		for(int i = 0; i<nums.length-1; i++) {
			if (nums[i] == nums[i+1]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		System.out.println(containsDuplicate2(new int[] {1,2,3,4}));
		System.out.println(containsDuplicate2(new int[] {1,2,1,4}));

	}
}
