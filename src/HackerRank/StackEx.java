package HackerRank;

import java.util.Scanner;
import java.util.Stack;

// Find max element in the stack after push and pop operations
public class StackEx {
	
	static Stack<MaxStack> stack = new Stack<MaxStack>();
	
	private static class MaxStack {
		int val;
		int max;
		
		public MaxStack(int v, int m) {
			val = v;
			max = m;
		}
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 // number of operations performed
		 int num = sc.nextInt();
		 int max = Integer.MIN_VALUE;

		 while (num > 0) {
			 // option 1 is to push val, option 2 is to pop and option 3 is to print max value
			 int option = sc.nextInt();
			 
			 if (option == 1) {
				 int item = sc.nextInt();
				 max = Math.max(item, max);
				 stack.push(new MaxStack(item, max));
			 }
			 if (option == 2) {
				 if (!stack.empty()) 
					 stack.pop();
				 
				 if (stack.isEmpty())
					 max = Integer.MIN_VALUE;
				 else
					 max = stack.peek().max;
			 }
			 if (option == 3) {
				 if (!stack.isEmpty())
					 System.out.println(stack.peek().max);
			 }
		 
			 num--;
		 }
	 }
}
