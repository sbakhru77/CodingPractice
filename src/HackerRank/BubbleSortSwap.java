package HackerRank;

import java.util.Scanner;

public class BubbleSortSwap {

	static int[] array;
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		array = new int[num];
		
		for(int i = 0; i<num; i++) {
			array[i] = in.nextInt();
		}
		
		System.out.println("Array is sorted in " + bubbleSort() + " swaps.");
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[array.length-1]);
	}
	
	public static int bubbleSort() {
		int swapCnt = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if (array[j] > array[j+1]) {
					swap(j, j+1);
					swapCnt++;
				}
			}
		}
		
		return swapCnt;
	}
	
	public static void swap(int firstindex, int secondindex) {
		int temp = array[firstindex];
		array[firstindex] = array[secondindex];
		array[secondindex] = temp;
	}
}
