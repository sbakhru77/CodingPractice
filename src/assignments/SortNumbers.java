package assignments;

//Code By: Sunila Bakhru
//Assignment 1: Given an array of integers, sort the integer values.

//Sorting is implemented using bubble sort and selection sort.

public class SortNumbers {

	//private int num[] = {5, 3, 4, 1, 2};
	//private int num[] = {1, 2, 3, 4, 5};
	//private int num[] = {1, 1, 1, 1, 1};
	private int num[] = {23, 45, 31, 14, 5};
	//private int num[] = {11, -2, 33, -44, 5};
	
	public static void main(String[] args) {
		
		SortNumbers sort = new SortNumbers();
		
		//sort.selectionSort(sort.num);
		sort.bubbleSort(sort.num);
	}
	
	//finds min value and swaps with the value in first position 
	//continues for the remaining elements in the array
	public void selectionSort(int[] num){
		
		int temp;
		int min;
		int newArr[] = null;
		int index = 0;
		
		MinMaxAPI minAPI = new MinMaxAPI();
		
		for (int i = 0; i < num.length; i++)
		{
			newArr = new int[num.length-i];
			System.arraycopy(num, i, newArr, 0, num.length-i);
			
			min = minAPI.FindMin(newArr);

			index = minAPI.GetIndex();
			//index that is returned is based on the smaller subset of the array
			//to make it work correctly with the original big array add i to index
			index = index + i;
			
			//if index of smaller value is same as the current index of i, then no need to swap
			//as the number is at its correct position
			if (index != i) {
				temp = num[i];
				num[i] = min;
				num[index] = temp;
			}
		}
		
		System.out.println("The numbers in sorted order are: ");
		for (int i = 0; i<num.length; i++){
			System.out.println(num[i]);
		}
		
	}
	
	//checks two consecutive number and swaps the smaller of two to the left
	public void bubbleSort(int[] num){

		int temp;
		
		for (int i = 0; i < num.length; i++)
		{
			for (int j = 1; j<(num.length-i); j++)
			{
				if (num[j-1] > num[j])
				{
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			
			}
		}
		
		System.out.println("The numbers in sorted order are: ");
		for (int i = 0; i<num.length; i++){
			System.out.println(num[i]);
		}

	}

	public void quickSort(int[] num){
//		int median;
		for (int i =0; i<num.length ; i++){
			
		}
	}
}
