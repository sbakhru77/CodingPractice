package LeetCode;

//Given an array of integers, every element appears twice except for one. Find that single one in linear time, without extra memory
public class SingleNumber {
	public int singleNumber(int[] nums) {
		int singleNum = 0;
		for(int num: nums) {
			singleNum ^= num;
		}
        return singleNum;
    }
}
