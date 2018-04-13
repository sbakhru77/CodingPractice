package assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Sort the characters without moving the $sign
public class SortCharWithSpecialChar {
	public static void main(String args[]) {
		String[] inputString = {"a","%c","e","$b","d","h","*f"};
		
		Map<Integer, Character> splCharMap = new HashMap<Integer, Character>();
		
		for(int i=0; i<inputString.length; i++) {
			if (inputString[i].length() > 1) {
				splCharMap.put(i, inputString[i].charAt(0));
				inputString[i] = String.valueOf(inputString[i].charAt(1));
			}
		}
		
		Arrays.sort(inputString);
		
		for (Integer key: splCharMap.keySet()) {
			inputString[key] = splCharMap.get(key) + inputString[key];
		}
		
		System.out.println("Sorted char array: " + Arrays.toString(inputString));
	}
	
}
