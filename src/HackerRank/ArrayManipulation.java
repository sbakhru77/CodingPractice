package HackerRank;

import java.util.Scanner;

/**
 * @author sbakhru
 *
 * Given an array of size n - initialized to 0. Take input of array size and operation number (m) from command line
 * Given 3 integer values a, b, c - put value c from a - b indices of the array (both a and b indices inclusive)
 * Perform the above operation for m times the integers are given
 * At the end give the maximum value in the array as output
 * 
 */

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = 0;
        }
        
        int max = 0;
        
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
           	while (a<=b) {
           		arr[a-1] = arr[a-1] + k;
           		a++;
           	}
            		
            max = findMax(arr); 
        }
        in.close();
        
        System.out.println(max);
    }
    
    public static int findMax(int[] arr) 
    {
    	int max = arr[0];
    	
    	for (int i = 1; i<arr.length; i++) {
    		if (max < arr[i])
    			max = arr[i];
    	}
    	
    	return max;
    }
    
}
