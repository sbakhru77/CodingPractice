package assignments;

/* to read a file and find the duplicate characters in it */

import java.io.*;
import java.util.ArrayList;


public class DuplicateCharsInFile {
	private static String charFile = "C:\\Users\\Sunila\\workspace\\BSSWBQAWork\\src\\charFile.txt";

	public static void main(String args[]) {
		
		ArrayList<Character> chars = new ArrayList<Character>();
		
		try {
			FileInputStream fileObj = new FileInputStream(charFile);
			//DataInputStream dataObj = new DataInputStream(fileObj);
			
			Reader reader = new InputStreamReader(fileObj);
			int r;
			char ch;
			while((r = reader.read()) != -1) {
				ch = (char) r;
				chars.add(ch);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File charFile not found");
			e.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		Character[] characters = new Character[chars.size()];
		characters = chars.toArray(characters);
		
		for(char i: characters){
			System.out.println(i);
		}
		
		findDuplicate(characters);
	
	}
	
	public static void findDuplicate(Character ch[]){
		//boolean duplicate = false;
		//String dupChars;
		
		for(int i = 0; i < ch.length; i++) {
			for(int j = i+1; j < ch.length; j++) {
				if (ch[i].equals(ch[j])) {
					//duplicate = true;
					System.out.println("Char "+ch[i]+ " is a duplicate.");
				}
			}
		}
	}
}
