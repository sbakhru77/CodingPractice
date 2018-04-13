package assignments;

//Code By: Sunila Bakhru
//Assignment 3: Given an array of integers move all even numbers to the beginning of the array.

public class EvenNumber {

	private int num[] = {12,11,5,6,2,4,7,8};
	//private int num[] = {7,11,5,23,19,8,6,2,4};
	//private int num[] = {11,11,11,11,11,11};
	//private int num[] = {12,12,12,6,2,4};
	
	public static void main(String args[]){
		
		int oddNum;
		int evenNum;
		
		EvenNumber evenObj = new EvenNumber();
	
		int arrLen = evenObj.num.length;
		int j = arrLen - 1 ;
	
		//The first odd number found is swapped with the first even at the end of the array
		//The array progresses forward and backward and it stops when they crossover
		for (int i = 0; i<j; i++)
		{
			if (evenObj.num[i] % 2 != 0){
				
			//	if (i != j){
					
					oddNum = evenObj.num[i];
					
					while ( j > i){
						if (evenObj.num[j] % 2 == 0){
							evenNum = evenObj.num[j];
							
							evenObj.num[i] = evenNum;
							evenObj.num[j] = oddNum;
							j--;
							break;
						}
						j--;
				//	}
				}
			}
		}
		
		System.out.println("The new formated array with even numbers at front is: ");
		for (int i = 0; i<arrLen; i++){
			System.out.println(evenObj.num[i]);
		}
		
	}
}
