package LeetCode;

public class MoveZeros {
	public static void moveZeroes(int[] nums) {
		//count of non-zero elements
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
        	if (nums[i] != 0) {
        		nums[count++] = nums[i];
        	}
        }
        
        // count is incremented to total of non-zero elements that are shifted to beginning of array.
        // Rest of the array from count position is 0 till the length of array
        while (count < nums.length) {
        	nums[count] = 0;
        	count++;
        }
    }
	
	public static void main(String args[]) {
		int[] nums = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		moveZeroes(nums);
		System.out.println("Array after zero is shifted to end --- ");
		for (int i=0; i<nums.length; i++)
            System.out.print(nums[i]+" ");
	}
}


