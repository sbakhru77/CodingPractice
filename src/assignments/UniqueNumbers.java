package assignments;

//Code By: Sunila Bakhru
//Assignment 4: Print the unique numbers and also print the number of occurrences of duplicate numbers.

public class UniqueNumbers {
	
	public static void main(String[] args) {
		//int num[] = {4,11,5,8,6,8,4};
		int num[] = {4,4,11,11,5,8,6,8,-4};
		
		int len = num.length;
		boolean uniq;
		int count;
		String notDup="";
		
		for(int i=0; i<len; i++){
			uniq = true;
			count = 1;
			
			for(int j=i+1;j<len;j++){
					if ((num[i] == num[j])){
						uniq = false;
						count++;
					}
			}
	
			if (uniq==true){
				notDup = num[i] + " " + notDup;
			}
			else{
				System.out.println("The number "+num[i]+" exists "+count+" times");
				
			}
			
		}
		System.out.println("Unique numbers are: "+notDup);
	}

}
