package assignments;

import java.util.*;

//Code By: Sunila Bakhru
//Assignment 6:  Given an array of integers check the Palindrome of the series.

//This program checks if the string entered is a palindrome or not.
//A Palindrome is a string that reads the same from forward or backward
//eg. racecar, eye, dad, mom, radar
public class Palindrome {

	public static void main (String args[]){
		
		Palindrome pObj = new Palindrome();
		
		boolean strResult = pObj.isPalindrome();
		
		int arr[] = {1,2,2,3,2,1};
		boolean intResult = pObj.isPalindrome(arr);
		
		if (strResult==true){
			System.out.println("The input string is a Palindrome");
		}
		else {
			System.out.println("The input string is not a Palindrome");
		}
		
		if (intResult==true){
			System.out.println("\nThe array of integers is a Palindrome");
		}
		else {
			System.out.println("\nThe array of integers is not a Palindrome");
		} 
	}
	
	boolean isPalindrome(int[] arr){
		int len = arr.length;
		boolean isPalindrome = true;

		if (len == 1){
			isPalindrome = true;
		}
		else {
			int j = len-1;
			for (int i=0;i<j;i++){
				if (arr[i]!=arr[j]){
					isPalindrome = false;
					break;
				}
				j--;
			}
		}	
		return isPalindrome;
	}
	
	boolean isPalindrome(){
		System.out.println("Please enter a string to check if it is a Palindrome: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toUpperCase().trim();
		
		int len = str.length();
		boolean isPalindrome = true;
		int i = 0;
		int j = len-1;
		
		if (len == 1){
			isPalindrome = true;
		}
		else {
			while (j>i){
				if (str.charAt(i)!=str.charAt(j)){
					isPalindrome = false;
					break;
				}
				i++;
				j--;
			}
		}
		return isPalindrome;
	}
}
