package assignments;

//Code By: Sunila Bakhru
//Assignment 9: Given a string print the string in same flow, but reversing each word of it.

public class ReverseWordofString {
	private String str = "This is the string whose each word is to be reversed";
	
	public String getString(){
		return str;
	}
	
	public static void main(String[] args){
		ReverseWordofString revObj = new ReverseWordofString();
		ReverseAPI revApiObj = new ReverseAPI();
	
		String originalStr = revObj.getString();
		
		String[] splitStr = revApiObj.splitString(originalStr);
		
		String newStr[] = new String[splitStr.length];
		String revStr;
		
		
		for (int i=0; i<splitStr.length; i++) {
			newStr[i] = revApiObj.reverseWord(splitStr[i]);
		}
		
		revStr = revApiObj.joinString(newStr);
		
		System.out.println("The new reversed word string is: \n"+revStr);
	}
}
