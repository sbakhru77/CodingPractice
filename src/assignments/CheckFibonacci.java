package assignments;

//Code By: Sunila Bakhru
//Assignment 5: Given an array of integers check the Fibonacci series.

public class CheckFibonacci {
	
	private int num[] = {0,1,1,2,3,5,8};
	//private int num[] = {0,1,1,2,4,5,8};
	
	public static void main(String args[]){
		
		CheckFibonacci fib = new CheckFibonacci();
		int first; 
		int second;
		int len = fib.num.length;
		boolean isFib = true;
		
		for(int i = 2; i<len; i++){
			first = fib.num[i-2];
			second = fib.num[i-1];
			
			if ((first + second)!= fib.num[i]){
				isFib = false;
				break;
			}			
		}
		
		if (isFib == true){
			System.out.println("The numbers in the array are in fibonacci series");
		}
		else
		{
			System.out.println("Not a fibonacci series");
		}
	}

}
