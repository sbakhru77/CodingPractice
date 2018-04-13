import java.util.HashMap;
import java.util.Map;


public class Anagram {
	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "acer";
		
		//System.out.println(isAnagram(str1, str2));
	
		System.out.println(numNeeded("abc", "cde"));
	}
	

	public static boolean isAnagram(String a, String b) {
	    //assume that we are using ASCII
	    int[] charCnt = new int[256];
	    for(int i = 0; i < a.length(); i++){
	        charCnt[a.charAt(i)]++;
	    }
	    for(int i = 0; i< b.length(); i++){
	        charCnt[b.charAt(i)]--;
	    }
	    for(int i = 0; i<charCnt.length; i++){
	        if(charCnt[i] != 0) return false;
	    }
	    return true;
	}
	
	static boolean areAnagrams(CharSequence a, CharSequence b) {
	    int len = a.length();
	    if (len != b.length())
	        return false;

	    // collect char occurrences in "a"
	    Map<Character, Integer> occurrences = new HashMap<Character, Integer>(64);
	    for (int i = 0; i < len; i++)
	        //occurrences.merge(a.charAt(i), 1, Integer::sum);

	    // for each char in "b", look for matching occurrence
	    for (int j = 0; j < len; i++) {
	        char c = b.charAt(j);
	        int cc = occurrences.getOrDefault(c, 0);
	        if (cc == 0)                        
	            return false;            
	        occurrences.put(c, cc - 1);
	    }
	    return true;
	}
	
	public static int numNeeded(String first, String second) {
		int[] charcnt = new int[26];
		int count = 0;
		 for(int i=0; i<first.length(); i++) {
	            charcnt[first.charAt(i)-'a']++;
	        }
		 
		 for(int i=0; i<second.length(); i++) {
	            charcnt[second.charAt(i)-'a']--;
	        }
		 
		 for (int i : charcnt) {
			 count += Math.abs(i);
		 }
		 
		 return count;
	}
	
//	public static int numberNeeded(String first, String second) {
//        int[] charcnt = new int[256];
//        int cnt = 0;
//        
//        if (first.length() == 0 )
//            return second.length();
//        
//        if (second.length() == 0)
//        	return first.length();
//        
//        for(int i=0; i<first.length(); i++) {
//            charcnt[first.charAt(i)]++;
//        }
//        
//        for(int i=0; i<second.length(); i++) {
//            charcnt[second.charAt(i)]--;
//        }
//        
//        for(int j =0; j<charcnt.length; j++) {
//            if (charcnt[j] != 0)
//                cnt++;
//        }
//        
//        return cnt;
//    }

}