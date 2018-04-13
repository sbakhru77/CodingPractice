package DataStructureAndAlgo;

public class bubbleSortApp {
	public static void main(String[] args) {
		int maxitems = 100;
		orderedArray arr = new orderedArray(maxitems);
	
		arr.insert(10,true);
		arr.insert(7,true);
		arr.insert(22,true);
		arr.insert(99,true);
		arr.insert(55,true);
		arr.insert(44,true);
		arr.insert(35,true);
		arr.insert(100,true);
		arr.insert(2,true);
		
		arr.display();
		
		arr.bubbleSort();
		
		arr.display();
	}
}
