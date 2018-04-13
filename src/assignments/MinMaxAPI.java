package assignments;

//Code By: Sunila Bakhru

public class MinMaxAPI {
	private int min;
	private int max;
	private int index;
	
	public int FindMin(int[] numarr)
	{
		min = numarr[0];
		index = 0;
		
		for (int i=1; i<numarr.length; i++){
			
			if (min > numarr[i]) 
			{
				min = numarr[i];
				SetIndex(i);
			}
		}
		return min;
	}
	
	private void SetIndex(int i){
		index = i;
	}
	
	public int GetIndex(){
		return index;
	}
	
	
	public int FindMax(int[] numarr)
	{
		max = numarr[0];

		for (int i=1; i<numarr.length; i++){
			
			if (max < numarr[i]) 
			{
				max = numarr[i];
			}
		}

		return max;

	}
	
}
