package assignments;

////Code By: Sunila Bakhru

public class ReverseAPI {

	public String[] splitString(String str){

		String strArr[] = str.split(" ");
	
		return strArr;
	}

	public String joinString(String[] str){
		String revStr = "";
		StringBuilder sb = new StringBuilder(str.length);
		
		for (int i=0; i<str.length; i++){
			sb = sb.append(str[i]).append(" ");
		}
		
		revStr = sb.toString().trim();
		
		return revStr;
	}
	
	public String reverseWord(String str){
		int firstChar = 0;
		int lastChar = str.length()-1;
		char[] rev = new char[str.length()];
		
		while (lastChar > firstChar) {
			rev[firstChar] = str.charAt(lastChar);
			rev[lastChar] = str.charAt(firstChar);
			
			firstChar++;
			lastChar--;
		}
		
		if (lastChar == firstChar){
			rev[firstChar] = str.charAt(firstChar);
		}
		
		String revWord = new String(rev);
		return revWord;
	}

}
