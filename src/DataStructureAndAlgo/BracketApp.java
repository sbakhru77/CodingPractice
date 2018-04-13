package DataStructureAndAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {
	public static void main(String args[]) throws IOException {
		String input;
		
		System.out.print("Please enter a string with brackets: ");
		System.out.flush();
		
		input = getString();
		
		BracketChecker bc = new BracketChecker(input);
		
		bc.check();
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		return s;
	}
}
