package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/** You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they're all the same height, then print the height. The removals must be performed in such a way as to maximize the height.
**/

public class EqualStacks {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n1 = in.nextInt();
	        int n2 = in.nextInt();
	        int n3 = in.nextInt();
	        int h1[] = new int[n1];
	        for(int h1_i=0; h1_i < n1; h1_i++){
	            h1[h1_i] = in.nextInt();
	        }
	        int h2[] = new int[n2];
	        for(int h2_i=0; h2_i < n2; h2_i++){
	            h2[h2_i] = in.nextInt();
	        }
	        int h3[] = new int[n3];
	        for(int h3_i=0; h3_i < n3; h3_i++){
	            h3[h3_i] = in.nextInt();
	        }
	        
	        int result = getMaxHeightofStack(h1, h2, h3);
	        
	        System.out.println(result);
	    }
	   
	   
	   public static int getMaxHeightofStack(int a1[], int a2[], int a3[]) {
		   
		   if (a1.length == 0 || a2.length == 0 || a3.length == 0)
			   return 0;
		   
		   Stack<Integer> hash1 = new Stack<Integer>();
		   Stack<Integer> hash2 = new Stack<Integer>();
		   Stack<Integer> hash3 = new Stack<Integer>();

		   for(int i = 0; i< a1.length; i++) {
			   if (i == 0) 
				   hash1.add(a1[i]);
			   else
				   hash1.add(a1[i]+a1[i-1]);
		   }
		   
		   for(int i = 0; i< a2.length; i++) {
			   if (i == 0) 
				   hash2.add(a2[i]);
			   else
				   hash2.add(a2[i]+a2[i-1]);
		   }
		   
		   for(int i = 0; i< a3.length; i++) {
			   if (i == 0) 
				   hash3.add(a3[i]);
			   else
				   hash3.add(a3[i]+a3[i-1]);
		   }
		   
		  if (!(hash1.size()==hash2.size()) && !(hash1.size()==hash3.size())) {
			  if (hash1.size() < hash2.size()) {
				  if (hash1.size() < hash3.size()) {
					  while(!hash1.isEmpty()) {
						  int item = hash1.pop();
						  
						  if(hash2.contains(item) && hash3.contains(item))
							  return item;
						  
					  }
				  }
				  else {
					  while(!hash3.isEmpty()) {
						  int item = hash3.pop();
						  
						  if(hash1.contains(item) && hash2.contains(item))
							  return item;
						  
					  }
				  }
			  }
			  else {
				  while(!hash2.isEmpty()) {
					  int item = hash2.pop();
					  
					  if(hash1.contains(item) && hash3.contains(item))
						  return item;
					  
				  }
			  }
		  }
		  else
			  return hash1.pop();
		  
		  return 0;
		   
	   }
}
