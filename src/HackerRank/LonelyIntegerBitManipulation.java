package HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class LonelyIntegerBitManipulation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int[] num_array = new int[num];
		
		for(int i = 0; i<num; i++) {
			num_array[i] = in.nextInt();
		}
		
		//getLonelyInteger(num_array);
		System.out.println(getLonelyIntegerUsingBitMap(num_array));
	}
	
	// Time complexity: O(n)
	// Space complexity: O(n)
	public static void getLonelyInteger(int[] num_array) {
		
		HashSet<Integer> countInt = new HashSet<Integer>();
		
		for (int num : num_array) {
			if (countInt.contains(num))
				countInt.remove(num);
			else
				countInt.add(num);
		}
		
		for (Integer lonelyInt: countInt)
			System.out.println(lonelyInt);
		
	}
	
	// Time complexity: O(n)
	// Space complexity: O(1)
	public static int getLonelyIntegerUsingBitMap(int[] num_array) {
		int lonelyInt = 0;
		
		for (int num : num_array) {
			lonelyInt ^= num;
		}
		
		return lonelyInt;
	}
}
