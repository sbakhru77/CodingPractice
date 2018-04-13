package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunningMedian {
	
	public static Double getMedianFromSortedList(ArrayList<Double> list) {
				
		if (list.size() == 1)
			return list.get(0);
		
		Double median = 0.0;
		
		if (list.size() % 2 == 0)
			median = (list.get(list.size()/2) + list.get(list.size()/2 - 1)) / 2;
		else
			median = list.get((list.size()-1)/2);
		
		return median;
	}
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        ArrayList<Double> a = new ArrayList<Double>();
        
        while(n>0) {
            a.add((double) in.nextInt());
            Collections.sort(a);
            System.out.println(getMedianFromSortedList(a));
            n--;
        }
    }
}
