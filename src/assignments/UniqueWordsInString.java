package assignments;

//import java.util.regex.*;

//Code By: Sunila Bakhru
//Assignment 7:  Given a string print the unique words of the string.

public class UniqueWordsInString {

	private String str = "This is is is a statement with unique words";
	
	public String getString(){
		return str;
	}
	
	public static void main(String[] args) {
		UniqueWordsInString uniqStrObj = new UniqueWordsInString();

		//Split the string
		String strArr[] = uniqStrObj.splitString(uniqStrObj.str);
		
		//find if the words are unique
		String uniqWords[] = uniqStrObj.findUnique(strArr);
		
		System.out.println(uniqStrObj.getString());

		System.out.println("\nThe unique words in the above statement are: ");
		for(int i = 0; i<uniqWords.length; i++){
			System.out.println(uniqWords[i]);
		}
	}

	public String[] splitString(String str){
		String strArr[] = str.split(" ");
	
		return strArr;
	}
	
	public String[] findUnique(String[] str){
		boolean isUniqWord;
		String uniqWords[] = new String[str.length];
		int k = 0;
		
		for (int i=0; i<str.length; i++) {
			isUniqWord = true;
			int j = i+1;
			
			while(j<str.length-i) {
				if (str[i].equals(str[j])) {
					isUniqWord = false;
					break;
				}
				 j++;
			}
			
			if (isUniqWord) {
				uniqWords[k] = str[i];
				k++;
			}
		}
		return uniqWords;
	}

}
