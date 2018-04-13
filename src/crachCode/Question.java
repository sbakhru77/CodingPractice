package crachCode;

import java.util.LinkedHashSet;

public class Question {

	//Approach#1 Sort the elements, in a loop compare current char with previous char and delete dups
	// This one doesn't preserve the order
	
	// Approach#2 characters are sorted in output string
	public static String removeDuplicatesSorted(String str) {
		int[] charCnts = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			charCnts[ch]++;
		}
		
		StringBuilder sb = new StringBuilder(charCnts.length);
		
		for(int i = 0; i<charCnts.length; i++) {
			if(charCnts[i] > 0)
				sb.append((char) i);
		}
		
		return sb.toString();
	}
	
	public static String removeDuplicatesPreserveOrder(String str) {
		boolean[] charSeen = new boolean[256];
		StringBuilder sb = new StringBuilder(charSeen.length);
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!charSeen[c]) {
				charSeen[c] = true;
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	
	   /* Function removes duplicate characters from the string - using LinkedHashSet which stores only unique chars
    This function work in-place */
    static void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
    
	public static void main(String[] args) {
		String s = "helloiloveyou";
		char[] arr = s.toCharArray();
		//removeDuplicates(s);
		String str = removeDuplicatesSorted(s);
		System.out.println(str);
		
		System.out.println("String without dups - " + removeDuplicatesPreserveOrder(s));
		
		//removeDuplicatesEff(s);
//		System.out.print(AssortedMethods.charArrayToString(arr));
	}

}
