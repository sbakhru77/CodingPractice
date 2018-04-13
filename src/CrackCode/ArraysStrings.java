package CrackCode;

import java.util.Arrays;

// Determine if a string has all unique characters without using additional data structures

public class ArraysStrings{
	
	public static boolean isUniqueCharString(String str) {
	
	  boolean char_set[] = new boolean[256];
	
	  for (int i=0; i<str.length(); i++) {
	      int ch = str.charAt(i);
	
    	  if (char_set[ch]) 
    		  return false;
	    	  
    	  char_set[ch] = true;
	      
	  }
	
	  return true;
	}
	
	//Reverse a string
	public static String reverseString(String str) {
		StringBuffer newStr = new StringBuffer();
		
		if (str.length() <= 1)
			return str;
		else {
			for(int i=str.length()-1; i>=0; i--) {
				newStr.append(str.charAt(i));
			}
		}
		
		return newStr.toString();
	}
	
	//Remove duplicate characters from the string. Uses extra memory. 
	public static String removeDupsChar(char[] ch) {
		
		boolean[] isCharHit = new boolean[256];
		StringBuffer sb = new StringBuffer(ch.length);
		
		for (int i=0; i<ch.length; i++) {
			if (!isCharHit[ch[i]]) {
				isCharHit[ch[i]] = true;
				sb.append(ch[i]);
			}
		}
		 
		return sb.toString();
	}
	
	
	

	public static void main(String args[]) {
//	  	System.out.println(isUniqueCharString("Thimyr ng"));
//	  	System.out.println(isUniqueCharString("Thismystring"));
	  
//		System.out.println("Reversed string: " + reverseString("reverse me please"));
//		System.out.println("Reversed string: " + reverseString("re"));
//		System.out.println("Reversed string: " + reverseString(" "));
		
		String str = "1";
		char[] ch = str.toCharArray();
		removeDupsChar(ch);
	
		System.out.print(removeDupsChar(ch));
	}
}