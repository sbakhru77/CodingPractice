package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
	
	static void solveWithHash(int[] arr, int money) {
        Map<Integer, Integer> IceCreamCost = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<arr.length; i++) {
        	int val = money - arr[i];
        	if (IceCreamCost.containsValue(val)) {
        		for(Integer key: IceCreamCost.keySet()) {
        			if (IceCreamCost.get(key) == val)
        				System.out.println((key + " " + (i+1)));
        		}
        		
        		break;
        	}
        	IceCreamCost.put(i+1, arr[i]);
        }
        
    }
	
	static int[] solveWithBinaryTree(int[] arr, int money) {
		int[] sortedArr = arr.clone();
		Arrays.sort(sortedArr);
		
		for(int i = 0; i<sortedArr.length; i++) {
			int val = money - sortedArr[i];
			int location = Arrays.binarySearch(sortedArr, i, sortedArr.length, val);
			
			if (location >= 0 && location < sortedArr.length && sortedArr[location] == val) {
				int index1 = findIndex(arr, sortedArr[i], -1);
				int index2 = findIndex(arr, val, index1);
				return new int[]{Math.min(index1, index2)+1, Math.max(index1, index2)+1};
			}
		}
		
		return null;
	}
	
	static int findIndex(int[] arr, int value, int exclude) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == value && i!= exclude)
				return i;
		}
		
		return -1;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        
        for(int a0 = 0; a0 < trips; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            
            //solveWithHash(arr, money);
            System.out.println(Arrays.toString(solveWithBinaryTree(arr, money)));
        }
        in.close();
    }
    
    
    
}
