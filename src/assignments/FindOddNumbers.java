package assignments;
import java.util.Scanner;

//Code By: Sunila Bakhru
//Assignment 2:  Given an array of integers, print only odd numbers.

public class FindOddNumbers {

	public static void main(String args[]) {
		
		int[] numArray = new int[10]; 
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<10; i++){
			System.out.println("Enter a number: ");
			numArray[i] = scan.nextInt();
		}	
		
		System.out.println("The odd numbers are: ");
		
		for (int i = 0; i<numArray.length; i++)
		{
			if (numArray[i] % 2 != 0)
			{
				System.out.println(numArray[i] + " ");
			}
		}
		
	}//End of main method
	
}//End of the class
