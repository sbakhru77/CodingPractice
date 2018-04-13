package DataStructureAndAlgo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/*
 * 
 * We consider a binary string (i.e., a string consisting of 0's and 1's) to be magical if it satisfies the following constraints:
	It starts with the character 1.
	The string contains at least two 0's.
	The string contains an even number of 0's.
	For example, 1010001 is magical, but 01000 and 1000 are not.
	
	Sample Input
		5
		1001
		11000
		0101
		1010
		1111
	Sample Output
		True
		False
		False
		True
		False
 * 
 * 
 */

public class MagicalBinaryString {
    final static Scanner scan = new Scanner(System.in);
    final static String fileName = System.getenv("OUTPUT_PATH");
        /*
     * Write the regular expression in the blank space below
     */
    final static String regularExpression = "^1(1*01*01*)*$";//^1(?:[^0]*0[^0]*0)*
        public static void main(String[] args) throws IOException {
        int query = Integer.parseInt(scan.nextLine());
        String[] result = new String[query];
        Arrays.fill(result, "False");
        
        for (int i = 0; i < query; i++) {
            String someString = scan.nextLine();
            
            if (someString.matches(regularExpression)) {
                result[i] = "True";
            }
        }
        
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
        for (String res: result) {
            fileOut.write(res + "\n");
        }
        
        fileOut.close();
    }
}
