package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *	You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 */

public class TwoSum {

	public int[] twoSumSolution(int[] nums, int target) {
        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
       
        for (int i = 0 ; i < nums.length; i++) {
        	
        	int value = target - nums[i];
        	if (arrMap.containsKey(value)) {
        		return new int[]{arrMap.get(value),i};
        	}
        	
        	arrMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
	
	public static void main(String args[]) {
		TwoSum twoSum = new TwoSum();
		int[] solution = new int[2];
		
		solution = twoSum.twoSumSolution(new int[]{1,2,3,4,5}, 7);
		System.out.println("{"+solution[0]+","+solution[1]+"}");
		
		solution = twoSum.twoSumSolution(new int[]{0,0,1,5,5}, 0);
		System.out.println("{"+solution[0]+","+solution[1]+"}");

		solution = twoSum.twoSumSolution(new int[]{0,0,1,5,5}, 10);
		System.out.println("{"+solution[0]+","+solution[1]+"}");

		solution = twoSum.twoSumSolution(new int[]{0,0,1,5,5}, 1);
		System.out.println("{"+solution[0]+","+solution[1]+"}");
		
	}
}