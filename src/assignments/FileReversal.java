package assignments;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

//Code By: Sunila Bakhru
//Assignment 10: Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

public class FileReversal {

	private String dataFile = "C:\\Users\\Sunila\\workspace\\BSSWBQAWork\\src\\File.txt";
	private String outFile = "C:\\Users\\Sunila\\workspace\\BSSWBQAWork\\src\\outFile.txt";
	ArrayList<String> lines = new ArrayList<String>();
	
	public static void main(String[] args){
		
		FileReversal frObj = new FileReversal();
		String[] line = new String[frObj.lines.size()];
		
		File file = new File(frObj.dataFile);
		frObj.ReadFile(file);
		
		line = frObj.lines.toArray(line);
		File oFile = new File(frObj.outFile);
		
		frObj.WriteFile(oFile,line);
			
	}
	
	//Reads the file "File.txt" and adds the contents in an array list
	//The array list is converted to an array and passed to WriteFile method
	public void ReadFile(File file){
		
		try{
			Scanner scan = new Scanner(file);
			//String line;
			
			while(scan.hasNextLine()){
				lines.add(scan.nextLine());
				
			}
			scan.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File.txt cannot be found");
			e.printStackTrace();
		}
	}
	
	// This method creates a new file outFile.txt and writes the contents on the array in reverse order
	// "\n" does not show a newline in notepad. 
	// Open the file "outFile.txt" using other editor to check file in reverse with newline included
	public void WriteFile(File oFile, String[] line){
		try {
			//BufferedWriter fileWriter = new BufferedWriter(new FileWriter(frObj.outFile));
			FileWriter fileWriter = new FileWriter(oFile);
			int len = line.length - 1;
			
			while(len>=0) {
				System.out.println(line[len]);
				fileWriter.write(line[len]);
				fileWriter.write("\n");
				fileWriter.flush();
				len--;
			}
			fileWriter.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
}
 