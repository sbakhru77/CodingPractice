package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class JewelsInStone {
	public static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        int numjewels = 0;
        int jlen = J.length();
        int j = 0;
        
        if (jlen == 0)
        	return 0;
        
        for(int i=0; i<S.length(); i++) {
        	
        	if (charMap.containsKey(S.charAt(i)))
        		charMap.put(S.charAt(i), charMap.get(S.charAt(i)) + 1);
        	else
        		charMap.put(S.charAt(i), 1);
        	
        }
        
        while (jlen > 0) {
    		if (charMap.containsKey(J.charAt(j)))
    			numjewels += charMap.get(J.charAt(j));
    		
    		jlen--;
    		j++;
    	}
        
        return numjewels;
    }
	
	public static void main(String args[]) {
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
		System.out.println(numJewelsInStones("z","ZZ"));
	}
}
