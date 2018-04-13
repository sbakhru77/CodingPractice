package assignments;

//Code By: Sunila Bakhru

public class MinMaxNumber {

	//int num[] = {100, 201, 23, 500, 65};
	int num[] = {-20,-12,-5,-2,5};
	//int num[] = {5,5,5,5,5};
	
	public static void main(String args[]){
		
		MinMaxNumber minmax = new MinMaxNumber();
		MinMaxAPI mAPI = new MinMaxAPI();
		
		int min = mAPI.FindMin(minmax.num);
		int max = mAPI.FindMax(minmax.num);

		System.out.println("The minimum number is: "+min);
		System.out.println("The maximum number is: "+max);
	}
	
}
