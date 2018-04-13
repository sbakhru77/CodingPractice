package crachCode;

public class UniqueCharsInString {
//Implement an algorithm to determine if a string has all unique characters.What if you
//	can not use additional data structures?
	
	//if ASCII chars used then this approach can be used
	
	public static boolean isUnique(String str) {
		boolean[] char_set = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			
			System.out.println("value of char_set " + char_set[val]);
			
			if (char_set[val]) return false;
			char_set[val] = true;			
		}
		return true;
	}
	
	
	// compare each char with all the other chars in the string. When the first match is found return false.
	// check the expected behavior if the string length is 0 or null
	// Also check if lower and upper case chars are considered unique or not
	public static boolean isUnique2(String str) {
		
		boolean isUniq = false;
		
		if (str == null || str.length() == 0 || str.length() == 1) {
			isUniq = true;
		}
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) {
			char firstval = str.charAt(i);
			
			for (int j=i+1; j<str.length(); j++) {
				char secondval = str.charAt(j);
				
				if (firstval == secondval) {
					return false;
				}
				
				isUniq = true;
			}
		}
		
		return isUniq;
	}
	
	//remove duplicates from the string
	public static String removeDuplicate(String str) {
		
		if (str.length() == 0 || str == null || str.length() == 1) {
			return str;
		}
		
		boolean seen[] = new boolean[256];
		
		StringBuffer strBuf = new StringBuffer(seen.length);
		
		if (str.length() > 1) {
			str = str.toLowerCase();
			
			for(int i=0; i<str.length(); i++) {
				if(!seen[str.charAt(i)]) {	
					seen[str.charAt(i)] = true;
					strBuf.append(str.charAt(i));
				}
			}			
		}
		
		return strBuf.toString();
		
	}
	
	public static void main(String args[]) {
		String[] words = {"","a","efgh","eEfg","aaabbb","ababab","--+&$","12365445678999000"};
		
		for (String word: words) {
			System.out.println("Does " + word + " has unique chars : " + isUnique(word));
			System.out.println("The unique string is ---- " + removeDuplicate(word));
		}
	}
}
