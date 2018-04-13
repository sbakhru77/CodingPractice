package HackerRank;

import java.util.HashMap;

/**
 * @author sbakhru
 * There is a collection of N strings ( There can be multiple occurances of a particular string ).
 * There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of N strings.
 * Input Format:
 * String ["aba","baba","aba","xzxb"]
 * query ["aba", "xzxb", "ab"]
 */ 
    
public class SparseArray {

	public static void findQueryCount(String input[], String query[]) {
		HashMap<String, Integer> qryCnt = new HashMap<String, Integer>();
		
		if (input != null && input.length >= 1) {
			for (String in : input) {
				int cnt = 1;
				if (qryCnt.containsKey(in)) 
					qryCnt.replace(in, cnt+1);
				else
					qryCnt.put(in, cnt);
			}
		}
		
		if (query != null && query.length >= 1) {
			for (String qy : query) {
				if (qryCnt.containsKey(qy))
					System.out.println(qryCnt.get(qy));
				else
					System.out.println("0");
	
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		String[] input = {"aba","baba","aba","xzxb"};
		String[] query = {"aba", "xzxb", "ab", "baba"};
		//String[] query = {};
		//String[] query = null;
		
		findQueryCount(input, query);
	}
}
