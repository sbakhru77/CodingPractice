package LeetCode;

import java.util.HashMap;
import java.util.Map;

//Given two strings s and t, write a function to determine if t is an anagram of s.
public class ValidAnagram {
	
	//runtime - 59ms
	public static boolean isAnagram(String s, String t) {
       
        if(s.length() != t.length())
        	return false;
		
		Map<Character, Integer> charCnt = new HashMap<Character, Integer>();
		int cnt = 1;
		
		for (int i=0; i<s.length(); i++) {
			if (charCnt.containsKey(s.charAt(i)))
				charCnt.put(s.charAt(i), cnt+charCnt.get(s.charAt(i)));
        	else
        		charCnt.put(s.charAt(i), cnt);
	    }
		
		for (int i=0; i<t.length(); i++) {
			if (charCnt.containsKey(t.charAt(i)))
				charCnt.replace(t.charAt(i), charCnt.get(t.charAt(i)) - 1);
		}
		
		for (int occurance : charCnt.values()) {
			if (occurance != 0)
				return false;
		}
		
		return true;
    }
	
	//Runtime - 8ms
	public static boolean isAnagram1(String s, String t) {
	       
        if(s.length() != t.length())
        	return false;
		
		int[] characters = new int[26];
		
		for(Character ch : s.toCharArray()) 
			characters[ch - 'a']++;
		
		for(Character ch: t.toCharArray()) {
			if (characters[ch-'a'] == 0) return false;
			characters[ch-'a']--;
		}
		
		return true;
    }
	
	
	public static void main(String args[]) {
		System.out.println(isAnagram1("a","b"));
	}
}
