package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countElement = new HashMap<Integer, Integer>();
        int count = 1;
        int result = -1;
        for(Integer num: nums) {
        	if (countElement.containsKey(num))
        		countElement.put(num, count+countElement.get(num));
        	else
        		countElement.put(num,count);
        }
        
        for(Integer key: countElement.keySet()) {
        	if (countElement.get(key) > (nums.length / 2)) {
        		result = key;
        		break;
        	}
        }
        
        return result;
    }
	
	public static void main(String args[]) {
		//int[] nums = {1,7,1,7,4,7,7,6,6,7,7,2};
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}
}
