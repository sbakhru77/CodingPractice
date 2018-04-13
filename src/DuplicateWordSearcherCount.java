import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateWordSearcherCount {

	public static void main(String[] args) {
		String str = "aaabbbbcccaa";
		
		//buildFrequencyMap(str);
		String newStr = countChars(str);
		System.out.println("String =======" + newStr);
	}

//	private static void buildFrequencyMap(String s) {
//		List<String> list = Arrays.asList(s.split(""));
//		Collections.sort(list);
//
//		Set<String> uniquewords = new HashSet<String>(list);
//		for (String words : uniquewords) {
//			System.out.println(words + ":" + Collections.frequency(list, words));
//		}
//	}
	
	
	
//	String str = "aaaddbbbcccaa"
//			a5d2b3c3
//
			static String countChars(String s) {
			   if (s == null || s.length() == 0) return "";
			   Map<Character, Integer> map = buildFrequencyMap(s);
			   StringBuilder sb = new StringBuilder();
			   for (Character c : map.keySet()) {
			       sb.append(c); sb.append(map.get(c));
			   }
			   return sb.toString();  
			}
			   
			static Map<Character, Integer> buildFrequencyMap(String s) {
			   Map<Character, Integer> map = new HashMap<Character, Integer>();
			   for (int i = 0; i < s.length(); i++) {
			     Integer n = map.get(s.charAt(i));
//			     if (n != null) map.put(s.charAt(i), n+1);
//			     else map.put(s.charAt(i), 1);
			     
			     if (n == null) n = 0;
			     map.put(s.charAt(i), n+1);
			   }
			   return map;
			}

}


