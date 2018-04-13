package crachCode;

import java.util.HashMap;

public class FirstNonrepeatedChar {

	public static void main(String args[]) {
		String[] str = {"eeteeter","cacdr", "", "a"};
		
		for (int j=0; j<str.length; j++) {
			System.out.println(str[j] + " has first unique char - " + getFirstNotRepeated(str[j]));	
		}
		
	}
	
	// Create a hash map for all chars in string with the count of its occurance. Return the first char found with count as 1. This takes O(n) time
	public static Character getFirstNotRepeated(String str) {
		HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();
		Integer count = 0;
		int i;
		
		if (str.length() == 0 || str == null)
			return null;
		
		if (str.length() == 1)
				return str.charAt(0);
		
		for (i=0; i<str.length(); i++) {
			count = charHash.get(str.charAt(i));
			if (count == null || count == 0) {
				charHash.put(str.charAt(i), 1);
			}
			else {
				charHash.put(str.charAt(i), ++count);
			}
		}
		
		for (i=0; i<str.length(); i++) {
			if (charHash.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}
		
		return null;
	}
	
	// Search each char with rest of the string chars and maintain a counter. 
	// After the comparison return the first char with count 1. Since each char is visited twice this takes O(n2) time
}
