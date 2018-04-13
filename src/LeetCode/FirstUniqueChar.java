package LeetCode;

import java.util.HashMap;
import java.util.Map;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

class IndexOccurance {
	int index;
	int count;
	
	public IndexOccurance(int index) {
		this.index = index;
		this.count = 1;
	}
	
	public void incOccurance() {
		this.count++;
	}
}

public class FirstUniqueChar {
	
	public int firstUniqChar(String s) {
        Map<Character, IndexOccurance> charCnt = new HashMap<Character, IndexOccurance>(256);
        
        for(int i=0; i<s.length(); i++) {
        	if (charCnt.containsKey(s.charAt(i)))
        		charCnt.get(s.charAt(i)).incOccurance();
        	else
        		charCnt.put(s.charAt(i), new IndexOccurance(i));
        }
        
        for (Character ch: s.toCharArray()) {
        	if (charCnt.get(ch).count == 1)
        		return charCnt.get(ch).index;
        }
        
        return -1;
    }
	
	public static void main(String args[]) {
		
	}
}
