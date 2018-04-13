package assignments;

//Code By: Sunila Bakhru
//Assignment 8: Given a string print the reverse of the string.

//The words of the string are reversed from last to first word
//If the string contains only one word, then the word is reversed from last char to first char
public class ReverseString {

	private String str = "This is the string we want to reverse";
	
	public String getString(){
		return str;
	}
	
	public static void main(String[] args) {
		ReverseString revStrObj = new ReverseString();
		ReverseAPI revAPIObj = new ReverseAPI();
		String reverseStr;
		
		String originalStr = revStrObj.getString();
		String[] strArray = revAPIObj.splitString(originalStr);
		
		if (strArray.length==1) {
			reverseStr = revAPIObj.reverseWord(originalStr);
		}
		else {	
			String[] revStrArray = revStrObj.Reverse(strArray);
			reverseStr = revAPIObj.joinString(revStrArray);			
		}
		
		System.out.println("The original string: \"" + originalStr + "\" in reverse order is: \""
				+reverseStr+"\"");

	}

	public String[] Reverse(String[] str){
		
		int first = 0;
		int last = str.length - 1;
		String temp;
		
		while(last>first){
			temp = str[first];
			str[first] = str[last];
			str[last] = temp;
			
			first++;
			last--;
		}
		
		return str;
	}
	
}
