package HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalanceCheck {
	
	   static String isBalanced(String s) {

		   if (s.length() == 0 || s == null)
			   return "YES";
		   
		   Stack<Character> brackets = new Stack<Character>();
		      
		   for (int i = 0; i < s.length(); i++){
			   char ch = s.charAt(i);
			   
			   if ((ch=='{') || (ch=='(') || (ch=='[')) {
				   brackets.push(ch);
				   continue;
			   }
			   
			   if (!brackets.isEmpty()) {
				   if ((ch=='}') && (brackets.peek() == '{'))
					   brackets.pop();
				   else if ((ch==']') && (brackets.peek() == '['))
					   brackets.pop();
				   else if ((ch==')') && (brackets.peek() == '('))
					   brackets.pop();
				   else
					   continue;

			   }
			   else {
				   if ((ch=='}') || (ch==')') || (ch==']')) {
					   return "NO";
				   }
			   }
			   	
		   }
		   
		   if(!brackets.isEmpty()) {
			   return "NO";	
		   }
		   else
			   return "YES";
	   }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String t = in.next();
	        
	        String result = isBalanced(t);
	        System.out.println(result);
	        
	        in.close();
	    }
}
