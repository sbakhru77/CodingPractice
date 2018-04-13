package crachCode;

import java.util.Arrays;
import java.util.HashMap;

// Check if given two strings are anagrams
// 1. Sort the two strings and compare them for equality
// 2. Count number of chars in one string and subtract no of chars from another string. If the Map is left with 0 count of chars then it is anagram
public class CompareString {
	
	public static boolean checkAnagramSort(String a, String b) {
		char[] aArr = a.toLowerCase().toCharArray();
		char[] bArr = b.toLowerCase().toCharArray();
		
		Arrays.sort(aArr);
		Arrays.sort(bArr);
		
		System.out.println(String.valueOf(aArr));
		System.out.println(String.valueOf(bArr));
		
		if (String.valueOf(aArr).equals(String.valueOf(bArr))) return true;
		
		return false;
	}
	
	public static boolean checkAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		Boolean isAnagram = false;

		if (a == null || b == null) {
			return false;
		}

		if (a.length() != b.length()) {
			return false;
		}

		HashMap<Character, Integer> charCnt = new HashMap<Character, Integer>();

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			Integer cnt = charCnt.containsKey(ch) ? charCnt.get(ch) : 0;

			if (cnt == 0 || cnt == null) {
				charCnt.put(ch, 1);
			} else
				charCnt.put(ch, ++cnt);
		}

		for (int j = 0; j < b.length(); j++) {
			char ch = b.charAt(j);
			Integer cnt = charCnt.containsKey(ch) ? charCnt.get(ch) : 0;

			if (cnt > 0) {
				charCnt.put(ch, --cnt);
			}
		}

		for (Integer occurance : charCnt.values()) {
			if (occurance == null || occurance == 0) {
				isAnagram = true;
			} else
				isAnagram = false;
		}

		return isAnagram;

	}

	public static void main(String args[]) {
		String val = checkAnagram("Robinn", "Ninbor") ? "Anagrams" : "Not Anagrams";
		System.out.println("Robinn and NinBor are --- " + val);

		String val1 = checkAnagram("ra","c") ? "Anagrams" : "Not Anagrams";
		System.out.println("ra and c are -- " + val1);
		
		String val2 = checkAnagram("","") ? "Anagrams" : "Not Anagrams";
		System.out.println("empty strings are -- " + val2);
		
	}
}
